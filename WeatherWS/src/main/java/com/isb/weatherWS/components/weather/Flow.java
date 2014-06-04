package com.isb.weatherWS.components.weather;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.cdyne.ws.weatherws.WeatherReturn;
import com.cdyne.ws.weatherws.WeatherSoap;
import com.vectorsf.jvoiceframework.core.service.ws.WebServiceProvider;

@Component("com_isb_weatherWS_components_weather_Flow")
@Scope("prototype")
public class Flow implements Serializable {

	private static final long serialVersionUID = 1L;

	@Autowired
	private WebServiceProvider wsprovider;	

	public WeatherResult getWeatherInfo(String zipCode) {
	
		WeatherSoap weatherClient = wsprovider.getClient(WeatherSoap.class, "WeatherSoap");
		
		WeatherReturn response = weatherClient.getCityWeatherByZIP(zipCode);
		
		WeatherResult ret = new WeatherResult(response);
		return ret;
	}
}
