package com.example.fiona1.listofthings;

import android.graphics.drawable.Drawable;

import java.util.ArrayList;

/**
 * Created by Fiona1 on 07/11/2017.
 */

public class TopEuropeanCities {

    ArrayList<City> listOfCities;

    public TopEuropeanCities() {
        listOfCities = new ArrayList<>();

        listOfCities.add(new City("Glasgow", "Scotland", 1, "flag1"));
        listOfCities.add(new City("Copenhagen", "Denmark", 2, "flag2"));
        listOfCities.add(new City("Stockholm", "Sweden", 3, "flag1"));
        listOfCities.add(new City("Bergen", "Norway", 4, "flag2"));
        listOfCities.add(new City("Amsterdam", "Holland", 5, "flag2"));
        listOfCities.add(new City("Berlin", "Germany", 6, "flag2"));
        listOfCities.add(new City("Rome", "Italy", 7, "flag2"));
        listOfCities.add(new City("Barcelona", "Spain", 8, "flag2"));
        listOfCities.add(new City("Paris", "Frances", 9, "flag2"));
        listOfCities.add(new City("Istanbul", "Turkey", 10, "flag2"));
        listOfCities.add(new City("Lisbon", "Portugal", 11, "flag2"));
        listOfCities.add(new City("Budapest", "Hungary", 12, "flag1"));
        listOfCities.add(new City("Dublin", "Ireland", 13, "flag2"));
        listOfCities.add(new City("London", "England", 14, "flag2"));
        listOfCities.add(new City("Crete", "Greece", 15, "flag2"));
    }

    public ArrayList<City> getListOfCities() {
        return listOfCities;
    }
}
