package com.radektesar.weather.radektesar.Response;

import java.io.Serializable;
import java.util.List;

import it.restrung.rest.annotations.JsonProperty;
import it.restrung.rest.marshalling.response.AbstractJSONResponse;

/**
 * Created by Radek on 10. 3. 2015.
 */
public class DataResponse extends AbstractJSONResponse implements Serializable {

    /**
     * Contains the current weather condition forecast related information.
     */
    @JsonProperty("current_condition")
    private List<CurrentCondition> currentConditionList;

    /**
     * Contains the information about type of request made by user
     */
    @JsonProperty("request")
    private List<RequestResponse> request;

    /**
     * Contains the weather forecast related information
     */
    @JsonProperty("weather")
    private List<WeatherResponse> weatherList;

    @JsonProperty("animMaps")
    private String animMaps;

    public String getAnimMaps() {
        return animMaps;
    }

    public void setAnimMaps(String animMaps) {
        this.animMaps = animMaps;
    }

    public List<CurrentCondition> getCurrentConditionList() {
        return currentConditionList;
    }

    public void setCurrentConditionList(List<CurrentCondition> currentConditionList) {
        this.currentConditionList = currentConditionList;
    }

    public List<RequestResponse> getRequest() {
        return request;
    }

    public void setRequest(List<RequestResponse> request) {
        this.request = request;
    }

    public List<WeatherResponse> getWeatherList() {
        return weatherList;
    }

    public void setWeatherList(List<WeatherResponse> weatherList) {
        this.weatherList = weatherList;
    }
}
