package com.radektesar.weather.radektesar.Adapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.radektesar.weather.radektesar.R;

import java.util.ArrayList;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * Created by Radek on 10. 3. 2015.
 */
public class ForecastAdapter extends BaseAdapter {
    @InjectView(R.id.forecastDayTextview)
    TextView day;
    @InjectView(R.id.forecastTempritureTextview)
    TextView tempriture;
    @InjectView(R.id.forecastConditionTextview)
    TextView condition;
    @InjectView(R.id.forecastPictureImageView)
    ImageView picture;


    ArrayList myList = new ArrayList();
    LayoutInflater inflater;
    Context context;

    public ForecastAdapter(Context context, ArrayList myList) {
        this.myList = myList;
        this.context = context;
        inflater = LayoutInflater.from(this.context);        // only context can also be used
    }

    @Override
    public int getCount() {
        return myList.size();
    }

    @Override
    public Object getItem(int position) {
        return myList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }
}
