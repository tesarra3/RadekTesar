package com.radektesar.weather.radektesar.Response;

import java.io.Serializable;
import java.util.List;

import it.restrung.rest.annotations.JsonProperty;
import it.restrung.rest.marshalling.response.AbstractJSONResponse;

/**
 * Created by Radek on 10. 3. 2015.
 */
public class WeatherResponse extends AbstractJSONResponse implements Serializable {

    /**
     * Local forecast date, formatted as 'yyyy-MM-dd'. e.g.:- 2008-05-31
     */
    @JsonProperty("date")
    private String date;

    /**
     * Maximum temperature of the day in degree Celsius
     */
    @JsonProperty("tempMaxC")
    private int tempMaxC;

    /**
     * Maximum temperature of the day in degree Fahrenheit
     */
    @JsonProperty("tempMaxF")
    private int tempMaxF;

    /**
     * Minimum temperature of the day in degree Celsius
     */
    @JsonProperty("tempMinC")
    private int tempMinC;

    /**
     * Minimum temperature of the day in degree Fahrenheit
     */
    @JsonProperty("tempMinF")
    private int tempMinF;

    @JsonProperty("astronomy")
    private AstronomyResponse astronomy;

    @JsonProperty("uvIndex")
    private int uvIndex;

    @JsonProperty("hourly")
    private HourlyResponse hourly;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getTempMaxC() {
        return tempMaxC;
    }

    public void setTempMaxC(int tempMaxC) {
        this.tempMaxC = tempMaxC;
    }

    public int getTempMaxF() {
        return tempMaxF;
    }

    public void setTempMaxF(int tempMaxF) {
        this.tempMaxF = tempMaxF;
    }

    public int getTempMinC() {
        return tempMinC;
    }

    public void setTempMinC(int tempMinC) {
        this.tempMinC = tempMinC;
    }

    public int getTempMinF() {
        return tempMinF;
    }

    public void setTempMinF(int tempMinF) {
        this.tempMinF = tempMinF;
    }

    public int getUvIndex() {
        return uvIndex;
    }

    public void setUvIndex(int uvIndex) {
        this.uvIndex = uvIndex;
    }

    public AstronomyResponse getAstronomy() {
        return astronomy;
    }

    public void setAstronomy(AstronomyResponse astronomy) {
        this.astronomy = astronomy;
    }

    public HourlyResponse getHourly() {
        return hourly;
    }

    public void setHourly(HourlyResponse hourly) {
        this.hourly = hourly;
    }




   /* public int getWindSpeedMiles() {
        return windSpeedMiles;
    }

    public void setWindSpeedMiles(int windSpeedMiles) {
        this.windSpeedMiles = windSpeedMiles;
    }

    public int getWindSpeedKmph() {
        return windSpeedKmph;
    }

    public void setWindSpeedKmph(int windSpeedKmph) {
        this.windSpeedKmph = windSpeedKmph;
    }

    public int getWindDirDegree() {
        return windDirDegree;
    }

    public void setWindDirDegree(int windDirDegree) {
        this.windDirDegree = windDirDegree;
    }

    public String getWindDirection() {
        return windDirection;
    }

    public void setWindDirection(String windDirection) {
        this.windDirection = windDirection;
    }

    public String getWindDir16Point() {
        return windDir16Point;
    }

    public void setWindDir16Point(String windDir16Point) {
        this.windDir16Point = windDir16Point;
    }

    public int getWeatherCode() {
        return weatherCode;
    }

    public void setWeatherCode(int weatherCode) {
        this.weatherCode = weatherCode;
    }

    public List<BasicValueResponse> getWeatherIconUrl() {
        return weatherIconUrl;
    }

    public void setWeatherIconUrl(List<BasicValueResponse> weatherIconUrl) {
        this.weatherIconUrl = weatherIconUrl;
    }

    public List<BasicValueResponse> getWeatherDesc() {
        return weatherDesc;
    }

    public void setWeatherDesc(List<BasicValueResponse> weatherDesc) {
        this.weatherDesc = weatherDesc;
    }

    public double getPrecipMm() {
        return precipMm;
    }

    public void setPrecipMm(double precipMm) {
        this.precipMm = precipMm;
    }*/
}
