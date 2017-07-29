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
	
	public String login(Account account){
//		RequestContext context = RequestContext.getCurrentInstance();
//		context.execute(script);
		
//		account.
		System.out.println("teste acc service");
		
		if(accountList.loginControl(account.getEmail(), account.getPassword())){
			System.out.println("passa no login control");
			account.setLoggedIn(true);
			return "overviewUser.xhtml";
		} 
		
		System.out.println("NAO passa no login control");
		RequestContext.getCurrentInstance().update("growl");
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Error", "Username or Password invalid!"));
		return "login.xhtml";
	
		
		
//	public String logout(account){
//		return "";
//	}
		
			
		
	
	
	}


	
	
}
