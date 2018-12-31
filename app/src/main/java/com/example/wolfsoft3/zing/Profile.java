package com.example.wolfsoft3.zing;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Profile extends AppCompatActivity {

    ImageView back_arror,search_bar,location_img;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);

        back_arror = findViewById(R.id.back_arror);
        back_arror.setVisibility(View.GONE);

        search_bar = findViewById(R.id.search_bar);
        search_bar.setVisibility(View.GONE);

        location_img = findViewById(R.id.location_img);
        location_img.setVisibility(View.GONE);

        text = findViewById(R.id.text);
        text.setText("My Profile");


    }
}
