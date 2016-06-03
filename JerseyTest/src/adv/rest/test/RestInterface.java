package adv.rest.test;

import java.io.IOException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

import de.hrw.advswen.project4.sights.yelp.BusinessDao;
import de.hrw.advswen.project4.sights.yelp.YelpSearch;

@Path("/jsonServices")
public class RestInterface {
	@GET
	@Path("/getBusinessDao")
	@Produces(MediaType.APPLICATION_JSON)

	public BusinessDao produceBusinessDao() throws JsonParseException, JsonMappingException, IOException{
		
		BusinessDao businessDao;
		
		YelpSearch yelpSearch = new YelpSearch();
		   yelpSearch.authorizeYelp();
		businessDao = yelpSearch.searchYelp2();
		
		
		
		return businessDao;
		
	}
}
