package com.example.wasalahore.Ponding;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PondingPagerAdapter extends FragmentPagerAdapter {
    private int noOfTabs;
    private Fragment fragment;

    public PondingPagerAdapter(@NonNull FragmentManager fm, int i) {

        super(fm);
        noOfTabs = i;
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new DashboardPondingFragment();
            case 1:
                return new GraphPondingFragment();
            case 2:
                return new SummaryPondingFragment();
            case 3:
                return new ReportsPondingFragment();
            default:
                return new DashboardPondingFragment();
        }
    }

    @Override
    public int getCount() {
        return noOfTabs;
    }
}
