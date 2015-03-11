package com.radektesar.weather.radektesar.Fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.radektesar.weather.radektesar.Provider.WorldWeatherOnlineApiProvider;
import com.radektesar.weather.radektesar.R;
import com.radektesar.weather.radektesar.Request.Query;
import com.radektesar.weather.radektesar.Response.WeatherResponse;
import com.radektesar.weather.radektesar.Response.WorldWeatherOnlineResponse;

import butterknife.InjectView;
import it.restrung.rest.cache.RequestCache;
import it.restrung.rest.client.ContextAwareAPIDelegate;



/**
 * Created by Radek on 10. 3. 2015.
 */
public class TodayFragment extends Fragment {
    @InjectView(R.id.TodayCityState)
    EditText todayCityState;
    @InjectView(R.id.TodayTemperatureCondition)
    EditText todayTemperatureCondition;
    @InjectView(R.id.TodayHumidity)
    EditText todayHumidity;
    @InjectView(R.id.TodayPrecipitation)
    EditText todayPrecipitation;
    @InjectView(R.id.TodayPresure)
    EditText todayPresure;
    @InjectView(R.id.TodayWindSpeed)
    EditText todayWindSpeed;
    @InjectView(R.id.TodayDiction)
    EditText todayDiction;
    @InjectView(R.id.TodayIcon)
    EditText todayIcon;

    private WeatherResponse mWeatherResponse;
    private int done = 1000;

    public TodayFragment(){}
    private String ApiKey = "fc7523943d0c78dd9ead654f50b81";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_today, container, false);

        toNevim();


        return rootView;

    }
    public void toNevim(){

        WorldWeatherOnlineApiProvider.getClient().query(new ContextAwareAPIDelegate<WorldWeatherOnlineResponse>(getActivity(),
                WorldWeatherOnlineResponse.class, RequestCache.LoadPolicy.NEVER, RequestCache.StoragePolicy.DISABLED) {
            @Override
            public void onResults(WorldWeatherOnlineResponse worldWeatherOnlineResponse) {
                //  Toast.makeText(getBaseContext(), worldWeatherOnlineResponse.getData().getCurrentConditionList().get(0).getWeatherDesc().get(0).getValue(), Toast.LENGTH_LONG).show();
                todayCityState.setText(getString(mWeatherResponse.getTempMinC()));
                todayTemperatureCondition.setText(getString(mWeatherResponse.getTempMinC()));
                todayHumidity.setText(getString(mWeatherResponse.getTempMinC()));
                todayPrecipitation.setText(getString(mWeatherResponse.getTempMinC()));
                todayPresure.setText(getString(mWeatherResponse.getTempMinC()));
                todayWindSpeed.setText(getString(mWeatherResponse.getTempMinC()));
                todayDiction.setText(getString(mWeatherResponse.getTempMinC()));
                todayIcon.setText(getString(mWeatherResponse.getTempMinC()));
            }

            @Override
            public void onError(Throwable e) {

            }
        }, ApiKey, 3, Query.latLng(48.85, 2.35));


    }

}
