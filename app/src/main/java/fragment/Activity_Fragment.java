package fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.wolfsoft3.zing.R;

import java.util.ArrayList;

import adapter.Activity_Adapter;
import adapter.Item_Hashtag_Adapter;
import model.Activity_Model;
import model.Hashtag_Tab_Item_Model;

/**
 * Created by wolfsoft3 on 18/9/18.
 */

public class Activity_Fragment extends Fragment {

    RecyclerView recyclerView;
    Activity_Adapter hashtab_tab_recycle_adapater;
    ArrayList<Activity_Model> modelList;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.recycle_activity,container,false);


        recyclerView = (RecyclerView) view.findViewById(R.id.recycle_activity);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);

        modelList = new ArrayList<>();

        modelList.add(new Activity_Model(R.drawable.image1,"45 new photos from #roadtrips"));
        modelList.add(new Activity_Model(R.drawable.image12,"new adventure spot added on \n#funthingstodo"));
        modelList.add(new Activity_Model(R.drawable.image2,"41,420,210 people have checked \ninto this #dubaiskydive"));
        modelList.add(new Activity_Model(R.drawable.image13,"400 new videos on #goldengate"));
        modelList.add(new Activity_Model(R.drawable.image4,"#surfing trending on top"));
        modelList.add(new Activity_Model(R.drawable.image6,"1,414,429 people have tagged \n#elephantsafari"));

        hashtab_tab_recycle_adapater = new Activity_Adapter(getActivity(),modelList);
        recyclerView.setAdapter(hashtab_tab_recycle_adapater);



        return view;
    }
}
