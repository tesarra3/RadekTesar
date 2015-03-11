package com.radektesar.weather.radektesar;

import com.radektesar.weather.radektesar.Client.WorldWeatherOnlineApiClient;
import com.radektesar.weather.radektesar.Request.Query;
import com.radektesar.weather.radektesar.Response.WorldWeatherOnlineResponse;

import it.restrung.rest.client.APIDelegate;
import it.restrung.rest.client.RestClient;
import it.restrung.rest.client.RestClientFactory;

/**
 * Created by Radek on 10. 3. 2015.
 */
public class WorldWeatherOnlineApiClientImpl implements WorldWeatherOnlineApiClient {

    private RestClient client = RestClientFactory.getClient();

    private String endpoint = "https://api.worldweatheronline.com/free/v2/weather.ashx?";

    private String getEndpoint(String path) {
        return String.format("%s%s", endpoint, path);
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    @Override
    public void query(APIDelegate<WorldWeatherOnlineResponse> delegate, String apiKey, int numberOfDays, Query query) {
        client.getAsync(delegate, getEndpoint("format=json&num_of_days=%s&key=%s&q=%s"), String.valueOf(numberOfDays), apiKey, query.getValue());
    }
}
