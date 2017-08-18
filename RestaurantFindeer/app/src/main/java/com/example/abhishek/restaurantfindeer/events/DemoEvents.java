package com.example.abhishek.restaurantfindeer.events;

import com.example.abhishek.restaurantfindeer.datamodel.LocationDetails;
import com.example.abhishek.restaurantfindeer.datamodel.LocationRestaurantsList;

/**
 * Created by ABHISHEK on 02-08-2017.
 */

public class DemoEvents {

    public LocationDetails locationDetails=null;
    public LocationRestaurantsList locationRestaurantsList=null;
    public String ACTION=null;


    public DemoEvents(String ACTION){

        this.ACTION=ACTION;
    }

    public DemoEvents(LocationDetails locationDetails,String ACTION){
        this.locationDetails=locationDetails;
        this.ACTION=ACTION;
    }

    public DemoEvents(LocationRestaurantsList locationRestaurantsList,String ACTION){

        this.locationRestaurantsList=locationRestaurantsList;
        this.ACTION=ACTION;

    }


    public class Actions{

        public static final String ERROR="error";
        public static final String LOCATIONS_DETIALS="locationsdetails";
        public static final String LOCATION_RESTAURANTS_LIST="locationrestaurantslist";


    }


}
