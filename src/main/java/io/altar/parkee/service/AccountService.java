package io.altar.parkee.service;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

import org.primefaces.context.RequestContext;

import io.altar.parkee.model.Account;
import io.altar.parkee.repository.AccountRepository;


@Named("AccountService")
@RequestScoped
public class AccountService extends EntityService<Account>{
	
	@Inject
	private AccountRepository accountList;
	
	public String login(Account account){
//		RequestContext context = RequestContext.getCurrentInstance();
//		context.execute(script);
		
//		account.
		System.out.println("teste acc service");
		if(accountList.loginControl(account.getEmail(), account.getPassword())){
			account.setLoggedIn(true);
			return "useraccount.xhtml";
		} 
		RequestContext.getCurrentInstance().update("growl");
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Error", "Username or Password invalid!"));
		return "login.xhtml";
		
		
//	public String logout(account){
//		return "";
//	}
		
			
		
	
	
	}


	
	
}
