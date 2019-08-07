package com.example.wasalahore.DisposalsForPumps;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PumpsPagerAdapter extends FragmentPagerAdapter {

    private int noOfTabs;
    private Fragment fragment;

    public PumpsPagerAdapter(@NonNull FragmentManager fm, int i) {

        super(fm);
        noOfTabs = i;
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new DashboardPumpsFragment();
            case 1:
                return new GraphPumpsFragment();
            case 2:
                return new SummaryPumpsFragment();

            default:
                return new DashboardPumpsFragment();
        }
    }

    @Override
    public int getCount() {
        return noOfTabs;
    }
}


