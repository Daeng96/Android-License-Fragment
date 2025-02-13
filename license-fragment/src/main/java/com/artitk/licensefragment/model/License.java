package com.artitk.licensefragment.model;

import android.content.Context;
import android.support.annotation.RawRes;

import com.artitk.licensefragment.utils.ResourceManager;

/**
 * License data class.
 */
public class License {

    private final Context context;
    private final String title;
    private int licenseTemplateRawId;
    private final LicenseType licenseType;
    private final String year;
    private final String owner;

    protected License(Context context, int licenseId) {
        this.context = context;

        switch (licenseId) {
            /* ----- This Library ----- */
            case LicenseID.LICENSE_FRAGMENT:
                title = "License Fragment";
                licenseType = LicenseType.APACHE_LICENSE_20;
                year = "2015";
                owner = "Artit Kiuwilai";
                break;
            /* ----- Google Library ----- */
            case LicenseID.GSON:
                title = "Gson";
                licenseType = LicenseType.APACHE_LICENSE_20;
                year = "2008";
                owner = "Google Inc.";
                break;
            /* ----- Square Library ----- */
            case LicenseID.OTTO:
                title = "Otto";
                licenseType = LicenseType.APACHE_LICENSE_20;
                year = "2013";
                owner = "Square, Inc.";
                break;
            case LicenseID.OKHTTP:
                title = "OkHttp";
                licenseType = LicenseType.APACHE_LICENSE_20;
                year = "2016";
                owner = "Square, Inc.";
                break;
            case LicenseID.RETROFIT:
                title = "Retrofit";
                licenseType = LicenseType.APACHE_LICENSE_20;
                year = "2013";
                owner = "Square, Inc.";
                break;
            case LicenseID.PICASSO:
                title = "Picasso";
                licenseType = LicenseType.APACHE_LICENSE_20;
                year = "2013";
                owner = "Square, Inc.";
                break;
            /* ----- Other Library ----- */
            case LicenseID.ADHANPREC:
                title = "Adhan Java";
                licenseType = LicenseType.MIT_LICENSE;
                year = "2016";
                owner = "Batoul Apps";
                break;
            case LicenseID.AZAN:
                title = "Azan";
                licenseType = LicenseType.APACHE_LICENSE_20;
                year = "2016";
                owner = "Ahmed Eltaher";
                break;
            case LicenseID.HERESDK:
                title="HERE SDK";
                licenseType= LicenseType.APACHE_LICENSE_20;
                year="2019-2021";
                owner="HERE Europa B.V";
                break;
            default:
                throw new IllegalArgumentException();
        }
    }

    /**
     * Use this constructor for create instance.
     *
     * @param context     {@link Context} class.
     * @param title       Open-source library name.
     * @param licenseType Type of License. Use constant from {@link LicenseType} enum. Don't use CUSTOM_LICENSE here.
     * @param year        Year.
     * @param owner       Owner name.
     */
    public License(Context context, String title, LicenseType licenseType, String year, String owner) {
        this.context = context;
        this.title = title;
        this.licenseType = licenseType;
        this.year = year;
        this.owner = owner;
    }

    /**
     * Use this constructor for create instance of Custom License Type
     *
     * @param context              {@link Context} class.
     * @param title                Open-source library name.
     * @param licenseTemplateRawId Raw ID of custom license template.
     * @param year                 Year.
     * @param owner                Owner name.
     */
    public License(Context context, String title, @RawRes int licenseTemplateRawId, String year, String owner) {
        this(context, title, LicenseType.CUSTOM_LICENSE, year, owner);
        this.licenseTemplateRawId = licenseTemplateRawId;
    }

    /**
     * @return Open-source library name.
     */
    public String getTitle() {
        return title;
    }

    /**
     * @return Wording for display Open-source license.
     */
    public String getLicense() {
        if (licenseType == LicenseType.CUSTOM_LICENSE) {
            return String.format(new ResourceManager(context).readRawFile(licenseTemplateRawId), year, owner, title);
        }
        return String.format(new ResourceManager(context).readRawFile(licenseType), year, owner);
    }

}
