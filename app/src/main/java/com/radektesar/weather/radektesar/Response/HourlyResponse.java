package com.radektesar.weather.radektesar.Response;

import java.io.Serializable;
import java.util.List;

import it.restrung.rest.annotations.JsonProperty;
import it.restrung.rest.marshalling.response.AbstractJSONResponse;

/**
 * Created by Radek on 11. 3. 2015.
 */
public class HourlyResponse extends AbstractJSONResponse implements Serializable {

    @JsonProperty("time")
    private String time;

    @JsonProperty("tempC")
    private int tempC;

    @JsonProperty("tempF")
    private int tempF;

    @JsonProperty("windspeedMiles")
    private int windspeedMiles;

    @JsonProperty("windspeedKmph")
    private int windspeedKmph;

    @JsonProperty("windspeedKnots")
    private int windspeedKnots;

    @JsonProperty("windspeedMeterSec")
    private int windspeedMeterSec;

    @JsonProperty("widdirDegree")
    private int widdirDegree;

    @JsonProperty("winddir16Point")
    private String winddir16Point;

    @JsonProperty("weatherCode")
    private int weatherCode;

    @JsonProperty("weatherDesc")
    private String weatherDesc;

    @JsonProperty("weatherIconUrl")
    private List<BasicValueResponse> weatherIconUrl;

    @JsonProperty("precipMM")
    private double precipMM;

    @JsonProperty("precipInches")
    private double precipInches;

    @JsonProperty("humidity")
    private int humidity;

    @JsonProperty("visibility")
    private int visibility;

    @JsonProperty("visibilityMiles")
    private int visibilityMiles;

    @JsonProperty("pressure")
    private int pressure;



    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getTempC() {
        return tempC;
    }

    public void setTempC(int tempC) {
        this.tempC = tempC;
    }

    public int getTempF() {
        return tempF;
    }

    public void setTempF(int tempF) {
        this.tempF = tempF;
    }

    public int getWindspeedMiles() {
        return windspeedMiles;
    }

    public void setWindspeedMiles(int windspeedMiles) {
        this.windspeedMiles = windspeedMiles;
    }

    public int getWindspeedKmph() {
        return windspeedKmph;
    }

    public void setWindspeedKmph(int windspeedKmph) {
        this.windspeedKmph = windspeedKmph;
    }

    public int getWindspeedKnots() {
        return windspeedKnots;
    }

    public void setWindspeedKnots(int windspeedKnots) {
        this.windspeedKnots = windspeedKnots;
    }

    public int getWindspeedMeterSec() {
        return windspeedMeterSec;
    }

    public void setWindspeedMeterSec(int windspeedMeterSec) {
        this.windspeedMeterSec = windspeedMeterSec;
    }

    public int getWiddirDegree() {
        return widdirDegree;
    }

    public void setWiddirDegree(int widdirDegree) {
        this.widdirDegree = widdirDegree;
    }

    public String getWinddir16Point() {
        return winddir16Point;
    }

    public void setWinddir16Point(String winddir16Point) {
        this.winddir16Point = winddir16Point;
    }

    public int getWeatherCode() {
        return weatherCode;
    }

    public void setWeatherCode(int weatherCode) {
        this.weatherCode = weatherCode;
    }

    public String getWeatherDesc() {
        return weatherDesc;
    }

    public void setWeatherDesc(String weatherDesc) {
        this.weatherDesc = weatherDesc;
    }

    public List<BasicValueResponse> getWeatherIconUrl() {
        return weatherIconUrl;
    }

    public void setWeatherIconUrl(List<BasicValueResponse> weatherIconUrl) {
        this.weatherIconUrl = weatherIconUrl;
    }

    public double getPrecipMM() {
        return precipMM;
    }

    public void setPrecipMM(double precipMM) {
        this.precipMM = precipMM;
    }

    public double getPrecipInches() {
        return precipInches;
    }

    public void setPrecipInches(double precipInches) {
        this.precipInches = precipInches;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
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

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public int getPressureInches() {
        return pressureInches;
    }

    public void setPressureInches(int pressureInches) {
        this.pressureInches = pressureInches;
    }

    public int getCloudcover() {
        return cloudcover;
    }

    public void setCloudcover(int cloudcover) {
        this.cloudcover = cloudcover;
    }

    public int getChanceofrain() {
        return chanceofrain;
    }

    public void setChanceofrain(int chanceofrain) {
        this.chanceofrain = chanceofrain;
    }

    public int getChancefwindy() {
        return chancefwindy;
    }

    public void setChancefwindy(int chancefwindy) {
        this.chancefwindy = chancefwindy;
    }

    public int getChancefovercast() {
        return chancefovercast;
    }

    public void setChancefovercast(int chancefovercast) {
        this.chancefovercast = chancefovercast;
    }

    public int getChanceofsunny() {
        return chanceofsunny;
    }

    public void setChanceofsunny(int chanceofsunny) {
        this.chanceofsunny = chanceofsunny;
    }

    public int getChanceoffrost() {
        return chanceoffrost;
    }

    public void setChanceoffrost(int chanceoffrost) {
        this.chanceoffrost = chanceoffrost;
    }

    public int getChanceoffog() {
        return chanceoffog;
    }

    public void setChanceoffog(int chanceoffog) {
        this.chanceoffog = chanceoffog;
    }

    public int getChanceofhunder() {
        return chanceofhunder;
    }

    public void setChanceofhunder(int chanceofhunder) {
        this.chanceofhunder = chanceofhunder;
    }

    private int pressureInches;
    private int cloudcover;
    private int chanceofrain;
    private int chancefwindy;
    private int chancefovercast;
    private int chanceofsunny;
    private int chanceoffrost;
    private int chanceoffog;
    private int chanceofhunder;


}
