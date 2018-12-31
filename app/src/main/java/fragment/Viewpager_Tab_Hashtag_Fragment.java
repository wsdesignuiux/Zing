package fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.wolfsoft3.zing.R;

import java.util.ArrayList;

import adapter.Item_Hashtag_Adapter;
import model.Hashtag_Tab_Item_Model;

/**
 * Created by wolfsoft3 on 18/9/18.
 */

public class Viewpager_Tab_Hashtag_Fragment extends Fragment {

    RecyclerView recyclerView;
    Item_Hashtag_Adapter hashtab_tab_recycle_adapater;
    ArrayList<Hashtag_Tab_Item_Model> modelList;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.recycle_hashtag,container,false);


        recyclerView = (RecyclerView) view.findViewById(R.id.recycle_hashtag);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);

        modelList = new ArrayList<>();

        modelList.add(new Hashtag_Tab_Item_Model(R.drawable.image14,"#roadtrips"));
        modelList.add(new Hashtag_Tab_Item_Model(R.drawable.image13,"#desertsafari"));
        modelList.add(new Hashtag_Tab_Item_Model(R.drawable.image1,"#scuba"));
        modelList.add(new Hashtag_Tab_Item_Model(R.drawable.image12,"#surf"));
        modelList.add(new Hashtag_Tab_Item_Model(R.drawable.image2,"#skydive"));
        modelList.add(new Hashtag_Tab_Item_Model(R.drawable.image19,"#sharkswim"));

        hashtab_tab_recycle_adapater = new Item_Hashtag_Adapter(getActivity(),modelList);
        recyclerView.setAdapter(hashtab_tab_recycle_adapater);



        return view;
    }
}
