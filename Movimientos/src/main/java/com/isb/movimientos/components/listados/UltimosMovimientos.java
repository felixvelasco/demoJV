package com.isb.movimientos.components.listados;

import java.io.Serializable;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("com_isb_movimientos_components_listados_UltimosMovimientos")
@Scope("prototype")
public class UltimosMovimientos implements Serializable {

	private static final long serialVersionUID = 1L;

	// Add your methods here
}
