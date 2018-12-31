package com.example.wolfsoft3.zing;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import adapter.KwikListRecycleAdapter;
import model.KwikListModelClass;


public class KwikListActivity extends AppCompatActivity {


    private ArrayList<KwikListModelClass> kwikListModelClasses;
    private RecyclerView recyclerView;
    private KwikListRecycleAdapter bAdapter;

    private String txt[]={"01.Onboarding_1","02.Onboarding_2","03.OnBording_3","04.SignUp_1"
            ,"05.SignUp_2","06.Login","07.Home_2","08.Listing","09.Location_Heatmap"
            ,"10.HashTag", "11.Activity","12.Profile","13.Edit_Profile"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_recycle);


        recyclerView = findViewById(R.id.listrecycle);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(KwikListActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        kwikListModelClasses = new ArrayList<>();

        for (int i = 0; i < txt.length; i++) {
            KwikListModelClass beanClassForRecyclerView_contacts = new KwikListModelClass(txt[i]);
            kwikListModelClasses.add(beanClassForRecyclerView_contacts);
        }
        bAdapter = new KwikListRecycleAdapter(KwikListActivity.this,kwikListModelClasses);
        recyclerView.setAdapter(bAdapter);


    }
}
