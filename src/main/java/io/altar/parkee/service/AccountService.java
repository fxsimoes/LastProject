package io.altar.parkee.service;

import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

import org.primefaces.context.RequestContext;

import io.altar.parkee.model.Account;
import io.altar.parkee.repository.AccountRepository;
import java.io.Serializable;


@Named("AccountService")
@SessionScoped
public class AccountService extends EntityService<Account> implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Inject
	private AccountRepository accountList;
	
	public void login(Account account){

		
		if(!account.isLoggedIn()){
		
		if(accountList.loginControl(account.getEmail(), account.getPassword())){
			account.setLoggedIn(true);
			
			if(account.getEmail().equals("admin")){
				account.setAdmin(true);
			}
			
			RequestContext.getCurrentInstance().update("growl");
			FacesContext context = FacesContext.getCurrentInstance();
			context.addMessage(null, new FacesMessage("Sucess", "Login Sucessfull!"));
			
		} else {
			
			RequestContext.getCurrentInstance().update("growl");
			FacesContext context = FacesContext.getCurrentInstance();
			context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Error", "Username or Password invalid!"));
			}
		}
	}
}
