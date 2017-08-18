package com.example.abhishek.restaurantfindeer.datamodel;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ABHISHEK on 02-08-2017.
 */

public class LocationDetails implements Serializable{


    /**
     * location_suggestions : [
     * {"entity_type":"city",
     * "entity_id":8,
     * "title":"Lucknow",
     * "latitude":26.864,
     * "longitude":80.95,
     * "city_id":8,
     * "city_name":"Lucknow",
     * "country_id":1,
     * "country_name":"India"
     * }
     * ]
     * status : success
     * has_more : 0
     * has_total : 0
     */

    private String status;
    private int has_more;
    private int has_total;
    private List<LocationSuggestionsBean> location_suggestions;



    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getHas_more() {
        return has_more;
    }

    public void setHas_more(int has_more) {
        this.has_more = has_more;
    }

    public int getHas_total() {
        return has_total;
    }

    public void setHas_total(int has_total) {
        this.has_total = has_total;
    }

    public List<LocationSuggestionsBean> getLocation_suggestions() {
        return location_suggestions;
    }

    public void setLocation_suggestions(List<LocationSuggestionsBean> location_suggestions) {
        this.location_suggestions = location_suggestions;
    }

    public static class LocationSuggestionsBean {
        /**
         * entity_type : city
         * entity_id : 8
         * title : Lucknow
         * latitude : 26.864
         * longitude : 80.95
         * city_id : 8
         * city_name : Lucknow
         * country_id : 1
         * country_name : India
         */

        private String entity_type;
        private int entity_id;
        private String title;
        private double latitude;
        private double longitude;
        private int city_id;
        private String city_name;
        private int country_id;
        private String country_name;



        public String getEntity_type() {
            return entity_type;
        }

        public void setEntity_type(String entity_type) {
            this.entity_type = entity_type;
        }

        public int getEntity_id() {
            return entity_id;
        }

        public void setEntity_id(int entity_id) {
            this.entity_id = entity_id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public double getLatitude() {
            return latitude;
        }

        public void setLatitude(double latitude) {
            this.latitude = latitude;
        }

        public double getLongitude() {
            return longitude;
        }

        public void setLongitude(double longitude) {
            this.longitude = longitude;
        }

        public int getCity_id() {
            return city_id;
        }

        public void setCity_id(int city_id) {
            this.city_id = city_id;
        }

        public String getCity_name() {
            return city_name;
        }

        public void setCity_name(String city_name) {
            this.city_name = city_name;
        }

        public int getCountry_id() {
            return country_id;
        }

        public void setCountry_id(int country_id) {
            this.country_id = country_id;
        }

        public String getCountry_name() {
            return country_name;
        }

        public void setCountry_name(String country_name) {
            this.country_name = country_name;
        }
    }
}
