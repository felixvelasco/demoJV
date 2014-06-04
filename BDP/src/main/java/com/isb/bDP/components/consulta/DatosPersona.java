package com.isb.bDP.components.consulta;

import java.io.Serializable;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class DatosPersona implements Serializable {

	private static final long serialVersionUID = 1607127916335791722L;

	private long numeroDePersona;
	private String lastName;
	private String name;
	
	public long getNumeroDePersona() {
		return numeroDePersona;
	}
	public void setNumeroDePersona(long numeroDePersona) {
		this.numeroDePersona = numeroDePersona;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
