package io.altar.parkee.view;

import javax.annotation.ManagedBean;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import io.altar.parkee.model.Account;

import java.io.Serializable;

@Named("Account")
@ManagedBean
@SessionScoped
public class AccountBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
//	public Account signIn(){
//		
//	}
	
}
