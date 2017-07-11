package io.altar.parkee.model;

public class Customer {
	
	private int customerId;
	private String customerName;
	private int customerContact;
	private int NIF;
	

	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getCustomerContact() {
		return customerContact;
	}
	public void setCustomerContact(int customerContact) {
		this.customerContact = customerContact;
	}
	public int getNIF() {
		return NIF;
	}
	public void setNIF(int nif) {
		NIF = nif;
	}
	
	
}
