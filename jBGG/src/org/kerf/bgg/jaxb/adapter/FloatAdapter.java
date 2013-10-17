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
		
		if(f == -1.0f) {
			retval = "N/A";
		}
		else {
			retval = f.toString();
		}
		return retval;
	}

	@Override
	public Float unmarshal(String s) throws Exception {
		Float retval;
		
		if(s.equals("N/A")) {
			retval = -1.0f;
		}
		else {
			retval = Float.parseFloat(s);
		}
		
		return retval;
	}

}
