package com.radektesar.weather.radektesar.Provider;

import com.radektesar.weather.radektesar.Client.WorldWeatherOnlineApiClient;
import com.radektesar.weather.radektesar.WorldWeatherOnlineApiClientImpl;

/**
 * Created by Radek on 10. 3. 2015.
 */
public class WorldWeatherOnlineApiProvider {

    private static WorldWeatherOnlineApiClient instance = new WorldWeatherOnlineApiClientImpl();

    private WorldWeatherOnlineApiProvider() {
    }

    public static WorldWeatherOnlineApiClient getClient() {
        if (instance == null) {
            instance = new WorldWeatherOnlineApiClientImpl();
        }
        return instance;
    }
}
