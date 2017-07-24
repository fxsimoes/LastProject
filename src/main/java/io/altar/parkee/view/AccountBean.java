package io.altar.parkee.view;

import javax.annotation.ManagedBean;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import io.altar.parkee.model.Account;
import io.altar.parkee.service.AccountService;

import java.io.Serializable;

@Named("Account")
@ManagedBean
@SessionScoped
public class AccountBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Account account = new Account();
	private boolean loggedIn = false;
	
	@Inject
	private AccountService accountService;
	
	public boolean isLoggedIn() {
		return loggedIn;
	}
	public void setLoggedIn(boolean loggedIn) {
		this.loggedIn = loggedIn;
	}
	
	public String action(){
		loggedIn = true;
		return " ";
	}
	
//	public Account signIn(){
//		
//	}
	
}