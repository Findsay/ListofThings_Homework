package com.example.fiona1.listofthings;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class TopCitiesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_cities);

        TopEuropeanCities topCities = new TopEuropeanCities();
        ArrayList<City> cityList = topCities.getListOfCities();

        TopCityAdapter cityAdapter = new TopCityAdapter(this, cityList);

        ListView listView = (ListView)findViewById(R.id.cityList);
        listView.setAdapter(cityAdapter);



    }
}
