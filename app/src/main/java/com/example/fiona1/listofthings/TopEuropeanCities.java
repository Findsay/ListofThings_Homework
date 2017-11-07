package com.example.fiona1.listofthings;

import java.util.ArrayList;

/**
 * Created by Fiona1 on 07/11/2017.
 */

public class TopEuropeanCities {

    ArrayList<City> listOfCities;

    public TopEuropeanCities() {
        listOfCities = new ArrayList<>();
        listOfCities.add(new City("Glasgow", "Scotland", 1));
        listOfCities.add(new City("Copenhagen", "Denmark", 2));
        listOfCities.add(new City("Stockholm", "Sweden", 3));
        listOfCities.add(new City("Bergen", "Norway", 4));
        listOfCities.add(new City("Amsterdam", "Holland", 5));
        listOfCities.add(new City("Berlin", "Germany", 6));
        listOfCities.add(new City("Rome", "Italy", 7));
        listOfCities.add(new City("Barcelona", "Spain", 8));
        listOfCities.add(new City("Paris", "Frances", 9));
        listOfCities.add(new City("Istanbul", "Turkey", 10));
        listOfCities.add(new City("Lisbon", "Portugal", 11));
        listOfCities.add(new City("Budapest", "Hungary", 12));
        listOfCities.add(new City("Dublin", "Ireland", 13));
        listOfCities.add(new City("London", "England", 14));
        listOfCities.add(new City("Crete", "Greece", 15));
    }

    public ArrayList<City> getListOfCities() {
        return listOfCities;
    }
}
