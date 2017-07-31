package io.altar.parkee.view;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import io.altar.parkee.model.Account;
import io.altar.parkee.service.RegisterService;
import io.altar.parkee.utils.LoginFilter;

@Named("RegisterBean")
@RequestScoped
public class RegisterBean {
	
	@Inject
	private RegisterService registerService;
	
	private Account newAccount = new Account();
	
	public Account getNewAccount() {
		return newAccount;
	}
	public void setNewAccount(Account newAccount) {
		this.newAccount = newAccount;
	}
	
	public void register(){
		registerService.addAccount(newAccount);
		
	}
}
