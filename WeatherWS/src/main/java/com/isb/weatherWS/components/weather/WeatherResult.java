package com.isb.weatherWS.components.weather;

import java.io.Serializable;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.cdyne.ws.weatherws.WeatherReturn;

@Component
@Scope("prototype")
public class WeatherResult implements Serializable {

	private static final long serialVersionUID = -1520868337364703561L;

	private String locution;

	public WeatherResult() {
		setLocution("Información no disponible");
	}

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
