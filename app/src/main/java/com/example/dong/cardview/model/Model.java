package com.example.dong.cardview.model;

/**
 * Created by DONG on 17-Jul-17.
 */

public class Model {
    private String title;
    private int image;

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {

        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Model(String title, int image) {
        this.title = title;
        this.image = image;
    }

    public Model() {
    }
}

