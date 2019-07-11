package com.example.wasalahore;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PageAdapter extends FragmentPagerAdapter {
    private int noOfTabs;
    Context context;

    public PageAdapter(FragmentManager fragmentManager, int i, Context context) {
        super(fragmentManager);
        noOfTabs = i;
        this.context = context;
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
