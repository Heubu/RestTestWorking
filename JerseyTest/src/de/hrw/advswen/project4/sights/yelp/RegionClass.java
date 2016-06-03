package de.hrw.advswen.project4.sights.yelp;

public class RegionClass {
	private Center center;

    private Span span;

    public Center getCenter ()
    {
        return center;
    }

    public void setCenter (Center center)
    {
        this.center = center;
    }

    public Span getSpan ()
    {
        return span;
    }

    public void setSpan (Span span)
    {
        this.span = span;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [center = "+center+", span = "+span+"]";
    }
}
