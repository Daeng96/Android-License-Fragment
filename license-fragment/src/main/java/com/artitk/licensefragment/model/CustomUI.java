package com.artitk.licensefragment.model;

import android.graphics.drawable.Drawable;

/**
 * Custom UI data class.
 */
public class CustomUI {

    private int titleBackgroundColor;
    private int titleTextColor;
    private int licenseBackgroundColor;
    private int licenseTextColor;
    private Drawable backgroundLicense;

    public int getTitleBackgroundColor() {
        return titleBackgroundColor;
    }

    public CustomUI setTitleBackgroundColor(int titleBackgroundColor) {
        this.titleBackgroundColor = titleBackgroundColor;
        return this;
    }

    public int getTitleTextColor() {
        return titleTextColor;
    }

    public CustomUI setTitleTextColor(int titleTextColor) {
        this.titleTextColor = titleTextColor;
        return this;
    }

    public int getLicenseBackgroundColor() {
        return licenseBackgroundColor;
    }

    public CustomUI setLicenseBackgroundColor(int licenseBackgroundColor) {
        this.licenseBackgroundColor = licenseBackgroundColor;
        return this;
    }

    public int getLicenseTextColor() {
        return licenseTextColor;
    }

    public CustomUI setLicenseTextColor(int licenseTextColor) {
        this.licenseTextColor = licenseTextColor;
        return this;
    }

    public Drawable getBackgroundLicense() {return backgroundLicense;}

    public CustomUI setBackgroundLicense(Drawable  drawable){
        this.backgroundLicense = drawable;
        return this;
    }

}
