package com.example.wasalahore.RainGauges;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.wasalahore.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ReportRainFragment extends Fragment {


    public ReportRainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_report_rain, container, false);
    }

}
