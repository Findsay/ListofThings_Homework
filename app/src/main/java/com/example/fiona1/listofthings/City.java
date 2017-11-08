package com.example.fiona1.listofthings;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.media.Image;

/**
 * Created by Fiona1 on 07/11/2017.
 */

public class City {

    private int icon;
    private String name;
    private String country;
    private int ranking;

    public City(String name, String country, int ranking, int icon) {
        this.name = name;
        this.country = country;
        this.ranking = ranking;
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public Integer getRanking() {
        return ranking;
    }

    public int getIcon() {
        return icon;
    }
}
