package com.example.wasalahore.DisposalsForTubeWells;

import android.os.Build;
import android.os.Bundle;

import com.example.wasalahore.R;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.viewpager.widget.ViewPager;

public class WellsHomeActivity extends AppCompatActivity {

    Toolbar toolbar;
    TabLayout tabLayout;
    TabItem tabDashboard;
    TabItem tabSummary;
    TabItem tabGraph;

    ViewPager viewPager;
    WellsPagerAdapter wellsPagerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wells_home);


        toolbar = findViewById(R.id.wells_toolbar);
        toolbar.setTitle("Disposals Station");
        setSupportActionBar(toolbar);


        tabLayout = findViewById(R.id.wells_tab_layout);
        viewPager = findViewById(R.id.wells_viewpager);
        tabDashboard = findViewById(R.id.wells_dashboard);
        tabSummary = findViewById(R.id.wells_summary);
        tabGraph = findViewById(R.id.wells_graph);

        wellsPagerAdapter = new WellsPagerAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(wellsPagerAdapter);

        tabLayout.addOnTabSelectedListener(new TabLayout.BaseOnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                viewPager.setCurrentItem(tab.getPosition());
                if (tab.getPosition() == 0) {
                    toolbar.setBackgroundColor(ContextCompat.getColor(WellsHomeActivity.this, R.color.colorPrimary));
                    tabLayout.setBackgroundColor(ContextCompat.getColor(WellsHomeActivity.this, R.color.colorPrimary));
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                        getWindow().setStatusBarColor(ContextCompat.getColor(WellsHomeActivity.this, R.color.colorPrimary));
                    }
                } else if (tab.getPosition() == 1) {
                    toolbar.setBackgroundColor(ContextCompat.getColor(WellsHomeActivity.this, R.color.colorPrimaryDark));
                    tabLayout.setBackgroundColor(ContextCompat.getColor(WellsHomeActivity.this, R.color.colorPrimaryDark));
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                        getWindow().setStatusBarColor(ContextCompat.getColor(WellsHomeActivity.this, R.color.colorPrimaryDark));
                    }
                } else if (tab.getPosition() == 2) {
                    toolbar.setBackgroundColor(ContextCompat.getColor(WellsHomeActivity.this, android.R.color.holo_blue_bright));
                    tabLayout.setBackgroundColor(ContextCompat.getColor(WellsHomeActivity.this, android.R.color.holo_blue_bright));
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                        getWindow().setStatusBarColor(ContextCompat.getColor(WellsHomeActivity.this, android.R.color.holo_blue_bright));
                    }
                } else if (tab.getPosition() == 3) {
                    toolbar.setBackgroundColor(ContextCompat.getColor(WellsHomeActivity.this, android.R.color.holo_blue_dark));
                    tabLayout.setBackgroundColor(ContextCompat.getColor(WellsHomeActivity.this, android.R.color.holo_blue_dark));
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                        getWindow().setStatusBarColor(ContextCompat.getColor(WellsHomeActivity.this, android.R.color.holo_blue_dark));
                    }
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

    }
}
