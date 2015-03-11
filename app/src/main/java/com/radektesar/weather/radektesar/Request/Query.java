package com.radektesar.weather.radektesar.Request;

/**
 * Created by Radek on 10. 3. 2015.
 */
public class Query {

    private String value;

    private Query(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static Query value(String value) {
        return new Query(value);
    }

    public static Query cityCountry(String city, String country) {
        return value(String.format("%s,%s", city, country));
    }

    public static Query ipAddress(String ipAddress) {
        return value(ipAddress);
    }

    /**
     * UK or Canada Postal Code or US Zipcode
     * @param zipCode zipCode (SW1 or 90201)
     * @return
     */
    public static Query zipCode(String zipCode) {
        return value(zipCode);
    }

    public static Query latLng(double lat, double lng) {
        return value(String.format("%s,%s", lat, lng));
    }

}
