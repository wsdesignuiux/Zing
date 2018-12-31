package adapter;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;


import fragment.OnBording_Viewpager_First_Fragment;

/**
 * Created by wolfsoft3 on 2/8/18.
 */

public class OnBording_Viewpager_Adapter extends FragmentStatePagerAdapter {
    public OnBording_Viewpager_Adapter(FragmentManager fm) {
        super(fm);
    }


    @Override
    public Fragment getItem(int position) {
        switch (position){

            case 0:
               OnBording_Viewpager_First_Fragment tab1 = new OnBording_Viewpager_First_Fragment();
                return tab1;
            case 1:
                OnBording_Viewpager_First_Fragment tab2 = new OnBording_Viewpager_First_Fragment();
                return tab2;
            case 2:
                OnBording_Viewpager_First_Fragment tab3 = new OnBording_Viewpager_First_Fragment();
                return tab3;


            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return 3;
    }


}
