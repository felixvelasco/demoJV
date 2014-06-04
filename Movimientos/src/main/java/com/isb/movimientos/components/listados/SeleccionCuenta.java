package com.isb.movimientos.components.listados;

import java.io.Serializable;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.vectorsf.jvoiceframework.core.AudioItem;
import com.vectorsf.jvoiceframework.core.Grammar;
import com.vectorsf.jvoiceframework.core.Input;
import com.vectorsf.jvoiceframework.core.Wording;
import com.vectorsf.jvoiceframework.core.bean.factory.JvoiceBeanService;

import org.springframework.beans.factory.annotation.Autowired;

@Component("com_isb_movimientos_components_listados_SeleccionCuenta")
@Scope("prototype")
public class SeleccionCuenta implements Serializable {

	private static final long serialVersionUID = 1L;
	@Autowired
	private JvoiceBeanService jvoiceBeanService;

	public Accounts getAccounts(long numeroDePersona) {
		Accounts ret = new Accounts();
		ret.addAccount("0015 1332 43 3444145664");
		ret.addAccount("0015 1332 43 7384162849");
		ret.addAccount("0030 1234 56 1746282371");

		return ret;
	}

	public Input seleccionCuenta(Accounts accounts) {
		Input ret = jvoiceBeanService.getInput();
		Grammar grammar = jvoiceBeanService.getGrammar();
		grammar.setMode("dtmf");
		grammar.setSrc("builtin:digits?length=5");
		ret.getGrammars().add(grammar);

		AudioItem audioItem = jvoiceBeanService.getAudioItem();
		Wording wording = jvoiceBeanService.getWording();
		wording.setText("Por favor, seleccione una de las siguientes cuentas:");
		audioItem.setWording(wording);
		ret.getMainAudios().add(audioItem);

		for (int index = 0; index < accounts.getAccountList().size(); index++) {
			Account act = accounts.getAccountList().get(index);
			AudioItem audioItemAct = jvoiceBeanService.getAudioItem();
			Wording wordingAct = jvoiceBeanService.getWording();
			wordingAct.setText("Para la cuenta terminada en "
					+ act.getAccountNumber().substring(16) + " pulse "
					+ (index + 1) + ".");
			audioItemAct.setWording(wording);

			ret.getMainAudios().add(audioItemAct);
		}

		return ret;
	}
}
