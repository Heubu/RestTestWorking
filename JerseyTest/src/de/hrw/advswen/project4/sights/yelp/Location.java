package de.hrw.advswen.project4.sights.yelp;

public class Location {

	private String state_code;

	private String[] display_address;

	private String[] address;

	private String postal_code;

	private String geo_accuracy;

	private String country_code;

	private String city;
	
	private Coordinate coordinate;

	public String getState_code() {
		return state_code;
	}

	public void setState_code(String state_code) {
		this.state_code = state_code;
	}

	public String[] getDisplay_address() {
		return display_address;
	}

	public void setDisplay_address(String[] display_address) {
		this.display_address = display_address;
	}

	public String[] getAddress() {
		return address;
	}

	public void setAddress(String[] address) {
		this.address = address;
	}

	public String getPostal_code() {
		return postal_code;
	}

	public void setPostal_code(String postal_code) {
		this.postal_code = postal_code;
	}

	public String getGeo_accuracy() {
		return geo_accuracy;
	}

	public void setGeo_accuracy(String geo_accuracy) {
		this.geo_accuracy = geo_accuracy;
	}

	public String getCountry_code() {
		return country_code;
	}

	public void setCountry_code(String country_code) {
		this.country_code = country_code;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "ClassPojo [state_code = " + state_code + ", display_address = " + display_address + ", address = " + address + ", postal_code = " + postal_code + ", geo_accuracy = "
				+ geo_accuracy + ", country_code = " + country_code + ", city = " + city + "]";
	}

	public Coordinate getCoordinate() {
		return coordinate;
	}

	public void setCoordinate(Coordinate coordinate) {
		this.coordinate = coordinate;
	}

}
