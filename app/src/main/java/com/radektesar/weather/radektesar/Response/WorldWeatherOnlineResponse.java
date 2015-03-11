package com.radektesar.weather.radektesar.Response;

import java.io.Serializable;

import it.restrung.rest.annotations.JsonProperty;
import it.restrung.rest.marshalling.response.AbstractJSONResponse;

/**
 * Created by Radek on 10. 3. 2015.
 */
public class WorldWeatherOnlineResponse extends AbstractJSONResponse implements Serializable {
    @JsonProperty("data")
    private DataResponse data;

    public DataResponse getData() {
        return data;
    }

    public void setData(DataResponse data) {
        this.data = data;
    }
}