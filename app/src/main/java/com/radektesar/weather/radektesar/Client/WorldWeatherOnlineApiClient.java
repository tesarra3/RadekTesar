package com.radektesar.weather.radektesar.Client;

import com.radektesar.weather.radektesar.Request.Query;
import com.radektesar.weather.radektesar.Response.WorldWeatherOnlineResponse;

import it.restrung.rest.client.APIDelegate;

/**
 * Created by Radek on 10. 3. 2015.
 */
public interface WorldWeatherOnlineApiClient {

    /**
     * Get weather information
     *
     * @param delegate     Delegate
     * @param apiKey       Your API key
     * @param numberOfDays Number of forescast days (For free API users it is maximum 3)
     * @param query        The location for which you want weather information
     */
    void query(APIDelegate<WorldWeatherOnlineResponse> delegate, String apiKey, int numberOfDays, Query query);

}
