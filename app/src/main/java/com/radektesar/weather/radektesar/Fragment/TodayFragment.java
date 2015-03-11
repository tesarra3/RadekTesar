package com.radektesar.weather.radektesar.Fragment;

import android.app.Fragment;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.gson.Gson;
import com.radektesar.weather.radektesar.Client.JSONParser;
import com.radektesar.weather.radektesar.R;
import com.radektesar.weather.radektesar.Response.CurrentCondition;
import com.radektesar.weather.radektesar.Response.Weather;
import com.radektesar.weather.radektesar.Response.WorldWeatherOnlineResponse;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import butterknife.ButterKnife;
import butterknife.InjectView;




/**
 * Created by Radek on 10. 3. 2015.
 */
public class TodayFragment extends Fragment {
    @InjectView(R.id.TodayCityState)
    TextView todayCityState;
    @InjectView(R.id.TodayTemperatureCondition)
    TextView todayTemperatureCondition;
    @InjectView(R.id.TodayHumidity)
    TextView todayHumidity;
    @InjectView(R.id.TodayPrecipitation)
    TextView todayPrecipitation;
    @InjectView(R.id.TodayPresure)
    TextView todayPresure;
    @InjectView(R.id.TodayWindSpeed)
    TextView todayWindSpeed;
    @InjectView(R.id.TodayDiction)
    TextView todayDiction;
    @InjectView(R.id.TodayIcon)
    ImageView todayIcon;

    JSONParser jParser = new JSONParser();

    public WorldWeatherOnlineResponse jsonUsers;

    private Weather mWeatherResponse;
    private CurrentCondition mCurrentCondition;


    public TodayFragment(){}
    private String ApiKey = "fc7523943d0c78dd9ead654f50b81";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_today, container, false);
        ButterKnife.inject(TodayFragment.this, rootView);



        new LoadAllProducts().execute();
       // todayCityState.setText(mCurrentCondition.getHumidity());


        return rootView;

    }


    public class LoadAllProducts extends AsyncTask<String, String, String> {



        @Override
        protected void onPreExecute() {
            super.onPreExecute();


        }


        protected String doInBackground(String... args) {
            // Building Parameters

            List<NameValuePair> params = new ArrayList<NameValuePair>();
            String url_all_products = "https://api.worldweatheronline.com/free/v2/weather.ashx";
            String paramss = "format=json&num_of_days=3&key=fc7523943d0c78dd9ead654f50b81&q=Prague";
            params.add(new BasicNameValuePair("USERNAME",paramss));
            JSONObject json = jParser.makeHttpRequest(url_all_products, "GET", params);

            Gson gson = new Gson();
            jsonUsers = gson.fromJson(json.toString(), WorldWeatherOnlineResponse.class);



            Log.d("Server Response: ", json.toString());


            return null;
        }


        protected void onPostExecute(String file_url) {
//TODO move strings to xml
            //TODO make version for miles and F
            todayCityState.setText(jsonUsers.getData().getRequest().get(0).getQuery());
            todayTemperatureCondition.setText(jsonUsers.getData().getCurrentCondition().get(0).getTempC() + "°C| " + jsonUsers.getData().getCurrentCondition().get(0).getWeatherDesc().get(0).getValue());
            todayHumidity.setText(jsonUsers.getData().getCurrentCondition().get(0).getHumidity() + "%");
            todayPrecipitation.setText(jsonUsers.getData().getCurrentCondition().get(0).getPrecipMM() + " mm");
            todayPresure.setText(jsonUsers.getData().getCurrentCondition().get(0).getPressure() + " hPa");
            todayWindSpeed.setText(jsonUsers.getData().getCurrentCondition().get(0).getWindspeedKmph() + " Km/h");
            todayDiction.setText(jsonUsers.getData().getCurrentCondition().get(0).getWinddir16Point());

        }

    }
}
