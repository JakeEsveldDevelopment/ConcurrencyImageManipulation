package com.lambdaschool.concurrencyimagemanipulation;

import android.graphics.Bitmap;

public class ImageContainer {

    private Bitmap original, modified;
    private String urlString;



    public ImageContainer(String urlString) {
        this.urlString = urlString;
    }

    public Bitmap getOriginal() {
        return original;
    }

    public void setOriginal(Bitmap original) {
        this.original = original;
    }

    public Bitmap getModified() {
        return modified;
    }

    public void setModified(Bitmap modified) {
        this.modified = modified;
    }

    public String getUrlString() {
        return urlString;
    }
}
