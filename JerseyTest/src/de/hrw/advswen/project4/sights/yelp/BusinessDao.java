package de.hrw.advswen.project4.sights.yelp;

import java.util.ArrayList;

public class BusinessDao {

	
	private String total;

    private RegionClass regionclass;
    
    private Business[] businesses;

//    private ArrayList<Business> businesses;
//
//    public ArrayList<Business> getBusiness() {
//		return businesses;
//	}
//
//	public void setBusiness(ArrayList<Business> businesses) {
//		this.businesses = businesses;
//	}

	public RegionClass getRegionclass() {
		return regionclass;
	}

	public void setRegionclass(RegionClass regionclass) {
		this.regionclass = regionclass;
	}

	public Business[] getBusinesses() {
		return businesses;
	}

	public void setBusinesses(Business[] businesses) {
		this.businesses = businesses;
	}

	public String getTotal ()
    {
        return total;
    }

    public void setTotal (String total)
    {
        this.total = total;
    }

    public RegionClass getRegion ()
    {
        return regionclass;
    }

    public void setRegion (RegionClass region)
    {
        this.regionclass = region;
    }

    

    @Override
    public String toString()
    {
        return "ClassPojo [total = "+total+", region = "+regionclass+", businesses = "+businesses+"]";
    }
	
}
