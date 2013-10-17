package org.kerf.bgg.jaxb.adapter;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class ArticleDateAdapter extends XmlAdapter<String, Date> {

   private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ"); // 2011-08-16T10:47:08-05:00

   @Override
   public String marshal(Date v) throws Exception {
      return dateFormat.format(v);
   }

   @Override
   public Date unmarshal(String v) throws Exception {
      v = v.substring(0, v.lastIndexOf(":")) + v.substring(v.lastIndexOf(":") + 1); // Java 6 SimpleDateFormat doesn't understand a colon in the timezone
      return dateFormat.parse(v);
   }

}