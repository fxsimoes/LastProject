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
	
	@Inject
	private AccountService accountService;
	

	private Account account;
	

	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}

	public void action(){
	
		account.setLoggedIn(true);
		
		if(account.isLoggedIn() == true){
			System.out.println("teste");
		} else {
			System.out.println("desteste");
		}
		
		accountService.action(account);
	}
	

	
}
