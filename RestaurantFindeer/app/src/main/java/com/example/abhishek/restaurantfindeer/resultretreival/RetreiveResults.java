package com.example.abhishek.restaurantfindeer.resultretreival;

import com.example.abhishek.restaurantfindeer.events.DemoEvents;
import com.example.abhishek.restaurantfindeer.datamodel.LocationDetails;
import com.example.abhishek.restaurantfindeer.datamodel.LocationRestaurantsList;
import com.example.abhishek.restaurantfindeer.connection.ApiClient;
import com.example.abhishek.restaurantfindeer.dataaccess.ApiInterface;

import org.greenrobot.eventbus.EventBus;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by ABHISHEK on 02-08-2017.
 */

public class RetreiveResults implements RetreiveResultsInterface {

    ApiInterface client;
    public LocationRestaurantsList mList;
    public RetreiveResults(){
        client = ApiClient.getClient().create(ApiInterface.class);

    }

    @Override
    public void getLocationDetails(String api_key,String query) {
        Call<LocationDetails> detailsCall=client.getLocationDetails(api_key,query);
        detailsCall.enqueue(new Callback<LocationDetails>() {
            @Override
            public void onResponse(Call<LocationDetails> call, Response<LocationDetails> response) {
                if (response.code()==200){
                    LocationDetails locationDetails=response.body();

                    EventBus.getDefault().post(new DemoEvents(locationDetails,DemoEvents.Actions.LOCATIONS_DETIALS));
                }
                else
                {
                    EventBus.getDefault().post(new DemoEvents(DemoEvents.Actions.ERROR));
                }
            }

            @Override
            public void onFailure(Call<LocationDetails> call, Throwable t) {
                EventBus.getDefault().post(new DemoEvents(DemoEvents.Actions.ERROR));
            }
        });
    }

    @Override
    public void getRestaurantsList(String api_key, String sort, String order) {
        Call<LocationRestaurantsList>  call=client.getRestaurantsList(api_key,sort,order);
        call.enqueue(new Callback<LocationRestaurantsList>() {

            @Override
            public void onResponse(Call<LocationRestaurantsList> call, Response<LocationRestaurantsList> response) {
                if (response.code()==200){
                    LocationRestaurantsList list=response.body();
                    EventBus.getDefault().post(new DemoEvents(list,DemoEvents.Actions.LOCATION_RESTAURANTS_LIST));
                }
                else
                {
                    EventBus.getDefault().post(new DemoEvents(DemoEvents.Actions.ERROR));
                }
            }

            @Override
            public void onFailure(Call<LocationRestaurantsList> call, Throwable t) {
                EventBus.getDefault().post(new DemoEvents(DemoEvents.Actions.ERROR));
            }
        });

    }



}
