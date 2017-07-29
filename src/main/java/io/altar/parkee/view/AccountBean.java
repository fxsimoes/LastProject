package io.altar.parkee.view;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

import io.altar.parkee.model.Account;
import io.altar.parkee.service.AccountService;

@Named("AccountBean")
@SessionScoped
public class AccountBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Inject
	private AccountService accountService;
	

	private Account account = new Account();
	

	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}

	public void login(){
		
		accountService.login(account);
	}
	
//	public void logout(){
//		
//		accountService.logout(account);
//	}
	

	
}
