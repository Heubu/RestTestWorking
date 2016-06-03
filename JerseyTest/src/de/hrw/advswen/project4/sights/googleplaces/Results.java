package de.hrw.advswen.project4.sights.googleplaces;

public class Results
{
    private Photos[] photos;

    private String id;

    private String place_id;

    private String icon;

    private String name;

    private String formatted_address;

    private String rating;

    private String[] types;

    private String reference;

    public Photos[] getPhotos ()
    {
        return photos;
    }

    public void setPhotos (Photos[] photos)
   {
        this.photos = photos;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getPlace_id ()
    {
        return place_id;
    }

    public void setPlace_id (String place_id)
    {
        this.place_id = place_id;
    }

    public String getIcon ()
    {
        return icon;
    }

    public void setIcon (String icon)
    {
        this.icon = icon;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getFormatted_address ()
    {
        return formatted_address;
    }

    public void setFormatted_address (String formatted_address)
    {
        this.formatted_address = formatted_address;
    }

    public String getRating ()
    {
        return rating;
    }

    public void setRating (String rating)
    {
        this.rating = rating;
    }

    public String[] getTypes ()
    {
        return types;
    }

    public void setTypes (String[] types)
    {
        this.types = types;
    }

    public String getReference ()
    {
        return reference;
    }

    public void setReference (String reference)
    {
        this.reference = reference;
    }



    @Override
    public String toString()
    {
        return "ClassPojo [photos = "+photos+", id = "+id+", place_id = "+place_id+", icon = "+icon+", name = "+name+", formatted_address = "+formatted_address+", rating = "+rating+", types = "+types+", reference = "+reference+"]";
    }
}