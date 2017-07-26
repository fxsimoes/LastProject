package io.altar.parkee.service;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

import io.altar.parkee.model.Account;
import io.altar.parkee.repository.AccountRepository;


@Named("AccountService")
@RequestScoped
public class AccountService {
	
	@Inject
	private AccountRepository accountList;
	
	public String action(Account account){
//		RequestContext context = RequestContext.getCurrentInstance();
//		context.execute(script);
		
		return "userConsole.xhtml";
	}
	
	
	@Transactional
	public Account addAccount(Account newAccount) {
		accountList.create(newAccount);
		return newAccount;
	}
	
	
}
