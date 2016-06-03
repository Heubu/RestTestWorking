/**
 * 
 */
package de.hrw.advswen.project4.sights.googleplaces;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

/**
 * @author Daniel Heubusch
 *
 */
public class Runner {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws JsonMappingException 
	 * @throws JsonParseException 
	 */
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {

		SightSeeingGooglePlaces places = new SightSeeingGooglePlaces();
		places.buildConnection();
		
	}

}
