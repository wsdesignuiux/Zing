package adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import fragment.Viewpager_Tab_Hashtag_Fragment;


/**
 * Created by wolfsoft3 on 12/9/18.
 */

public class Viewpager_hashtag_tab_Adapter extends FragmentStatePagerAdapter {

    int mnooftabs;

    public Viewpager_hashtag_tab_Adapter(FragmentManager fm, int mnooftabs) {
        super(fm);
        this.mnooftabs = mnooftabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                Viewpager_Tab_Hashtag_Fragment tab1 = new Viewpager_Tab_Hashtag_Fragment();
                return tab1;

            case 1:
                Viewpager_Tab_Hashtag_Fragment tab2 = new Viewpager_Tab_Hashtag_Fragment();
                return tab2;
            case 2:
                Viewpager_Tab_Hashtag_Fragment tab3 = new Viewpager_Tab_Hashtag_Fragment();
                return tab3;

            case 3:
                Viewpager_Tab_Hashtag_Fragment tab4 = new Viewpager_Tab_Hashtag_Fragment();
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
