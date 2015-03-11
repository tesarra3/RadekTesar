package com.radektesar.weather.radektesar.Response;

import java.io.Serializable;
import java.net.URL;
import java.util.List;

import it.restrung.rest.annotations.JsonProperty;
import it.restrung.rest.marshalling.response.AbstractJSONResponse;

/**
 * Created by Radek on 10. 3. 2015.
 */
public class CurrentCondition extends AbstractJSONResponse implements Serializable {

    /**
     * Time in UTC hhmm tt format. E.g.:- 06:45 AM or 11:34 PM
     */
    @JsonProperty("observation_time")
    private String observationTime;

    /**
     * Temperature in degree Celsius
     */
    @JsonProperty("temp_C")
    private int tempC;

    /**
     * Wind speed in miles per hour
     */
    @JsonProperty("windspeedMiles")
    private int windSpeedMiles;

    /**
     * Wind speed in kilometre per hour
     */
    @JsonProperty("windspeedKmph")
    private int windSpeedKmph;

    /**
     * Wind direction in degree
     */
    @JsonProperty("winddirDegree")
    private int windDirDegree;

    /**
     * Wind direction in 16-point compass
     */
    @JsonProperty("winddir16Point")
    private String windDir16Point;

    /**
     * Weather condition code
     */
    @JsonProperty("weatherCode")
    private int weatherCode;

    /**
     * Weather description text
     */
    @JsonProperty("weatherDesc")
    private List<BasicValueResponse> weatherDesc;

    /**
     * Weather icon url
     */
    @JsonProperty("weatherIconUrl")
    private List<BasicValueResponse> weatherIconUrl;
   // private URL weatherIconUrl;
    /**
     * Precipitation in millimetre
     */
    @JsonProperty("precipMM")
    private double precipMm;

    @JsonProperty("watherDesc")
    private String watherDesc;
    @JsonProperty("precipInches")
    private double precipInches;
    @JsonProperty("visibilityMiles")
    private int visibilityMiles;
    @JsonProperty("pressureInches")
    private double pressureInches;

    /**
     * Humidity in percentage
     */
    @JsonProperty("humidity")
    private double humidity;

    /**
     * Visibility in kilometre (km)
     */
    @JsonProperty("visibility")
    private int visibility;

    /**
     * Atmospheric pressure in millibars
     */
    @JsonProperty("")
    private double pressure;

    /**
     * Cloud cover in percentage
     */
    @JsonProperty("cloudcover")
    private double cloudCover;

    public String getObservationTime() {
        return observationTime;
    }

    public void setObservationTime(String observationTime) {
        this.observationTime = observationTime;
    }

    public int getTempC() {
        return tempC;
    }

    public void setTempC(int tempC) {
        this.tempC = tempC;
    }

    public int getWindSpeedMiles() {
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

    public List<BasicValueResponse> getWeatherDesc() {
        return weatherDesc;
    }

    public void setWeatherDesc(List<BasicValueResponse> weatherDesc) {
        this.weatherDesc = weatherDesc;
    }

 /*   public URL getWeatherIconUrl() {
        return weatherIconUrl;
    }

    public void setWeatherIconUrl(URL weatherIconUrl) {
        this.weatherIconUrl = weatherIconUrl;
    }*/

   public List<BasicValueResponse> getWeatherIconUrl() {
        return weatherIconUrl;
    }

    public void setWeatherIconUrl(List<BasicValueResponse> weatherIconUrl) {
        this.weatherIconUrl = weatherIconUrl;
    }

    public String getWatherDesc() {
        return watherDesc;
    }

    public void setWatherDesc(String watherDesc) {
        this.watherDesc = watherDesc;
    }

    public double getPrecipMm() {
        return precipMm;
    }

    public void setPrecipMm(double precipMm) {
        this.precipMm = precipMm;
    }

    public double getPrecipInches() {
        return precipInches;
    }

    public void setPrecipInches(double precipInches) {
        this.precipInches = precipInches;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public int getVisibility() {
        return visibility;
    }

    public void setVisibility(int visibility) {
        this.visibility = visibility;
    }

    public int getVisibilityMiles() {
        return visibilityMiles;
    }

    public void setVisibilityMiles(int visibilityMiles) {
        this.visibilityMiles = visibilityMiles;
    }


    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public double getPressureInches() {
        return pressureInches;
    }

    public void setPressureInches(double pressureInches) {
        this.pressureInches = pressureInches;
    }

    public double getCloudCover() {
        return cloudCover;
    }

    public void setCloudCover(double cloudCover) {
        this.cloudCover = cloudCover;
    }
}
