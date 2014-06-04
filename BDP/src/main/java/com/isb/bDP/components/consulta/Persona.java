package com.isb.bDP.components.consulta;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.vectorsf.jvoiceframework.core.bean.LastInputResult;

@Component("com_isb_bDP_components_consulta_Persona")
@Scope("prototype")
public class Persona implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Autowired
	private LastInputResult lastInputResult;

	public DatosPersona getDatos() {
		String dni = lastInputResult.getInterpretation();
		
		DatosPersona persona = BDPMagicFactory.createPersonaFromDNI(dni);
		
		return persona;
	}
}
