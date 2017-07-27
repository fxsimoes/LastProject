package io.altar.parkee.service;



import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

import io.altar.parkee.model.Account;
import io.altar.parkee.repository.AccountRepository;

@Named("RegisterService")
@RequestScoped
public class RegisterService {
	


	@Inject
	private AccountRepository accountList;
	
	@Transactional
	public Account addAccount(Account newAccount) {
		accountList.create(newAccount);
		return newAccount;
	}
	

}