/**
   Copyright 2013 Rob Heiser

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.

*/

package org.kerf.bgg.jaxb.adapter;

import javax.xml.bind.annotation.adapters.XmlAdapter;

/*
 * BoardGameGeek uses floats to store a user's rating of the game. 
 * However, if the user hasn't rated the game, it's stored as the string "N/A", which
 * isn't converted to a Float using the standard JAXB conversion. This takes care
 * of this issue. The jBGG library uses -1.0f to indicate an unrated game.
 */
public class FloatAdapter extends XmlAdapter<String, Float> {

   @Override
   public String marshal(Float f) throws Exception {
      String retval = "";

      if (f == -1.0f) {
         retval = "N/A";
      } else {
         retval = f.toString();
      }
      return retval;
   }

   @Override
   public Float unmarshal(String s) throws Exception {
      Float retval;

      if (s.equals("N/A")) {
         retval = -1.0f;
      } else {
         retval = Float.parseFloat(s);
      }

      return retval;
   }

}
