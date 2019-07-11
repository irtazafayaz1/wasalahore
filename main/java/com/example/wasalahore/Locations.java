package com.example.wasalahore;

import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.clustering.ClusterItem;

public class Locations implements ClusterItem {

    String title;
    LatLng latLng;

    public Locations(String title, LatLng latLng) {
        this.title = title;
        this.latLng = latLng;
    }

    @Override
    public LatLng getPosition() {
        return latLng;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getSnippet() {
        return "";
    }
}
