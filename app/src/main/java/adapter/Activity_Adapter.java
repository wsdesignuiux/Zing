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

import model.Activity_Model;
import model.Hashtag_Tab_Item_Model;


/**
 * Created by wolfsoft3 on 30/8/18.
 */

public class Activity_Adapter extends RecyclerView.Adapter<Activity_Adapter.ViewHolder> {


    Context context;
    private ArrayList<Activity_Model> modelArrayList;



    public Activity_Adapter(Context context, ArrayList<Activity_Model> modelArrayList) {
        this.context = context;
        this.modelArrayList = modelArrayList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_activity, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.activity_img.setImageResource(modelArrayList.get(position).getActivity_img());
        holder.activity_text.setText(modelArrayList.get(position).getActivity_text());


        if (position==0){
            holder.today.setVisibility(View.VISIBLE);
        }else
            holder.today.setVisibility(View.GONE);
    }

    @Override
    public int getItemCount() {
        return modelArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView activity_img;
        TextView activity_text,today;



        public ViewHolder(View itemView) {
            super(itemView);

            activity_img = itemView.findViewById(R.id.activity_img);
            activity_text = itemView.findViewById(R.id.activity_text);
            today = itemView.findViewById(R.id.today);


        }
    }
}
