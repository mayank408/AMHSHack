package com.example.mayanktripathi.smartgrid;

import android.location.Geocoder;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

/**
 * Created by mayanktripathi on 21/01/17.
 */

public class MapsActivity extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private double longitude,latitude;
    Geocoder mGeoCoder;
    Toolbar toolbar ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        init();
        setSupportActionBar(toolbar);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    private void init() {
       // gps = new GPSTracker(MapsActivity.this);
        mGeoCoder = new Geocoder(MapsActivity.this);
    }





    @Override
    public void onMapReady(GoogleMap googleMap) {
//        mMap = googleMap;
//        if(gps.canGetLocation()){
//            longitude = gps.getLongitude();
//            latitude = gps.getLatitude();
//            Toast.makeText(getApplicationContext(), "Your Location is - \nLat: " + latitude + "\nLong: " + longitude, Toast.LENGTH_LONG).show();
//        }else {
//
//            gps.showSettingsAlert();
//        }
        // Add a marker in Current Location and move the camera

        LatLng currentLocation = new LatLng(latitude, longitude);
        mMap.addMarker(new MarkerOptions().position(currentLocation).title("Your Location").draggable(true));
        mMap.setMaxZoomPreference(20);
        mMap.setMinZoomPreference(14);
        mMap.moveCamera(CameraUpdateFactory.newLatLng(currentLocation));
        mMap.setOnMarkerDragListener(new GoogleMap.OnMarkerDragListener() {


            @Override
            public void onMarkerDragStart(Marker marker) {

            }

            @Override
            public void onMarkerDrag(Marker marker) {

            }

            @Override
            public void onMarkerDragEnd(Marker marker) {
                latitude =  marker.getPosition().latitude;
                longitude = marker.getPosition().longitude;

            }
        });

    }






}