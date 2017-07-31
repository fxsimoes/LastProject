package io.altar.parkee.service;



import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

import io.altar.parkee.model.Account;
import io.altar.parkee.repository.AccountRepository;
import io.altar.parkee.view.RegisterBean;

@Named("RegisterService")
@RequestScoped
public class RegisterService {
	


	@Inject
	private AccountRepository accountList;
	
	@Transactional
	public Account addAccount(Account newAccount) {
		//adicionar condicoes ao registo de conta, limite de pass e email etc
		accountList.create(newAccount);
		newAccount.setRegistered(true);
		return newAccount;
	}
	
	

}