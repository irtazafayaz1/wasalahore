package com.example.wasalahore.DisposalsForPumps;

import android.os.Build;
import android.os.Bundle;

import com.example.wasalahore.R;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.viewpager.widget.ViewPager;

public class PumpsHomeActivity extends AppCompatActivity {


    Toolbar toolbar;
    TabLayout tabLayout;
    TabItem tabDashboard;
    TabItem tabSummary;
    TabItem tabGraph;

    ViewPager viewPager;
    PumpsPagerAdapter pumpsPagerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pumps_home);


        toolbar = findViewById(R.id.pumps_toolbar);
        toolbar.setTitle("Pumps");
        setSupportActionBar(toolbar);


        tabLayout = findViewById(R.id.pumps_tab_layout);
        viewPager = findViewById(R.id.pumps_viewpager);
        tabDashboard = findViewById(R.id.pumps_dashboard);
        tabSummary = findViewById(R.id.pumps_summary);
        tabGraph = findViewById(R.id.pumps_graph);

        pumpsPagerAdapter = new PumpsPagerAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(pumpsPagerAdapter);

        tabLayout.addOnTabSelectedListener(new TabLayout.BaseOnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                viewPager.setCurrentItem(tab.getPosition());
                if (tab.getPosition() == 0) {
                    toolbar.setBackgroundColor(ContextCompat.getColor(PumpsHomeActivity.this, android.R.color.holo_blue_bright));
                    tabLayout.setBackgroundColor(ContextCompat.getColor(PumpsHomeActivity.this, android.R.color.holo_blue_bright));
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                        getWindow().setStatusBarColor(ContextCompat.getColor(PumpsHomeActivity.this, android.R.color.holo_blue_bright));
                    }
                } else if (tab.getPosition() == 3) {
                    toolbar.setBackgroundColor(ContextCompat.getColor(PumpsHomeActivity.this, android.R.color.holo_blue_dark));
                    tabLayout.setBackgroundColor(ContextCompat.getColor(PumpsHomeActivity.this, android.R.color.holo_blue_dark));
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                        getWindow().setStatusBarColor(ContextCompat.getColor(PumpsHomeActivity.this, android.R.color.holo_blue_dark));
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
