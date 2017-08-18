package com.example.abhishek.restaurantfindeer.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.abhishek.restaurantfindeer.datamodel.LocationRestaurantsList;
import com.example.abhishek.restaurantfindeer.R;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by ABHISHEK on 02-08-2017.
 */

public class MyRestaurantsListAdapter extends RecyclerView.Adapter<MyRestaurantsListAdapter.ViewHolder> {

    Context context;
    List<LocationRestaurantsList.RestaurantsBean> mList;

    public MyRestaurantsListAdapter(Context context,List<LocationRestaurantsList.RestaurantsBean> mList){
        this.context=context;
        this.mList=mList;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView= LayoutInflater.from(context).inflate(R.layout.restaurant_list_item_row,parent,false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        LocationRestaurantsList.RestaurantsBean restaurantsBean=mList.get(position);

        holder.rest_name.setText(restaurantsBean.getRestaurant().getName());
        holder.rest_address.setText(restaurantsBean.getRestaurant().getLocation().getLocality_verbose());
        holder.rest_cuisines.setText(restaurantsBean.getRestaurant().getCuisines());
        holder.rest_cost.setText(restaurantsBean.getRestaurant().getAverage_cost_for_two());
        holder.rest_currency.setText(restaurantsBean.getRestaurant().getCurrency());

    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.restaurant_name)
        TextView rest_name;
        @BindView(R.id.restaurant_address)
        TextView rest_address;
        @BindView(R.id.restaurant_cuisines)
        TextView rest_cuisines;
        @BindView(R.id.restaurant_cost )
        TextView rest_cost;
        @BindView(R.id.restaurant_currency)
        TextView rest_currency;

        public ViewHolder(View itemView) {

            super(itemView);
            ButterKnife.bind(this,itemView);

        }
    }
}
