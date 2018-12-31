package adapter;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import com.example.wolfsoft3.zing.R;

import java.util.ArrayList;

import model.Hashtag_Tab_Item_Model;


/**
 * Created by wolfsoft3 on 30/8/18.
 */

public class Item_Hashtag_Adapter extends RecyclerView.Adapter<Item_Hashtag_Adapter.ViewHolder> {


    Context context;
    private ArrayList<Hashtag_Tab_Item_Model> modelArrayList;

    int position;

    public Item_Hashtag_Adapter(Context context, ArrayList<Hashtag_Tab_Item_Model> modelArrayList) {
        this.context = context;
        this.modelArrayList = modelArrayList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_hashtag, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.hashtag_img.setImageResource(modelArrayList.get(position).getHashtag_img());
        holder.hashtag_text.setText(modelArrayList.get(position).getHashtag_text());

        if (position == 1) {
            holder.cardview_hashtag.setVisibility(View.VISIBLE);
        } else {
            holder.cardview_hashtag.setVisibility(View.GONE);
        }
    }

    @Override
    public int getItemCount() {
        return modelArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView hashtag_img;
        TextView hashtag_text;
        CardView cardview_hashtag;


        public ViewHolder(View itemView) {
            super(itemView);

            hashtag_img = itemView.findViewById(R.id.hashtag_img);
            hashtag_text = itemView.findViewById(R.id.hashtag_text);
            cardview_hashtag = itemView.findViewById(R.id.cardview_hashtag);

        }
    }
}
