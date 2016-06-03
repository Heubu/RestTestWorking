package de.hrw.advswen.project4.sights.yelp;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

public class Runner {


	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {

		
	   YelpSearch yelpSearch = new YelpSearch();
	   yelpSearch.authorizeYelp();
	   yelpSearch.searchYelp2();
	  }

}
