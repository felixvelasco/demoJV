package com.isb.bDP.components.consulta;

public final class BDPMagicFactory {

	private BDPMagicFactory() {
		
	}

	public static DatosPersona createPersonaFromDNI(String dni) {
		DatosPersona dp = new DatosPersona();
		dp.setName("Jose Luis");
		dp.setLastName("Rodriguez");
		dp.setNumeroDePersona(1000000L);
		
		return dp;
	}
}
