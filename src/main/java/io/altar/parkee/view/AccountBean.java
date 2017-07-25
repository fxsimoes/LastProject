package io.altar.parkee.view;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import io.altar.parkee.model.Account;
import io.altar.parkee.service.AccountService;

@Named("AccountBean")
@SessionScoped
public class AccountBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Account account = new Account();
	
	
	@Inject
	private AccountService accountService;
	
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}

	public void action(){
		accountService.action(account);
	}
	
//	public Account signIn(){
//		
//	}
	
}
