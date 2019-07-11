package com.example.wasalahore;


import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


/**
 * A simple {@link Fragment} subclass.
 */
public class DashboardFragment extends Fragment implements OnMapReadyCallback {

    SupportMapFragment mapFragment;

    public DashboardFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        setHasOptionsMenu(true);
        View v = inflater.inflate(R.layout.fragment_dashboard, container, false);
        mapFragment = (SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.child_fragment_container);
        if (mapFragment == null) {
            FragmentManager fm = getFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            mapFragment = SupportMapFragment.newInstance();
            ft.replace(R.id.child_fragment_container, mapFragment).commit();

        }
        mapFragment.getMapAsync(this);
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

        }
        return true;

    }

//    @Override
//    public void onViewCreated(View view, Bundle savedInstanceState) {
//        insertNestedFragment();
//    }
//
//    // Embeds the child fragment dynamically
//    private void insertNestedFragment() {
//        Fragment childFragment = new MapFragmentClass();
//        FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
//        transaction.replace(R.id.child_fragment_container, childFragment).commit();
//    }


    @Override
    public void onMapReady(GoogleMap googleMap) {

    }
}
