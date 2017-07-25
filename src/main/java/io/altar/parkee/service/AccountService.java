package io.altar.parkee.service;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import io.altar.parkee.model.Account;


@Named("AccountService")
@RequestScoped
public class AccountService {
	
	public String action(Account account){
		account.setLoggedIn(true);
		return "userConsole.xhtml";
	}
}
