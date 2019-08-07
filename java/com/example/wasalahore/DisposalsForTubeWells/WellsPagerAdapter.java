package com.example.wasalahore.DisposalsForTubeWells;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class WellsPagerAdapter extends FragmentPagerAdapter {
    private int noOfTabs;
    private Fragment fragment;
    public WellsPagerAdapter(@NonNull FragmentManager fm, int i) {
        super(fm);
        noOfTabs = i;
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new DashboardWellsFragment();
            case 1:
                return new GraphWellsFragment();
            case 2:
                return new SummaryWellsFragment();
            default:
                return new DashboardWellsFragment();
        }
    }

    @Override
    public int getCount() {
        return noOfTabs;
    }
}
