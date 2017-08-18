package com.example.abhishek.restaurantfindeer.resultretreival;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.abhishek.restaurantfindeer.R;

/**
 * Created by ABHISHEK on 02-08-2017.
 */

public interface RetreiveResultsInterface {

    public void getLocationDetails(String api_key,String query);
    public void getRestaurantsList(String api_key, String sort, String order);


}
