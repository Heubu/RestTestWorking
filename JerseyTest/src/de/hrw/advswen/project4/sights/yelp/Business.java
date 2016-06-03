package de.hrw.advswen.project4.sights.yelp;

public class Business {

	
	private String rating_img_url_large;

    private String phone;

    private String rating_img_url;

    private Location location;

    private String review_count;

    private String is_closed;

    private String is_claimed;

    private String rating_img_url_small;

    private String url;

    private String id;

    private String image_url;

    private String name;

    private String mobile_url;

    private String display_phone;

    private String[][] categories;

    private String rating;
    
    private String total;

    public String getRating_img_url_large ()
    {
        return rating_img_url_large;
    }

    public void setRating_img_url_large (String rating_img_url_large)
    {
        this.rating_img_url_large = rating_img_url_large;
    }

    public String getPhone ()
    {
        return phone;
    }

    public void setPhone (String phone)
    {
        this.phone = phone;
    }

    public String getRating_img_url ()
    {
        return rating_img_url;
    }

    public void setRating_img_url (String rating_img_url)
    {
        this.rating_img_url = rating_img_url;
    }

    public Location getLocation ()
    {
        return location;
    }

    public void setLocation (Location location)
    {
        this.location = location;
    }

    public String getReview_count ()
    {
        return review_count;
    }

    public void setReview_count (String review_count)
    {
        this.review_count = review_count;
    }

    public String getIs_closed ()
    {
        return is_closed;
    }

    public void setIs_closed (String is_closed)
    {
        this.is_closed = is_closed;
    }

    public String getIs_claimed ()
    {
        return is_claimed;
    }

    public void setIs_claimed (String is_claimed)
    {
        this.is_claimed = is_claimed;
    }

    public String getRating_img_url_small ()
    {
        return rating_img_url_small;
    }

    public void setRating_img_url_small (String rating_img_url_small)
    {
        this.rating_img_url_small = rating_img_url_small;
    }

    public String getUrl ()
    {
        return url;
    }

    public void setUrl (String url)
    {
        this.url = url;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getImage_url ()
    {
        return image_url;
    }

    public void setImage_url (String image_url)
    {
        this.image_url = image_url;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getMobile_url ()
    {
        return mobile_url;
    }

    public void setMobile_url (String mobile_url)
    {
        this.mobile_url = mobile_url;
    }

    public String getDisplay_phone ()
    {
        return display_phone;
    }

    public void setDisplay_phone (String display_phone)
    {
        this.display_phone = display_phone;
    }

    public String[][] getCategories ()
    {
        return categories;
    }

    public void setCategories (String[][] categories)
    {
        this.categories = categories;
    }

    public String getRating ()
    {
        return rating;
    }

    public void setRating (String rating)
    {
        this.rating = rating;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [rating_img_url_large = "+rating_img_url_large+", phone = "+phone+", rating_img_url = "+rating_img_url+", location = "+location+", review_count = "+review_count+", is_closed = "+is_closed+", is_claimed = "+is_claimed+", rating_img_url_small = "+rating_img_url_small+", url = "+url+", id = "+id+", image_url = "+image_url+", name = "+name+", mobile_url = "+mobile_url+", display_phone = "+display_phone+", categories = "+categories+", rating = "+rating+"]";
    }

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}
	
}
