package com.example.wolfsoft3.zing;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import adapter.OnBording_Viewpager_Adapter;
import me.relex.circleindicator.CircleIndicator;

public class Onboarding_1 extends AppCompatActivity {

    private ViewPager viewPager;
    private OnBording_Viewpager_Adapter onBording_viewpager_adapter;
    private CircleIndicator circleIndicator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.onboarding);

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        CircleIndicator indicator =(CircleIndicator) findViewById(R.id.circleindicator);
        onBording_viewpager_adapter = new OnBording_Viewpager_Adapter(getSupportFragmentManager());
        viewPager.setAdapter(onBording_viewpager_adapter);
        indicator.setViewPager(viewPager);
        onBording_viewpager_adapter.registerDataSetObserver(indicator.getDataSetObserver());


    }
}
