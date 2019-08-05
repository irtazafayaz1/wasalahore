package com.example.wasalahore;


import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.wasalahore.RecyclerView.Adapter;
import com.example.wasalahore.RecyclerView.DataClass;

import java.util.ArrayList;
import java.util.List;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


/**
 * A simple {@link Fragment} subclass.
 */
public class SummaryFragment extends Fragment {


    public SummaryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        setHasOptionsMenu(true);

        View v = inflater.inflate(R.layout.fragment_summary, container, false);

        RecyclerView recyclerView;
        List<DataClass> data = new ArrayList<>();
        RecyclerView.Adapter adapter = new Adapter(getActivity(), data);
        recyclerView = v.findViewById(R.id.recycler_view_id);


        data.add(new DataClass("Johar Town C2", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 20190", "-", "-", "-", "-", "-", "-", "-"));
        data.add(new DataClass("PumpSet1", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019 ", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "-", "-", "-", "-", "-", "-", "-"));
        data.add(new DataClass("PumpSet2", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019 ", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "-", "-", "-", "-", "-", "-", "-"));
        data.add(new DataClass("Johar Town A3", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "-", "-", "-", "-", "-", "-", "-"));
        data.add(new DataClass("Johar Town D2", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019 ", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "-", "-", "-", "-", "-", "-", "-", "-"));
        data.add(new DataClass("Johar Town E", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019 ", "Jul 17 2019", "Jul 17 2019 ", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "-", "-", "-", "-", "-", "-", "-", "-"));
        data.add(new DataClass("Johar Town CampusView", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "J-", "-", "-", "-", "-", "-", "-", "-"));
        data.add(new DataClass("Johar Town F1", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 20190", "Jul 17 2017", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "-", "-", "-", "-", "-", "-", "-", "-"));
        data.add(new DataClass("Johar Town C", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "Jul 17 2019", "-", "-", "-", "-", "-", "-", "-", "-"));


        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);


        return v;
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.menu_dashboard, menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.item_dashboaard) {
            Toast.makeText(getActivity(), "Logout karwana", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(getActivity(), MainActivity.class);
            getActivity().startActivity(i);
        }
        else if (item.getItemId() == R.id.back_home) {
            Intent i = new Intent(getActivity(), ListActivity.class);
            getActivity().startActivity(i);
        }
        return true;

    }
}
