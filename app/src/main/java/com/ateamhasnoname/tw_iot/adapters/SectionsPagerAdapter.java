package com.ateamhasnoname.tw_iot.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.ateamhasnoname.tw_iot.fragments.MapViewFragment;
import com.ateamhasnoname.tw_iot.fragments.TimelineViewFragment;

/**
 * Created by imittal on 7/9/16.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    public SectionsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return TimelineViewFragment.newInstance();
            case 1:
                return MapViewFragment.newInstance();
        }
        return TimelineViewFragment.newInstance();
    }

    @Override
    public int getCount() {
        // Show 3 total pages.
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Timeline View";
            case 1:
                return "Map View";
        }
        return null;
    }
}
