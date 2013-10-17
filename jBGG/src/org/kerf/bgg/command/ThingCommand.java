package org.kerf.bgg.command;

import java.util.List;

import org.kerf.bgg.jaxb.Items;

/*

id=NNN    Specifies the id of the thing(s) to retrieve. To request multiple things with a single query, NNN can specify a comma-delimited list of ids.
type=THINGTYPE  Specifies that, regardless of the type of thing asked for by id, the results are filtered by the THINGTYPE(s) specified. Multiple THINGTYPEs can be specified in a comma-delimited list.
versions=1   Returns version info for the item.
videos = 1   Returns videos for the item.
stats=1   Returns ranking and rating stats for the item.
historical=1    Returns historical data over time. See page parameter.
marketplace=1   Returns marketplace data.
comments=1   Returns all comments about the item. Also includes ratings when commented. See page parameter.
ratingcomments=1   Returns all ratings for the item. Also includes comments when rated. See page parameter. The ratingcomments and comments parameters cannot be used together, as the output always appears in the <comments> node of the XML; comments parameter takes precedence if both are specified. Ratings are sorted in descending rating value, based on the highest rating they have assigned to that item (each item in the collection can have a different rating).
page=NNN  Defaults to 1, controls the page of data to see for historical info, comments, and ratings data.
pagesize=NNN    Set the number of records to return in paging. Minimum is 10, maximum is 100.
from=YYYY-MM-DD   Not currently supported.
to=YYYY-MM-DD  Not currently supported.

 */
public class ThingCommand extends Command {

   public ThingCommand(String id) {
      command = "thing";
      
      parameters.put("id", id);
   }
   
   public ThingCommand(List<String> ids) {
      String idList = "";
      
      for(String currId : ids) {
         idList += currId + ",";
      }
      
      parameters.put("id", idList);
   }

   @Override
   protected Class getReturnType() {
      return Items.class;
   }

}
