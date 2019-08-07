package com.example.wasalahore.Ponding;

import android.os.Build;
import android.os.Bundle;

import com.example.wasalahore.R;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.viewpager.widget.ViewPager;

public class PondingHomeActivity extends AppCompatActivity {

    Toolbar toolbar;
    TabLayout tabLayout;
    TabItem tabDashboard;
    TabItem tabReport;
    TabItem tabSummary;
    TabItem tabGraph;

    ViewPager viewPager;
    PondingPagerAdapter pondingPagerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ponding_home);


        toolbar = findViewById(R.id.ponding_toolbar);
        toolbar.setTitle("Ponding Home Activity");
        setSupportActionBar(toolbar);


        tabLayout = findViewById(R.id.ponding_tab_layout);
        viewPager = findViewById(R.id.ponding_viewpager);
        tabDashboard = findViewById(R.id.ponding_dashboard);
        tabReport = findViewById(R.id.ponding_reports);
        tabSummary = findViewById(R.id.ponding_summary);
        tabGraph = findViewById(R.id.ponding_graph);

        pondingPagerAdapter = new PondingPagerAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(pondingPagerAdapter);

        tabLayout.addOnTabSelectedListener(new TabLayout.BaseOnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                viewPager.setCurrentItem(tab.getPosition());
                if (tab.getPosition() == 0) {
                    toolbar.setBackgroundColor(ContextCompat.getColor(PondingHomeActivity.this, R.color.colorPrimary));
                    tabLayout.setBackgroundColor(ContextCompat.getColor(PondingHomeActivity.this, R.color.colorPrimary));
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                        getWindow().setStatusBarColor(ContextCompat.getColor(PondingHomeActivity.this, R.color.colorPrimary));
                    }
                } else if (tab.getPosition() == 1) {
                    toolbar.setBackgroundColor(ContextCompat.getColor(PondingHomeActivity.this, R.color.colorPrimaryDark));
                    tabLayout.setBackgroundColor(ContextCompat.getColor(PondingHomeActivity.this, R.color.colorPrimaryDark));
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                        getWindow().setStatusBarColor(ContextCompat.getColor(PondingHomeActivity.this, R.color.colorPrimaryDark));
                    }
                } else if (tab.getPosition() == 2) {
                    toolbar.setBackgroundColor(ContextCompat.getColor(PondingHomeActivity.this, android.R.color.holo_blue_bright));
                    tabLayout.setBackgroundColor(ContextCompat.getColor(PondingHomeActivity.this, android.R.color.holo_blue_bright));
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                        getWindow().setStatusBarColor(ContextCompat.getColor(PondingHomeActivity.this, android.R.color.holo_blue_bright));
                    }
                } else if (tab.getPosition() == 3) {
                    toolbar.setBackgroundColor(ContextCompat.getColor(PondingHomeActivity.this, android.R.color.holo_blue_dark));
                    tabLayout.setBackgroundColor(ContextCompat.getColor(PondingHomeActivity.this, android.R.color.holo_blue_dark));
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                        getWindow().setStatusBarColor(ContextCompat.getColor(PondingHomeActivity.this, android.R.color.holo_blue_dark));
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
