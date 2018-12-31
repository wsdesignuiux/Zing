package model;

/**
 * Created by wolfsoft3 on 20/9/18.
 */

public class Activity_Model {
    Integer activity_img;
    String activity_text;

    public Activity_Model(Integer activity_img, String activity_text) {
        this.activity_img = activity_img;
        this.activity_text = activity_text;
    }

    public Integer getActivity_img() {
        return activity_img;
    }

    public void setActivity_img(Integer activity_img) {
        this.activity_img = activity_img;
    }

    public String getActivity_text() {
        return activity_text;
    }

    public void setActivity_text(String activity_text) {
        this.activity_text = activity_text;
    }
}
