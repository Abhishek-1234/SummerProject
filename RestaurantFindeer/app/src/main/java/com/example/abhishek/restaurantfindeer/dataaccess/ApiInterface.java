package com.example.abhishek.restaurantfindeer.dataaccess;

import android.support.v4.app.Fragment;

import com.example.abhishek.restaurantfindeer.datamodel.LocationDetails;
import com.example.abhishek.restaurantfindeer.datamodel.LocationRestaurantsList;
import com.example.abhishek.restaurantfindeer.resultretreival.RetreiveResultsInterface;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

/**
 * Created by Abhishek
 */

public interface ApiInterface {
    @GET("/locations")
    Call<LocationDetails> getLocationDetails(@Header("user-key") String api_key, @Query("query") String LocationName);

    @GET("/search")
    Call<LocationRestaurantsList> getRestaurantsList(@Header("user-key") String api_key, @Query("sort") String sort, @Query("order") String order);


    /**
     * A simple {@link Fragment} subclass.
     * Activities that contain this fragment must implement the
     * {@link OnFragmentInteractionListener} interface
     * to handle interaction events.
     * Use the {@link RetreiveResultsInterface.FragmentTwoHome#newInstance} factory method to
     * create an instance of this fragment.
     */
}
