package adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import com.example.wolfsoft3.zing.Activity;
import com.example.wolfsoft3.zing.Edit_Profile;
import com.example.wolfsoft3.zing.HashTag;
import com.example.wolfsoft3.zing.Home_2;
import com.example.wolfsoft3.zing.Listing;
import com.example.wolfsoft3.zing.Location_Heatmap;
import com.example.wolfsoft3.zing.Login;
import com.example.wolfsoft3.zing.OnBording_3;
import com.example.wolfsoft3.zing.Onboarding_1;
import com.example.wolfsoft3.zing.Onboarding_2;
import com.example.wolfsoft3.zing.Profile;
import com.example.wolfsoft3.zing.R;
import com.example.wolfsoft3.zing.SignUp_1;
import com.example.wolfsoft3.zing.SignUp_2;

import java.util.List;

import model.KwikListModelClass;


public class KwikListRecycleAdapter extends RecyclerView.Adapter<KwikListRecycleAdapter.MyViewHolder> {

    Context context;


    private List<KwikListModelClass> OfferList;


    public class MyViewHolder extends RecyclerView.ViewHolder {


        TextView title;


        public MyViewHolder(View view) {
            super(view);

            title = (TextView) view.findViewById(R.id.title);


        }

    }


    public KwikListRecycleAdapter(Context context, List<KwikListModelClass> offerList) {
        this.OfferList = offerList;
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_kwik_list, parent, false);


        return new MyViewHolder(itemView);


    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        KwikListModelClass lists = OfferList.get(position);
        holder.title.setText(lists.getTitle());


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (position == 0) {
                    Intent i = new Intent(context, Onboarding_1.class);
                    context.startActivity(i);
                } else if (position == 1) {
                    Intent i = new Intent(context, Onboarding_2.class);
                    context.startActivity(i);
                } else if (position == 2) {
                    Intent i = new Intent(context, OnBording_3.class);
                    context.startActivity(i);
                } else if (position == 3) {
                    Intent i = new Intent(context, SignUp_1.class);
                    context.startActivity(i);
                } else if (position == 4) {
                    Intent i = new Intent(context, SignUp_2.class);
                    context.startActivity(i);
                } else if (position == 5) {
                    Intent i = new Intent(context, Login.class);
                    context.startActivity(i);
                } else if (position == 6) {
                    Intent i = new Intent(context, Home_2.class);
                    context.startActivity(i);
                } else if (position == 7) {
                    Intent i = new Intent(context, Listing.class);
                    context.startActivity(i);
                } else if (position == 8) {
                    Intent i = new Intent(context, Location_Heatmap.class);
                    context.startActivity(i);
                } else if (position == 9) {
                    Intent i = new Intent(context, HashTag.class);
                    context.startActivity(i);
                } else if (position == 10) {
                    Intent i = new Intent(context, Activity.class);
                    context.startActivity(i);
                } else if (position == 11) {
                    Intent i = new Intent(context, Profile.class);
                    context.startActivity(i);
                } else if (position == 12) {
                    Intent i = new Intent(context, Edit_Profile.class);
                    context.startActivity(i);
                }
            }

        });


    }


    @Override
    public int getItemCount() {
        return OfferList.size();

    }

}


