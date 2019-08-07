package com.example.wasalahore;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.wasalahore.DisposalsForPumps.PumpsHomeActivity;
import com.example.wasalahore.DisposalsForTubeWells.WellsHomeActivity;
import com.example.wasalahore.Ponding.PondingHomeActivity;
import com.example.wasalahore.RainGauges.RainGaugeHome;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class ListActivity extends AppCompatActivity {

    CardView ponding_points, rain_gauges, tubewells, pumps, drainage, others;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ponding_points = findViewById(R.id.ponding_points);
        rain_gauges = findViewById(R.id.rain_gauges);
        tubewells = findViewById(R.id.disposals_station);
        pumps = findViewById(R.id.pump_station);
        drainage = findViewById(R.id.drainage);
        others = findViewById(R.id.others);

        others.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });
        drainage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });
        pumps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListActivity.this, PumpsHomeActivity.class);
                startActivity(intent);
            }
        });

        tubewells.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListActivity.this, WellsHomeActivity.class);
                startActivity(intent);
            }
        });
        rain_gauges.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListActivity.this, RainGaugeHome.class);
                startActivity(intent);
            }
        });
        ponding_points.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListActivity.this, PondingHomeActivity.class);
                startActivity(intent);
            }
        });
    }
}
