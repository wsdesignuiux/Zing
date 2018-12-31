package com.example.wolfsoft3.zing;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.Point;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.ahmadrosid.lib.drawroutemap.DrawMarker;
import com.arsy.maps_library.MapRadar;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MarkerOptions;

import adapter.Viewpager_hashtag_tab_Adapter;

public class Location_Heatmap extends AppCompatActivity implements OnMapReadyCallback, View.OnClickListener {


//    private ActionBarDrawerToggle actionBarDrawerToggle;
    NavigationView navigationView;
    private DrawerLayout drawer;
    private Toolbar toolbar;


//map

    private double radius = 1000;
    Point displaySize = new Point();
    private LatLng origin, destination, three, four, five, six, seven;
    private static final String KEY_CAMERA_POSITION = "camera_position";
    private static final String KEY_LOCATION = "location";
    private GoogleMap mMap;
    MapRadar mapRadar;
    private Context context = Location_Heatmap.this;
//map end

    ImageView back_arror,search_bar,location_img;
    TextView text;

    ViewPager viewpager_location;
    TabLayout tablayout_location;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_heatmap);


        back_arror = findViewById(R.id.back_arror);
        back_arror.setVisibility(View.GONE);

        search_bar = findViewById(R.id.search_bar);
        search_bar.setVisibility(View.GONE);

        text = findViewById(R.id.text);
        text.setText("heatmap");


        drawer = (DrawerLayout)findViewById(R.id.drawer_layout);

        navigationView = (NavigationView) findViewById(R.id.navigation_view);

        toolbar = (Toolbar) findViewById(R.id.toolbar1);
        toolbar.findViewById(R.id.location_img).setOnClickListener(this) ;
        toolbar.findViewById(R.id.menu).setOnClickListener(this);
        openDrawer();







        tablayout_location = findViewById(R.id.tablayout_location_heatmap);

        tablayout_location.addTab(tablayout_location.newTab().setText("ALL SPOTS"));
        tablayout_location.addTab(tablayout_location.newTab().setText("FOOD"));
        tablayout_location.addTab(tablayout_location.newTab().setText("ADVENTURE"));
        tablayout_location.addTab(tablayout_location.newTab().setText("SPORTS"));
        wrapTabIndicatorToTitle(tablayout_location,20,20);


        tablayout_location.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });


        //map code start


        MapFragment mapFragment = (MapFragment) getFragmentManager()
                .findFragmentById(R.id.googleMap);
        mapFragment.getMapAsync((OnMapReadyCallback) this);


        origin = new LatLng(28.639747, 77.348109);
        destination = new LatLng(28.636872, 77.650158);
        three = new LatLng(28.504957, 77.523136);
        four = new LatLng(28.440550, 77.422742);
        five = new LatLng(28.798910, 77.260656);
        six = new LatLng(28.702904, 77.548477);
        seven = new LatLng(28.345200, 77.660785);






    }


    private void openDrawer() {
        drawer.openDrawer(navigationView);
    }




//map code

    @Override
    public void onMapReady(GoogleMap googleMap) {


        mMap = googleMap;

        DrawMarker.getInstance(this).draw(mMap, origin, R.drawable.bluepoint1, "My Location");
        DrawMarker.getInstance(this).draw(mMap, destination, R.drawable.bluepoint1, "230");
        DrawMarker.getInstance(this).draw(mMap, three, R.drawable.bluepoint1, "2,124");
        DrawMarker.getInstance(this).draw(mMap, four, R.drawable.bluepoint1, "590");
        DrawMarker.getInstance(this).draw(mMap, five, R.drawable.bluepoint1, "1,591");
        DrawMarker.getInstance(this).draw(mMap, six, R.drawable.bluepoint1, "1,591");
        DrawMarker.getInstance(this).draw(mMap, seven, R.drawable.bluepoint1, "1,951");

        //it binds the camera postition to the above two points
        LatLngBounds bounds = new LatLngBounds.Builder()
                .include(origin)
                .include(destination)
                .include(three)
                .include(four)
                .include(five)
                .include(six).build();
        Point displaySize = new Point();
        getWindowManager().getDefaultDisplay().getSize(displaySize);
        mMap.moveCamera(CameraUpdateFactory.newLatLngBounds(bounds, displaySize.x, 260, 30));

        //for automatic zoomin when you open the activity....
        //the vaalue can be changed according to your use.....
        mMap.animateCamera(CameraUpdateFactory.zoomTo(15.3f));






        LatLng latLng = new LatLng(28.368937,77.230514);

        double lat = 28.368937;
        double lng = 77.230514;

      /*  mapRipple = new MapRipple(googleMap, latLng, context);

        mapRipple.withNumberOfRipples(3);
        mapRipple.withFillColor(Color.parseColor("#FFA3D2E4"));
        mapRipple.withStrokeColor(Color.BLACK);
        mapRipple.withStrokewidth(0);      // 10dp
        mapRipple.withDistance(2000);      // 2000 metres radius
        mapRipple.withRippleDuration(12000);    //12000ms
        mapRipple.withTransparency(0.5f);
        mapRipple.startRippleMapAnimation();*/


        mapRadar = new MapRadar(googleMap, latLng, context);
        mapRadar.withClockWiseAnticlockwise(true);
        mapRadar.withDistance(2000);
        mapRadar.withClockwiseAnticlockwiseDuration(2);
        mapRadar.withOuterCircleFillColor(Color.parseColor("#12000000"));
        mapRadar.withOuterCircleStrokeColor(Color.parseColor("#fccd29"));
        mapRadar.withRadarColors(Color.parseColor("#00000000"), Color.parseColor("#ff000000"));  //starts from transparent to fuly black
        mapRadar.withRadarColors(Color.parseColor("#00fccd29"), Color.parseColor("#fffccd29"));  //starts from transparent to fuly black
        mapRadar.withOuterCircleStrokewidth(7);
        mapRadar.withRadarSpeed(5);
        mapRadar.withOuterCircleTransparency(0.5f);
        mapRadar.withRadarTransparency(0.5f);



        googleMap.addCircle(new CircleOptions()
                .center(new LatLng(lat,lng))
                .radius(radius)
                .strokeColor(Color.RED)
                .strokeWidth(0f)
                .fillColor(Color.parseColor("#19bd0909")));


        // create marker
        MarkerOptions marker = new MarkerOptions().position(latLng).title("Your are here");


        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.redpoint));

// adding marker
        googleMap.addMarker(marker);

        //    marker.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE));

        CameraPosition cameraPosition = new CameraPosition.Builder().target(
                latLng).zoom(10).build();

        googleMap.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));



    }
    //map code end


    @Override
    public void onClick(View v) {
        if (drawer.isDrawerOpen(navigationView)) {
                    drawer.closeDrawer(navigationView);
                } else {
                    drawer.openDrawer(navigationView);
                }
    }



    public void wrapTabIndicatorToTitle(TabLayout tabLayout, int externalMargin, int internalMargin) {
        View tabStrip = tabLayout.getChildAt(0);
        if (tabStrip instanceof ViewGroup) {
            ViewGroup tabStripGroup = (ViewGroup) tabStrip;
            int childCount = ((ViewGroup) tabStrip).getChildCount();
            for (int i = 0; i < childCount; i++) {
                View tabView = tabStripGroup.getChildAt(i);
                //set minimum width to 0 for instead for small texts, indicator is not wrapped as expected
                tabView.setMinimumWidth(0);
                // set padding to 0 for wrapping indicator as title
                tabView.setPadding(0, tabView.getPaddingTop(), 0, tabView.getPaddingBottom());
                // setting custom margin between tabs
                if (tabView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams layoutParams = (ViewGroup.MarginLayoutParams) tabView.getLayoutParams();
                    if (i == 0) {
                        // left
                        settingMargin(layoutParams, externalMargin, internalMargin);
                    } else if (i == childCount - 1) {
                        // right
                        settingMargin(layoutParams, internalMargin, externalMargin);
                    } else {
                        // internal
                        settingMargin(layoutParams, internalMargin, internalMargin);
                    }
                }
            }

            tabLayout.requestLayout();
        }
    }

    private void settingMargin(ViewGroup.MarginLayoutParams layoutParams, int start, int end) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
            layoutParams.setMarginStart(start);
            layoutParams.setMarginEnd(end);
            layoutParams.leftMargin = start;
            layoutParams.rightMargin = end;
        } else {
            layoutParams.leftMargin = start;
            layoutParams.rightMargin = end;
        }
    }



    }






