package de.hrw.advswen.project4.sights.foursquare;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Runner {

	private static final String BASE_URI = "https://api.foursquare.com/v2/venues/search";
	private static final String CLIENT_ID = "O1G0Y2C5ZLPZ2LDLCJA1BSDWJNAGN053402LKAKSLPIL2E3T";
	private static final String CLIENT_SECRET = "DKM3TBJSDJV5KQDDYMYN0YWBIARKPOXX0VJPUEGF44WMHIQH";
	private static final String POI_ID = "4bf58dd8d48988d12d941735";
	// TESTTEST

	WebTarget webTarget;

	public void getPointOfInterest(String city) {

		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("YYYYMMdd");
		String vdate = sdf.format(date);

		Client client = ClientBuilder.newClient();
		webTarget = client.target(BASE_URI).queryParam("near", "berlin").queryParam("categoryId", POI_ID)
				.queryParam("v", vdate).queryParam("client_id", CLIENT_ID).queryParam("client_secret", CLIENT_SECRET);
		Response response = webTarget.request().get();

		String jsonResponse = response.readEntity(String.class);
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

	}

}
