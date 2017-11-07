package com.example.fiona1.listofthings;

/**
 * Created by Fiona1 on 07/11/2017.
 */

public class City {

    private String name;
    private String country;
    private int ranking;

    public City(String name, String country, int ranking) {
        this.name = name;
        this.country = country;
        this.ranking = ranking;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public int getRanking() {
        return ranking;
    }
}
