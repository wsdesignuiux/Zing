package com.example.wolfsoft3.zing;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

import adapter.Item_Recycle_Listing_Adapater;
import model.Item_Recycle_Listing_Model;

public class Listing extends AppCompatActivity {

    ImageView search_bar;

    RecyclerView recyclerView;
    Item_Recycle_Listing_Adapater item_recycle_listing_adapater;
    ArrayList<Item_Recycle_Listing_Model> modelList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listing);

        search_bar = findViewById(R.id.search_bar);
        search_bar.setVisibility(View.GONE);


        recyclerView = findViewById(R.id.recycle_listing);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        modelList = new ArrayList<>();

        modelList.add(new Item_Recycle_Listing_Model(R.drawable.image14,"swimming with the sharks"));
        modelList.add(new Item_Recycle_Listing_Model(R.drawable.image15,"skydive above the islands"));
        modelList.add(new Item_Recycle_Listing_Model(R.drawable.image16,"desert safari on 4x4"));
        modelList.add(new Item_Recycle_Listing_Model(R.drawable.image17,"burj khalifa"));
        modelList.add(new Item_Recycle_Listing_Model(R.drawable.image18,"scuba diving"));
        modelList.add(new Item_Recycle_Listing_Model(R.drawable.image19,"surf the waves"));



        item_recycle_listing_adapater = new Item_Recycle_Listing_Adapater(Listing.this, modelList);
        recyclerView.setAdapter(item_recycle_listing_adapater);



    }
}
