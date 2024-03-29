package com.example.wasalahore.DisposalsForTubeWells;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.wasalahore.ListActivity;
import com.example.wasalahore.Locations;
import com.example.wasalahore.MainActivity;
import com.example.wasalahore.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.clustering.ClusterManager;

import java.util.ArrayList;
import java.util.List;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class DashboardWellsFragment extends Fragment implements OnMapReadyCallback {

    SupportMapFragment mapFragment;

    // TODO: Rename parameter arguments, choose names that matc
    public DashboardWellsFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreateOptionsMenu(Menu menu,
                                    MenuInflater inflater) {
        inflater.inflate(R.menu.menu_dashboard, menu);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        setHasOptionsMenu(true);
        View v = inflater.inflate(R.layout.fragment_dashboard_wells, container, false);
        mapFragment = (SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.map_fragment_wells);
        if (mapFragment == null) {
            FragmentManager fm = getFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            mapFragment = SupportMapFragment.newInstance();
            ft.replace(R.id.map_fragment_wells, mapFragment).commit();
        }
        mapFragment.getMapAsync(this);

        return v;
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

    @Override
    public void onMapReady(GoogleMap googleMap) {
        ClusterManager clusterManager = new ClusterManager(getActivity(), googleMap);  // 3
        googleMap.setOnCameraIdleListener(clusterManager);
        List<Locations> items = getItems();
        clusterManager.addItems(items);  // 4
        clusterManager.cluster();  // 5
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(items.get(1).getPosition(), 15));
    }

    private List<Locations> getItems() {
        List<Locations> lists = new ArrayList<>();

        LatLng latLng = new LatLng(31.512489, 74.283905);
        LatLng latLng1 = new LatLng(31.475331, 74.344539);
        LatLng latLng2 = new LatLng(31.475331, 74.344539);
        lists.add(new Locations("Location1", latLng));
        lists.add(new Locations("Location1", latLng1));
        lists.add(new Locations("Location1", latLng2));
        return lists;
    }


}
