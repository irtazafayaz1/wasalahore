package com.example.wasalahore;


import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;
import java.util.Calendar;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


/**
 * A simple {@link Fragment} subclass.
 */
public class GraphsFragment extends Fragment {

    int sy, sd, sm;
    int ey, ed, em;

    public GraphsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        setHasOptionsMenu(true);
        View view = inflater.inflate(R.layout.fragment_graphs, container, false);


        Spinner graph_type = view.findViewById(R.id.graph_type);
        Spinner template_type = view.findViewById(R.id.template_type);
        Spinner resource = view.findViewById(R.id.resource);
        Spinner parameter = view.findViewById(R.id.parameter);

        graph_type.setAdapter(new ArrayAdapter(getActivity(), android.R.layout.simple_spinner_dropdown_item, getActivity().getResources().getStringArray(R.array.graph_type)));
        template_type.setAdapter(new ArrayAdapter(getActivity(), android.R.layout.simple_spinner_dropdown_item, getActivity().getResources().getStringArray(R.array.template_type)));
        resource.setAdapter(new ArrayAdapter(getActivity(), android.R.layout.simple_spinner_dropdown_item, getActivity().getResources().getStringArray(R.array.resource)));
        parameter.setAdapter(new ArrayAdapter(getActivity(), android.R.layout.simple_spinner_dropdown_item, getActivity().getResources().getStringArray(R.array.parameter)));

        final TextView startingTime, startingDate, endingDate, endingTime;

        endingDate = view.findViewById(R.id.end_date);
        endingTime = view.findViewById(R.id.end_time);
        startingTime = view.findViewById(R.id.start_time);
        startingDate = view.findViewById(R.id.start_date);

        final DatePickerDialog.OnDateSetListener onDateSetListener;
        final DatePickerDialog.OnDateSetListener onDateSetListener2;


        onDateSetListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                sy = year;
                sm = month;
                sd = dayOfMonth;
                String date = sd + "/" + sm + "/" + sy;
                Log.e("time date", "" + sy + sm + sd);
                startingDate.setText(date);
            }
        };


        onDateSetListener2 = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                ey = year;
                em = month;
                ed = dayOfMonth;
                String date = ed + "/" + em + "/" + ey;
                Log.e("time date", "" + ey + em + ed);
                endingDate.setText(date);
            }
        };

        startingDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Calendar cal = Calendar.getInstance();
                int year = cal.get(Calendar.YEAR);
                int day = cal.get(Calendar.DAY_OF_MONTH);
                int month = cal.get(Calendar.MONTH);

                DatePickerDialog datePickerDialog = new DatePickerDialog(getActivity(), android.R.style.Theme_Holo_Light_Dialog_MinWidth, onDateSetListener, year, month, day);
                datePickerDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                datePickerDialog.show();
            }
        });


        endingDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Calendar cal = Calendar.getInstance();
                int year = cal.get(Calendar.YEAR);
                int day = cal.get(Calendar.DAY_OF_MONTH);
                int month = cal.get(Calendar.MONTH);

                DatePickerDialog datePickerDialog = new DatePickerDialog(getActivity(), android.R.style.Theme_Holo_Light_Dialog_MinWidth, onDateSetListener2, year, month, day);
                datePickerDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                datePickerDialog.show();
            }
        });


        return view;
    }


    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.menu_dashboard, menu);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        final BarChart barChart = view.findViewById(R.id.bar_chart);
        Button button = view.findViewById(R.id.update);


        barChart.setDrawBarShadow(false);
        barChart.setDrawValueAboveBar(true);
        barChart.setMaxVisibleValueCount(50);
        barChart.setPinchZoom(false);
        barChart.setDrawGridBackground(true);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ArrayList<BarEntry> barEntries = new ArrayList<>();
                barEntries.add(new BarEntry(1, 40f));
                barEntries.add(new BarEntry(2, 44f));
                barEntries.add(new BarEntry(3, 33f));
                barEntries.add(new BarEntry(4, 46f));

                BarDataSet barDataSet = new BarDataSet(barEntries, "Data Set2");
                barDataSet.setColors(ColorTemplate.COLORFUL_COLORS);

                BarData barData = new BarData(barDataSet);
                barData.setBarWidth(0.9f);
                barChart.setData(barData);

                barChart.invalidate();
                barChart.refreshDrawableState();
            }
        });

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.item_dashboaard) {
            Toast.makeText(getActivity(), "Logout karwana", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(getActivity(), MainActivity.class);
            getActivity().startActivity(i);
        } else if (item.getItemId() == R.id.back_home) {
            Intent i = new Intent(getActivity(), ListActivity.class);
            getActivity().startActivity(i);
        }
        return true;

    }
}
