package io.altar.parkee.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@NamedQueries({
	@NamedQuery(name = "Account.control", query = "SELECT l FROM Account l WHERE l.email = :email and l.password = :password"),
	@NamedQuery(name = "Account.findAll", query = "SELECT l FROM Account l"),
	@NamedQuery(name = "Account.findById", query = "SELECT l FROM Account l WHERE l.customer = :customer"),
	@NamedQuery(name = "Account.findByUsername", query ="SELECT l FROM Account l WHERE l.email = :email"),
	@NamedQuery(name = "Account.findByPassword", query = "SELECT l FROM Account l WHERE l.password = :password")
})
@Entity
@Table(name = "Accounts")
public class Account extends EntityModel implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Column(name="Email")
	private String email;
	@Column(name="Password")
	private String password;
	
	private boolean loggedIn = false;
	
	private boolean isAdmin = false;
	

	public boolean isAdmin() {
		return isAdmin;
	}
	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
	public boolean isLoggedIn() {
		return loggedIn;
	}
	public void setLoggedIn(boolean loggedIn) {
		this.loggedIn = loggedIn;
	}
	
	@OneToOne
	private Customer customer;

	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Account(){}
	
}
