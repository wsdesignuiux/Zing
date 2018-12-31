package fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.wolfsoft3.zing.R;


/**
 * Created by wolfsoft3 on 18/9/18.
 */

public class Viewpager_Tab_Location_Heatmap_Fragment extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.item_viewpager_location_heatmap,container,false);
        return view;
    }
}
