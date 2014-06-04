package com.isb.weatherWS.components.weather;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.cdyne.ws.weatherws.WeatherReturn;

@Component
@Scope("prototype")
public class WeatherResult {

	private String locution;

	public WeatherResult(WeatherReturn response) {
		if (response.isSuccess()) {
			String loc = "La temperatura actual en " + response.getCity() + " es de " + response.getTemperature() + " grados fahrenheit.";
			loc += "La humedad relativa es de un " + response.getRelativeHumidity() + " por ciento.";
			setLocution(loc);
		}
		else {
			setLocution("Codigo postal no encontrado");
		}
	}

	public String getLocution() {
		return locution;
	}

	public void setLocution(String locution) {
		this.locution = locution;
	}

}
