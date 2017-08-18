package com.example.abhishek.restaurantfindeer.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ABHISHEK on 31-07-2017.
 */

public class MyHomeScreenPagerAdapter extends FragmentPagerAdapter {

    private List<Fragment> adapterFragmentList=new ArrayList<Fragment>();
    private List<String> fragmentTitleList=new ArrayList<String>();
    public MyHomeScreenPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        return adapterFragmentList.get(position);

    }

    @Override
    public int getCount() {
        return fragmentTitleList.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {

        return fragmentTitleList.get(position);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {



        return super.instantiateItem(container, position);
    }


    @Override
    public int getItemPosition(Object object) {
        return POSITION_NONE;

    }

    /*@Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }*/

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return super.isViewFromObject(view, object);
    }

    @Override
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
    }


    public void addFragment(Fragment fragment, String title){
        adapterFragmentList.add(fragment);
        fragmentTitleList.add(title);

    }
}
