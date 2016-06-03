package de.hrw.advswen.project4.sights.yelp;

import java.io.IOException;
import org.json.JSONArray;
import org.scribe.builder.ServiceBuilder;
import org.scribe.model.OAuthRequest;
import org.scribe.model.Response;
import org.scribe.model.Token;
import org.scribe.model.Verb;
import org.scribe.oauth.OAuthService;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class YelpSearch {

	private static final String BASE_URI = "http://api.yelp.com/v2/search";
	private static final String TERM = "restaurant";
	private static final String SORT_BY = "2";
	private static final String SEARCH_LIMIT = "4";
	private static final String LOCATION = "Ravensburg, Baden-Württemberg";

	private static final String CONSUMER_KEY = "AljB7odaYEfO3mLllsaRcg";
	private static final String CONSUMER_SECRET = "rqCDf85rhvTkbhsQzbcdNhWBZz4";
	private static final String TOKEN = "afTH54IoUzPIgqiwd55RBMc--VcmFjZd";
	private static final String TOKEN_SECRET = "fPck-mwNsNGg-xQhnbejPmskrOg";

	OAuthService service;
	Token accessToken;
	JSONArray businessesJsonArray;
	ObjectMapper mapper = new ObjectMapper();

	public void authorizeYelp() {
		service = new ServiceBuilder().provider(TwoStepOAuth.class).apiKey(CONSUMER_KEY).apiSecret(CONSUMER_SECRET)
				.build();
		accessToken = new Token(TOKEN, TOKEN_SECRET);
	}

	public BusinessDao searchYelp2() throws JsonParseException, JsonMappingException, IOException {

		OAuthRequest request = new OAuthRequest(Verb.GET, BASE_URI);
		request.addQuerystringParameter("term", TERM);
		request.addQuerystringParameter("location", LOCATION);
		request.addQuerystringParameter("sort", SORT_BY);
		request.addQuerystringParameter("limit", SEARCH_LIMIT);

		service.signRequest(accessToken, request);
		Response response = request.send();

		String jsonResponse = response.getBody();

		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

		BusinessDao business = mapper.readValue(jsonResponse, BusinessDao.class);
		
		
		business.getBusinesses();
	

		
		return business;
		
		
	}
}
