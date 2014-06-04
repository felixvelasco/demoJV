package com.isb.movimientos.components.listados;

import java.io.Serializable;

public class Account implements Serializable {

	private final String accountNumber;

	public Account(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

}
