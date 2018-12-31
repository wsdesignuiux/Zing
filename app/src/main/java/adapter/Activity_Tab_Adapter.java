package adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import fragment.Activity_Fragment;



/**
 * Created by wolfsoft3 on 12/9/18.
 */

public class Activity_Tab_Adapter extends FragmentStatePagerAdapter {

    int mnooftabs;

    public Activity_Tab_Adapter(FragmentManager fm, int mnooftabs) {
        super(fm);
        this.mnooftabs = mnooftabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                Activity_Fragment tab1 = new Activity_Fragment();
                return tab1;

            case 1:
                Activity_Fragment tab2 = new Activity_Fragment();
                return tab2;
            case 2:
                Activity_Fragment tab3 = new Activity_Fragment();
                return tab3;

            case 3:
                Activity_Fragment tab4 = new Activity_Fragment();
                return tab4;

            default:

                return null;
        }
    }

    @Override
    public int getCount() {
        return mnooftabs;
    }
}
