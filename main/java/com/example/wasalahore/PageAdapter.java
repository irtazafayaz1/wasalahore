package com.example.wasalahore;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class PageAdapter extends FragmentPagerAdapter {
    private int noOfTabs;

    public PageAdapter(FragmentManager fragmentManager, int i) {
        super(fragmentManager);
        noOfTabs = i;
    }

    @Override
    public Fragment getItem(int i) {
        switch (i) {
            case 0: {
                return new DashboardFragment();
            }
            case 1: {
                return new SummaryFragment();
            }
            case 2: {
                return new GraphsFragment();
            }
            case 3: {
                return new ReviewFragment();
            }
            default:
                return new DashboardFragment();
        }
    }

    @Override
    public int getCount() {
        return noOfTabs;
    }

}
