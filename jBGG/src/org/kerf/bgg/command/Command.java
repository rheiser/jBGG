package org.kerf.bgg.command;

import java.io.IOException;
import java.io.StringReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map.Entry;
import java.util.Properties;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.ValidationEvent;
import javax.xml.bind.ValidationEventHandler;

import org.apache.commons.io.IOUtils;

abstract public class Command {

	protected static final String API_URL = "http://www.boardgamegeek.com/xmlapi2/";

	protected String command = "";
	protected Properties parameters = new Properties();

	public <T> T execute() throws IOException, JAXBException {
		String commandLocation = API_URL + command + "?";
		commandLocation += addProperties();

		URL commandUrl = new URL(commandLocation);
		URLConnection connection = commandUrl.openConnection();
		String xml = IOUtils.toString(connection.getInputStream());
		JAXBContext context = JAXBContext.newInstance(getReturnType());
		Unmarshaller unmarshaller = context.createUnmarshaller();
		unmarshaller.setEventHandler(new ValidationEventHandler() {

         public boolean handleEvent(ValidationEvent event) {
            System.out.println(event.getMessage() + " " + event.getLocator().getLineNumber() + "/" + event.getLocator().getColumnNumber());
            
            
            
            return true;
         }
		   
		});

		System.out.println("URL: " + commandLocation);
		System.out.println("RESULT: " + xml);
		return (T) unmarshaller.unmarshal(new StringReader(xml));
	}

	protected String convertBoolean(Boolean b) {
		return b ? "1" : "0";
	}
	
	protected String addProperties() {
	   String retval = "";
	   
		for(Entry<Object, Object> currParameter : parameters.entrySet()) {
			String key = (String)currParameter.getKey();
			String value = (String) currParameter.getValue();
			
			if(value != null) {
				retval += key + "=" + value + "&";
			}
		}
		
		return retval;
	}

	abstract protected Class getReturnType();

}
