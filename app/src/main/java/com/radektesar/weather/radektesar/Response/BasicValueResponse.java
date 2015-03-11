package com.radektesar.weather.radektesar.Response;

import java.io.Serializable;

import it.restrung.rest.marshalling.response.AbstractJSONResponse;

/**
 * Created by Radek on 10. 3. 2015.
 */
public class BasicValueResponse extends AbstractJSONResponse implements Serializable {

    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
