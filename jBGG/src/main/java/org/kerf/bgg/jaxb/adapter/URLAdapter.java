package org.kerf.bgg.jaxb.adapter;

import java.net.URL;

import javax.xml.bind.annotation.adapters.XmlAdapter;


public class URLAdapter extends XmlAdapter<String, URL>{

   @Override
   public String marshal(URL url) throws Exception {
      return url.toString();
   }

   @Override
   public URL unmarshal(String urlString) throws Exception {
      if(urlString == null || urlString.equals("")) {
         urlString = "http://";
      }
      
      return new URL(urlString);
   }

}
