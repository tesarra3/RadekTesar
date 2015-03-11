package com.radektesar.weather.radektesar.Response;

import java.io.Serializable;

import it.restrung.rest.annotations.JsonProperty;
import it.restrung.rest.marshalling.response.AbstractJSONResponse;

/**
 * Created by Radek on 10. 3. 2015.
 */
public class RequestResponse extends AbstractJSONResponse implements Serializable {

    /**
     * Query sent by user to get weather data. For e.g.:- G3, 90201, etc
     */
    @JsonProperty("query")
    private String query;

    /**
     * Type of request i.e. city, latlon, postcode, zipcode, etc
     */
    @JsonProperty("type")
    private String type;

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
