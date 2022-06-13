package com.example.lng;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;


import com.mapbox.mapboxsdk.Mapbox;
import com.mapbox.mapboxsdk.maps.MapView;
import com.mapbox.mapboxsdk.maps.MapboxMap;
import com.mapbox.mapboxsdk.maps.OnMapReadyCallback;
import com.mapbox.mapboxsdk.maps.Style;

import java.util.List;

public class MainActivity extends AppCompatActivity  {

    private MapView mapView;
    private MapboxMap mapboxMap;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Mapbox.getInstance(this, getString(R.string.mapbox_access_token));
        mapView = findViewById(R.id.mapview);

        mapView.onCreate(savedInstanceState);


    }

    @Override
    protected void onStart() {
        super.onStart();
        mapView.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mapView.onDestroy();
    }

    @Override
    protected void onStop() {
        super.onStop();
        mapView.onStop();
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        mapView.onLowMemory();
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        mapView.onSaveInstanceState(outState);
    }

    //    @Override
//    public void onLocationChanged(@NonNull Location location) {
//
//    }
//
//    @Override
//    public void onLocationChanged(@NonNull List<Location> locations) {
//        LocationListener.super.onLocationChanged(locations);
//    }
//
//    @Override
//    public void onFlushComplete(int requestCode) {
//        LocationListener.super.onFlushComplete(requestCode);
//    }
}