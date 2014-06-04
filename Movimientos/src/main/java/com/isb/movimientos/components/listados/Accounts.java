package com.isb.movimientos.components.listados;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Accounts implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<Account> accountList = new ArrayList<>();

	public void addAccount(String accountNumber) {
		accountList.add(new Account(accountNumber));
		
	}

	public List<Account> getAccountList() {
		return accountList;
	}

}
