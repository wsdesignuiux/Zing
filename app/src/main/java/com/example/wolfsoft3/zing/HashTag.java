package com.example.wolfsoft3.zing;

import android.graphics.Typeface;
import android.os.Build;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import adapter.Viewpager_hashtag_tab_Adapter;

public class HashTag extends AppCompatActivity {

    ImageView back_arror,search_bar,location_img;
    TextView text;

    ViewPager viewpager_hashtag;
    TabLayout tablayout_hashtag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hash_tag);

        back_arror = findViewById(R.id.back_arror);
        back_arror.setVisibility(View.GONE);

        search_bar = findViewById(R.id.search_bar);
        search_bar.setVisibility(View.GONE);

        location_img = findViewById(R.id.location_img);
        location_img.setVisibility(View.GONE);

        text = findViewById(R.id.text);
        text.setText("top hashtags");


        viewpager_hashtag = findViewById(R.id.viewpager_hashtag);
        tablayout_hashtag = findViewById(R.id.tablayout_hashtag);

        tablayout_hashtag.addTab(tablayout_hashtag.newTab().setText("ALL SPOTS"));
        tablayout_hashtag.addTab(tablayout_hashtag.newTab().setText("FOOD"));
        tablayout_hashtag.addTab(tablayout_hashtag.newTab().setText("ADVENTURE"));
        tablayout_hashtag.addTab(tablayout_hashtag.newTab().setText("SPORTS"));


        Typeface mTypeface = Typeface.create("roboto_light", Typeface.NORMAL);
        ViewGroup vg = (ViewGroup) tablayout_hashtag.getChildAt(0);
        int tabsCount = vg.getChildCount();
        for (int j = 0; j < tabsCount; j++) {
            ViewGroup vgTab = (ViewGroup) vg.getChildAt(j);
            int tabChildsCount = vgTab.getChildCount();
            for (int i = 0; i < tabChildsCount; i++) {
                View tabViewChild = vgTab.getChildAt(i);
                if (tabViewChild instanceof TextView) {
                    ((TextView) tabViewChild).setTypeface(mTypeface, Typeface.NORMAL);
                }
            }
        }

        Viewpager_hashtag_tab_Adapter adapter = new Viewpager_hashtag_tab_Adapter(getSupportFragmentManager(), tablayout_hashtag.getTabCount());
        viewpager_hashtag.setAdapter(adapter);
        wrapTabIndicatorToTitle(tablayout_hashtag,20,20);
        viewpager_hashtag.setOffscreenPageLimit(4);
        viewpager_hashtag.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tablayout_hashtag));
        tablayout_hashtag.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewpager_hashtag.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }


    public void wrapTabIndicatorToTitle(TabLayout tabLayout, int externalMargin, int internalMargin) {
        View tabStrip = tabLayout.getChildAt(0);
        if (tabStrip instanceof ViewGroup) {
            ViewGroup tabStripGroup = (ViewGroup) tabStrip;
            int childCount = ((ViewGroup) tabStrip).getChildCount();
            for (int i = 0; i < childCount; i++) {
                View tabView = tabStripGroup.getChildAt(i);
                //set minimum width to 0 for instead for small texts, indicator is not wrapped as expected
                tabView.setMinimumWidth(0);
                // set padding to 0 for wrapping indicator as title
                tabView.setPadding(0, tabView.getPaddingTop(), 0, tabView.getPaddingBottom());
                // setting custom margin between tabs
                if (tabView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams layoutParams = (ViewGroup.MarginLayoutParams) tabView.getLayoutParams();
                    if (i == 0) {
                        // left
                        settingMargin(layoutParams, externalMargin, internalMargin);
                    } else if (i == childCount - 1) {
                        // right
                        settingMargin(layoutParams, internalMargin, externalMargin);
                    } else {
                        // internal
                        settingMargin(layoutParams, internalMargin, internalMargin);
                    }
                }
            }

            tabLayout.requestLayout();
        }
    }

    private void settingMargin(ViewGroup.MarginLayoutParams layoutParams, int start, int end) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
            layoutParams.setMarginStart(start);
            layoutParams.setMarginEnd(end);
            layoutParams.leftMargin = start;
            layoutParams.rightMargin = end;
        } else {
            layoutParams.leftMargin = start;
            layoutParams.rightMargin = end;
        }
    }


}

