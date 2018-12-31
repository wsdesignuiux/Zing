package adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import com.example.wolfsoft3.zing.R;

import java.util.ArrayList;


import model.Item_Recycle_Listing_Model;


public class Item_Recycle_Listing_Adapater extends RecyclerView.Adapter<Item_Recycle_Listing_Adapater.ViewHolder> {

    private Context context;
    private ArrayList<Item_Recycle_Listing_Model> modelArrayList;

    public Item_Recycle_Listing_Adapater(Context context, ArrayList<Item_Recycle_Listing_Model> modelArrayList) {
        this.context = context;
        this.modelArrayList = modelArrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycle_listing,parent,false);
        return new ViewHolder(view);
    }

    @NonNull



    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        Item_Recycle_Listing_Model item_matches_model = modelArrayList.get(position);

        holder.listing_img.setImageResource(item_matches_model.getListing_img());
        holder.listing_text.setText(item_matches_model.getListing_text());


    }

    @Override
    public int getItemCount() {
        return modelArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView listing_img;
        TextView listing_text;

        public ViewHolder(View itemView) {
            super(itemView);

            listing_img = itemView.findViewById(R.id.listing_img);
            listing_text = itemView.findViewById(R.id.listing_text);

        }
    }
}
