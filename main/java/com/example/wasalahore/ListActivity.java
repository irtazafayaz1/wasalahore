package com.example.wasalahore;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.wasalahore.Ponding.PondingHomeActivity;
import com.squareup.picasso.Picasso;

public class ListActivity extends AppCompatActivity {

    CardView ponding_points, rain_gauges, tubewells, disposals, drainage, others;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ponding_points = findViewById(R.id.ponding_points);
        rain_gauges = findViewById(R.id.rain_gauges);
        tubewells = findViewById(R.id.tubewells);
        disposals = findViewById(R.id.disposals_station);
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
        disposals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });

        tubewells.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });
        rain_gauges.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListActivity.this, HomeActivity.class);
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
