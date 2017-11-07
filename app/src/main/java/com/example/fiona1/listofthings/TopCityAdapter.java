package com.example.fiona1.listofthings;

import android.content.Context;
import android.graphics.Movie;
import android.graphics.drawable.Drawable;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import static android.R.attr.name;
import static android.R.attr.resource;
import static com.example.fiona1.listofthings.R.drawable.flag1;

/**
 * Created by Fiona1 on 07/11/2017.
 */

public class TopCityAdapter extends ArrayAdapter<City> {

    public TopCityAdapter(Context context, ArrayList<City> cities) {
        super(context, 0, cities);
    }

    public View getView(int position, View listItemView, ViewGroup parent){
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.activity_city_item, parent, false);
        }
        City currentCity = getItem(position);

        TextView ranking = (TextView)listItemView.findViewById(R.id.textRank);
        ranking.setText(currentCity.getRanking().toString());

        TextView name = (TextView)listItemView.findViewById(R.id.textName);
        name.setText(currentCity.getName().toString());

        TextView country = (TextView)listItemView.findViewById(R.id.textCountry);
        country.setText(currentCity.getCountry().toString());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.imageCity);

        String imagename = currentCity.getIconName();

        imageView.setImageResource(flag1);








        listItemView.setTag(currentCity);



        return listItemView;


    }


}
