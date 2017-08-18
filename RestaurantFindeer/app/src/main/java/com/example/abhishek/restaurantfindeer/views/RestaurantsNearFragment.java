package com.example.abhishek.restaurantfindeer.views;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.abhishek.restaurantfindeer.datamodel.LocationDetails;
import com.example.abhishek.restaurantfindeer.datamodel.LocationRestaurantsList;
import com.example.abhishek.restaurantfindeer.R;
import com.example.abhishek.restaurantfindeer.adapters.MyRestaurantsListAdapter;
import com.example.abhishek.restaurantfindeer.events.DemoEvents;
import com.example.abhishek.restaurantfindeer.resultretreival.RetreiveResults;
import com.example.abhishek.restaurantfindeer.resultretreival.RetreiveResultsInterface;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

import static com.example.abhishek.restaurantfindeer.views.HomeActivity.api_key;

public class RestaurantsNearFragment extends Fragment implements YourFragmentInterface {

    private MyRestaurantsListAdapter adapter;
    private static final String RESTAURANTS_NEAR_FRAGMENT = RestaurantsNearFragment.class.getSimpleName();
    @BindView(R.id.restaurants_near_list)
    RecyclerView listView;
    private String mParam1;
    HomeActivity homeActivity=null;
    List<LocationDetails> mLocationList;
    LocationRestaurantsList mLocationRestaurants;
    RecyclerView restaurantList;
    RetreiveResultsInterface apiclient=new RetreiveResults();


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    public static RestaurantsNearFragment newInstance(LocationRestaurantsList locationRestaurantsList) {
        RestaurantsNearFragment fragment = new RestaurantsNearFragment();
        Bundle args = new Bundle();
        args.putSerializable(RESTAURANTS_NEAR_FRAGMENT,locationRestaurantsList);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void setArguments(Bundle args) {
        if (args.containsKey(RESTAURANTS_NEAR_FRAGMENT)) {
            mLocationRestaurants = (LocationRestaurantsList) args.get(RESTAURANTS_NEAR_FRAGMENT);
        }
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*if (getArguments() != null) {
            mLocationRestaurants= (LocationRestaurantsList) getArguments().get(RESTAURANTS_NEAR_FRAGMENT);
        }*/
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if (homeActivity == null) {
            homeActivity = (HomeActivity) getActivity();
        }


    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.restaurants_near_fragment, container, false);
        ButterKnife.bind(this,view);
        //List<LocationRestaurantsList.RestaurantsBean> mrestaurantsList=mLocationRestaurants.getRestaurants();
//        adapter=new MyRestaurantsListAdapter(view.getContext(),null);
        restaurantList=(RecyclerView)view.findViewById(R.id.restaurants_near_list);
        RecyclerView.LayoutManager mLayoutManager= new LinearLayoutManager(homeActivity);
        restaurantList.setLayoutManager(mLayoutManager);
       /* restaurantList.setItemAnimator(new DefaultItemAnimator());
        restaurantList.setAdapter(adapter);*/

        return view;
    }









    @Override
    public void onStart() {
        super.onStart();
        EventBus.getDefault().register(this);
        fragmentShowInitialData();
    }

    @Override
    public void onStop() {
        super.onStop();
        EventBus.getDefault().unregister(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventReceive(DemoEvents events){

        if (events.ACTION.equals(DemoEvents.Actions.LOCATION_RESTAURANTS_LIST)){
            List<LocationRestaurantsList.RestaurantsBean> mList=events.locationRestaurantsList.getRestaurants();
            adapter=new MyRestaurantsListAdapter(this.getActivity(),mList);
            restaurantList.setAdapter(adapter);
            Toast.makeText(homeActivity, "Retreiving Data ... ", Toast.LENGTH_SHORT).show();

        }else if (events.ACTION.equals(DemoEvents.Actions.ERROR)){
            Toast.makeText(this.getActivity(), "Please check your internet connection", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(homeActivity, "nothing is happening", Toast.LENGTH_SHORT).show();
        }

    }


    @Override
    public void fragmentShowInitialData() {
        apiclient.getRestaurantsList(api_key,"rating","desc");
    }
}
