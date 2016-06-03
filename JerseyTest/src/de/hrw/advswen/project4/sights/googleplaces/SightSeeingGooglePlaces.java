package de.hrw.advswen.project4.sights.googleplaces;


import java.io.IOException;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import org.json.JSONObject;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class SightSeeingGooglePlaces {

	private static WebTarget webTarget;
	final static String GOOGLE_API_KEY = "AIzaSyC6mGC2Me907UfXvWt4Q-JgRDqTpOfeAGE";
	final static String PLACES_URI_BASE = "https://maps.googleapis.com/maps/api/place/textsearch/json?";
	private static String PLACE = "Ravensburg";
	private static String RESTAURANTS = "museum";

	public void buildConnection() throws IOException{

		Client client = ClientBuilder.newClient();
		webTarget = client.target(PLACES_URI_BASE).queryParam("query", PLACE).queryParam("types", RESTAURANTS)
				.queryParam("key", GOOGLE_API_KEY);
		Response response = webTarget.request().get();
		
		ObjectMapper mapper = new ObjectMapper();

		String jsonResponse = response.readEntity(String.class);

		// businessesJsonArray = (JSONArray) tbusinessObject.get("businesses");
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

		Restaurant restaurant = mapper.readValue(jsonResponse, Restaurant.class);

		for (Results result : restaurant.getResults()) {
			System.out.println(result.getName());
		}
		
	}
}

