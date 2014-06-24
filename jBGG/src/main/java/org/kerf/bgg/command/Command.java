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

package org.kerf.bgg.command;

import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.Map.Entry;
import java.util.Properties;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import org.apache.commons.io.IOUtils;
import org.apache.log4j.Logger;
import org.kerf.bgg.exception.CommandExecutionException;

abstract public class Command {
   static private Logger logger = Logger.getLogger(Command.class);

   protected static final String API_URL = "http://www.boardgamegeek.com/xmlapi2/";

   protected String command = "";
   protected Properties parameters = new Properties();

   protected String addProperties() {
      String retval = "";

      for (Entry<Object, Object> currParameter : parameters.entrySet()) {
         String key = (String) currParameter.getKey();
         String value = (String) currParameter.getValue();

         if (value != null) {
            retval += key + "=" + value + "&";
         }
      }

      return retval;
   }

   protected String convertBoolean(Boolean b) {
      return b ? "1" : "0";
   }

   @SuppressWarnings("unchecked")
   public <T> T execute() throws CommandExecutionException {
      try {
         String commandLocation = API_URL + URLEncoder.encode(command + "?" + addProperties());

         logger.debug("Command URL: " + commandLocation);
         URL commandUrl = new URL(commandLocation);
         URLConnection connection = commandUrl.openConnection();

         if (connection instanceof HttpURLConnection) {
            HttpURLConnection httpConnection = null;
            int responseCode = 0;
            
            do {
               httpConnection = (HttpURLConnection)commandUrl.openConnection();
               responseCode = httpConnection.getResponseCode();
               logger.debug("Response: " + responseCode + ": " + httpConnection.getResponseMessage());
               Thread.sleep(5000);
            } while(responseCode == 202);
         }

         String xml = IOUtils.toString(connection.getInputStream());

         JAXBContext context = JAXBContext.newInstance(getReturnType(), org.kerf.bgg.jaxb.Error.class);
         Unmarshaller unmarshaller = context.createUnmarshaller();

         logger.debug("RESULT: " + xml);
         Object result = unmarshaller.unmarshal(new StringReader(xml));
         if (result instanceof org.kerf.bgg.jaxb.Error) {
            org.kerf.bgg.jaxb.Error error = (org.kerf.bgg.jaxb.Error) result;
            throw new CommandExecutionException(error.getMessage());
         } else {
            return (T) result; // This is an unchecked cast, but an error would
                               // have been thrown while unmarshalling if it was
                               // illegal
         }
      } catch (Exception e) {
         logger.error(e.getMessage());
         throw new CommandExecutionException("There was an issue executing the command", e);
      }
   }

   abstract protected Class<?> getReturnType();

}
