package com.isb.weatherWS.components.weather;

import java.io.Serializable;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("com_isb_weatherWS_components_weather_Flow")
@Scope("prototype")
public class Flow implements Serializable {

	private static final long serialVersionUID = 1L;

	public WeatherResult getWeatherInfo(String zipCode) {
		// TODO
		return null;
	}
}
