package de.hrw.advswen.project4.weather.runner;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

//import de.hrw.advswen.project4.dbconnection.DBConnection;
import de.hrw.advswen.project4.weather.current.WeatherCur;
import de.hrw.advswen.project4.weather.current.WeatherCurrent;
import de.hrw.advswen.project4.weather.forecast.List;
import de.hrw.advswen.project4.weather.forecast.Main;
import de.hrw.advswen.project4.weather.forecast.Weather;
import de.hrw.advswen.project4.weather.forecast.WeatherForecast;

import org.json.JSONException;
import org.json.JSONObject;

//import java.io.BufferedReader;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
//import java.io.InputStream;
//import java.io.InputStreamReader;
//import java.io.Reader;
//import java.net.URL;
//import java.nio.charset.Charset;

public class Runner {

	private static WebTarget webTarget;
	final static String OPENWAETHER_API_KEY = "3fa6ad3e4151ac3fdb33964716098436";
	// private static String CITY = "London";

//	public void climateTable(String land) {
//		DBConnection.getConnection();
		// DBDMLDQL.selectWeatherData("climatable","DEU");
		// http://climatedataapi.worldbank.org/climateweb/rest/v1/country/mavg/tas/1980/1999/USA.json
		// http://data.worldbank.org/developers/climate-data-api
//	}

	// Aktuelles Wetter
	public void currentTemp(String city) throws JsonParseException, JsonMappingException, IOException {

		String WEATHER_URI_BASE = "http://api.openweathermap.org/data/2.5/weather?";

		Client client = ClientBuilder.newClient();
		webTarget = client.target(WEATHER_URI_BASE).queryParam("q", city).queryParam("APPID", OPENWAETHER_API_KEY);
		Response response = webTarget.request().get();

		String jsonResponse = response.readEntity(String.class);
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		WeatherCurrent weathercurrent = mapper.readValue(jsonResponse, WeatherCurrent.class);

		for (WeatherCur weather : weathercurrent.getWeather()) {
			System.out.println(weathercurrent.getMain().getTemp_max());
		}
	}

	// Wettervorhersage
	public void forecastTemp(String city) throws JsonParseException, JsonMappingException, IOException {

		String WEATHER_URI_BASE = "http://api.openweathermap.org/data/2.5/forecast?";

		Client client = ClientBuilder.newClient();
		webTarget = client.target(WEATHER_URI_BASE).queryParam("q", city).queryParam("APPID", OPENWAETHER_API_KEY);
		Response response = webTarget.request().get();
		// System.out.println(webTarget.getUri());

		String jsonResponse = response.readEntity(String.class);
		// System.out.println(jsonResponse);

		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		//de.hrw.advswen.project4.weather.forecast.List weatherforecast = mapper.readValue(jsonResponse,de.hrw.advswen.project4.weather.forecast.List.class);
		//List weatherforecast = mapper.readValue(jsonResponse,mapper.getTypeFactory().constructCollectionType((Class<? extends Collection>) List.class, Weather.class));

		//System.out.println(weatherforecast.getDtTxt());
		
		//for(Weather weather : weatherforecast){	}
		WeatherForecast weatherForecast = mapper.readValue(jsonResponse, WeatherForecast.class);
	}

	// Klimatabelle mit historischen Daten

	public static void main(String[] args) throws IOException, JSONException, SQLException {
		Runner wetter = new Runner();
		// System.out.println("====================Current");
		// wetter.currentTemp("ulm");
		System.out.println("====================Forecast");
		wetter.forecastTemp("ravensburg");
		//DBConnection.selectWeatherData("climatetable", "DEU");
	}
}
