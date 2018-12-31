package model;

/**
 * Created by wolfsoft3 on 20/9/18.
 */

public class Hashtag_Tab_Item_Model {

    Integer hashtag_img;
    String hashtag_text;

    public Hashtag_Tab_Item_Model(Integer hashtag_img, String hashtag_text) {
        this.hashtag_img = hashtag_img;
        this.hashtag_text = hashtag_text;
    }

    public Integer getHashtag_img() {
        return hashtag_img;
    }

    public void setHashtag_img(Integer hashtag_img) {
        this.hashtag_img = hashtag_img;
    }

    public String getHashtag_text() {
        return hashtag_text;
    }

    public void setHashtag_text(String hashtag_text) {
        this.hashtag_text = hashtag_text;
    }
}
