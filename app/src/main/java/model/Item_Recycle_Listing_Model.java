package model;

import android.widget.ImageView;

/**
 * Created by wolfsoft3 on 20/9/18.
 */

public class Item_Recycle_Listing_Model {
    Integer listing_img;
    String listing_text;

    public Item_Recycle_Listing_Model(Integer listing_img, String listing_text) {
        this.listing_img = listing_img;
        this.listing_text = listing_text;
    }

    public Integer getListing_img() {
        return listing_img;
    }

    public void setListing_img(Integer listing_img) {
        this.listing_img = listing_img;
    }

    public String getListing_text() {
        return listing_text;
    }

    public void setListing_text(String listing_text) {
        this.listing_text = listing_text;
    }
}
