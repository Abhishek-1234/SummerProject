package com.example.abhishek.restaurantfindeer.views;

import android.Manifest;

import android.app.TaskStackBuilder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.support.design.widget.TabLayout;
import android.support.v4.app.ActivityCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.SearchView;
import android.view.inputmethod.InputMethodManager;
import android.widget.ProgressBar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.abhishek.restaurantfindeer.events.DemoEvents;
import com.example.abhishek.restaurantfindeer.datamodel.LocationRestaurantsList;
import com.example.abhishek.restaurantfindeer.adapters.MyHomeScreenPagerAdapter;
import com.example.abhishek.restaurantfindeer.R;
import com.example.abhishek.restaurantfindeer.resultretreival.RetreiveResults;
import com.example.abhishek.restaurantfindeer.resultretreival.RetreiveResultsInterface;
import com.example.abhishek.restaurantfindeer.dataaccess.ApiInterface;
import com.google.android.gms.maps.model.LatLng;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.io.IOException;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;


public class HomeActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener ,FragmentTwoHome.OnFragmentInteractionListener
{

    public static final String api_key="9d2944162894f32711911d556083025a";
    private SearchView searchViewTool;
    public static Boolean GPSEnabled = false;
    public static Boolean NetworkEnabled = false;
    private static LocationManager manager;
    private Double lat,lng;
    private String stringCity=null;
    private ProgressBar progressBar;
    private ViewPager viewPager;
    private TabLayout tabLayout;
    private MyHomeScreenPagerAdapter adapter;
    public RetreiveResults results;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        searchViewTool = (SearchView) findViewById(R.id.toolbar_searchview);
        searchViewTool.setIconified(false);
        searchViewTool.setOnCloseListener(new SearchView.OnCloseListener() {
            @Override
            public boolean onClose() {

                Toast.makeText(HomeActivity.this, "clicked", Toast.LENGTH_SHORT).show();
                return true;
            }
        });
        searchViewTool.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                RetreiveResultsInterface result=new RetreiveResults();
                result.getLocationDetails(api_key,query);
                Toast.makeText(HomeActivity.this, "getting location details ", Toast.LENGTH_SHORT).show();
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        progressBar=(ProgressBar)findViewById(R.id.progress_searchView);
        manager = (LocationManager) this.getSystemService(LOCATION_SERVICE);


        results=new RetreiveResults();
        results.getRestaurantsList(api_key,"rating","desc");
        viewPager=(ViewPager)findViewById(R.id.viewpager_home_screen);
        setUpViewPager(viewPager);
        tabLayout=(TabLayout)findViewById(R.id.home_screen_tabs);
        tabLayout.setupWithViewPager(viewPager);

        ProviderEnabled();



      // Additional code to add special functionality

       if (ProviderEnabled()) {

            Toast.makeText(this, "Location is On", Toast.LENGTH_SHORT).show();
            /*getCityName();


            */
       } else {
            createAlert();
       }

       searchViewTool.setOnQueryTextFocusChangeListener(new View.OnFocusChangeListener() {
           @Override
           public void onFocusChange(View view, boolean b) {
               closeKeyboard();
           }
       });



    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        if (id==R.id.detect_location){
            progressBar.setVisibility(View.VISIBLE);
            if (ProviderEnabled()){
                lng=lat=null;
                searchViewTool.setQueryHint(null);
                getCityName();
                new Timer().scheduleAtFixedRate(new TimerTask() {
                    @Override
                    public void run() {
                        if (!searchViewTool.getQuery().toString().isEmpty())
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                    progressBar.setVisibility(View.GONE);
                            }
                        });
                        }
                },500,500);

            }
            else
            {   createAlert();
                Toast.makeText(this, "Please Turn On Your Location", Toast.LENGTH_SHORT).show();
            }
        }
        //noinspection SimplifiableIfStatement

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }



    //method to check if the any of the provider is enabled
    public static  Boolean ProviderEnabled(){

        GPSEnabled=manager.isProviderEnabled(LocationManager.GPS_PROVIDER);
        NetworkEnabled=manager.isProviderEnabled(LocationManager.NETWORK_PROVIDER);

        if (GPSEnabled||NetworkEnabled)
            return true;
        else
            return false;

    }


    //method to detect Current location of user.
    public void getCityName(){

        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        /*
        if (GPSEnabled){

            manager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 5000, 2000, new LocationListener() {
                @Override
                public void onLocationChanged(Location location) {
                    lat=location.getLatitude();
                    lng=location.getLongitude();
                    LatLng loc=new LatLng(lat,lng);
                    Geocoder geocoder=new Geocoder(getApplicationContext());

                    try {
                        List<Address> addresses=geocoder.getFromLocation(lat,lng,1);
                        Address address=addresses.get(0);
                            *//*StringBuilder sb=new StringBuilder();
                            for (int i=0;i<address.getMaxAddressLineIndex();i++){
                                sb.append(address.getAddressLine(i)).append(",");
                            }*//*
                        stringCity=""+address.getLocality()+","+address.getCountryName();

                        searchViewTool.setQuery(stringCity,false);
                        searchViewTool.clearFocus();
                        Toast.makeText(HomeActivity.this, ""+stringCity+"", Toast.LENGTH_SHORT).show();


                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

                @Override
                public void onStatusChanged(String s, int i, Bundle bundle) {

                }

                @Override
                public void onProviderEnabled(String s) {

                }

                @Override
                public void onProviderDisabled(String s) {

                }
            });
        }
        else*/
        if(NetworkEnabled){

            manager.requestLocationUpdates(LocationManager.NETWORK_PROVIDER ,5000,2000, new LocationListener() {
                @Override
                public void onLocationChanged(Location location) {

                    if (lat!=null||lng!=null){
                        manager.removeUpdates(this);
                    }
                    else{

                        lat=location.getLatitude();
                        lng=location.getLongitude();
                        LatLng loc=new LatLng(lat,lng);
                        Geocoder geocoder=new Geocoder(getApplicationContext());

                        try {
                            List<Address> addresses=geocoder.getFromLocation(lat,lng,1);
                            Address address=addresses.get(0);
                            /*StringBuilder sb=new StringBuilder();
                            for (int i=0;i<address.getMaxAddressLineIndex();i++){
                                sb.append(address.getAddressLine(i)).append(",");
                            }*/
                            stringCity=""+address.getLocality()+",";
                            String s;
                            if ((s=address.getSubLocality())!=null){
                                stringCity+=s+",";
                            }
                            stringCity+=address.getCountryName();
                            searchViewTool.clearFocus();
                            searchViewTool.setQuery(stringCity,false);
                            searchViewTool.setQueryHint("Start typing ...");
                            Toast.makeText(HomeActivity.this, ""+stringCity+"", Toast.LENGTH_SHORT).show();


                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }

                @Override
                public void onStatusChanged(String s, int i, Bundle bundle) {

                }

                @Override
                public void onProviderEnabled(String s) {

                }

                @Override
                public void onProviderDisabled(String s) {

                }
            });
        }
    }

    public void createAlert(){

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Do you want to enable location?");
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                //dialogInterface.dismiss();
            }
        });
        builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                Intent a = new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS);
                TaskStackBuilder.create(getApplicationContext()).addParentStack(HomeActivity.class);
                startActivity(a);

            }
        });
        AlertDialog dialog = builder.create();
        dialog.show();
    }


    public void getWorkerThread(){
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        if (searchViewTool.getQuery().toString().isEmpty())
                            Toast.makeText(HomeActivity.this, "Cannot get your location please check your internet connection", Toast.LENGTH_SHORT).show();

                    }
                });

            }
        },5000);
    }

    public void closeKeyboard() {
        // Check if no view has focus:
        View view = this.getCurrentFocus();
        if (view != null) {
            InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }



    public void setUpViewPager(ViewPager viewPager){
        adapter = new MyHomeScreenPagerAdapter(getSupportFragmentManager());

        adapter.addFragment(new RestaurantsNearFragment(),"Restaurants");
        adapter.addFragment(new FragmentTwoHome(),"Dining Out");
        adapter.addFragment(new RestaurantsNearFragment(),"Desserts");
        adapter.addFragment(new FragmentTwoHome(),"Collections");
        adapter.addFragment(new RestaurantsNearFragment(),"Delivery");
        viewPager.setAdapter(adapter);
    }


    @Override
    public void onStart() {
        super.onStart();
        EventBus.getDefault().register(this);
    }

    @Override
    public void onStop() {
        super.onStop();
        EventBus.getDefault().unregister(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEvents(DemoEvents events){
        /*if (events.ACTION.equals(DemoEvents.Actions.LOCATION_RESTAURANTS_LIST)){
            if (events.locationRestaurantsList!=null||events.locationRestaurantsList.getRestaurants()!=null||events.locationRestaurantsList.getRestaurants().size()>0){
                restaurantsList=events.locationRestaurantsList;
            }
            else
            {
                Toast.makeText(this, "Check your internet connection", Toast.LENGTH_SHORT).show();
            }
        }
        Toast.makeText(HomeActivity.this, "onMessageEvent is calling", Toast.LENGTH_SHORT).show();
*/
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
