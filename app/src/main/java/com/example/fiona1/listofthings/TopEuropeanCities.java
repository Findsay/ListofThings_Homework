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

        listOfCities.add(new City("Glasgow", "Scotland", 1, R.drawable.flag1));
        listOfCities.add(new City("Copenhagen", "Denmark", 2, R.drawable.flag2));
        listOfCities.add(new City("Stockholm", "Sweden", 3, R.drawable.flag3));
        listOfCities.add(new City("Bergen", "Norway", 4, R.drawable.flag4));
        listOfCities.add(new City("Amsterdam", "Holland", 5, R.drawable.flag5));
        listOfCities.add(new City("Berlin", "Germany", 6, R.drawable.flag6));
        listOfCities.add(new City("Rome", "Italy", 7, R.drawable.flag7));
        listOfCities.add(new City("Barcelona", "Spain", 8, R.drawable.flag8));
        listOfCities.add(new City("Paris", "France", 9, R.drawable.flag9));
        listOfCities.add(new City("Istanbul", "Turkey", 10, R.drawable.flag10));
        listOfCities.add(new City("Lisbon", "Portugal", 11, R.drawable.flag11));
        listOfCities.add(new City("Budapest", "Hungary", 12, R.drawable.flag12));
        listOfCities.add(new City("Dublin", "Ireland", 13, R.drawable.flag13));
        listOfCities.add(new City("London", "England", 14, R.drawable.flag14));
        listOfCities.add(new City("Crete", "Greece", 15, R.drawable.flag15));
    }

    public ArrayList<City> getListOfCities() {
        return listOfCities;
    }
}
