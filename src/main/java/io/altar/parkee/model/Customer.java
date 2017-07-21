package io.altar.parkee.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "CUSTOMER")
public class Customer extends EntityModel implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Column(name="CustomerName")
	private String customerName;
	@Column(name="CustomerContact")
	private int customerContact;
	@Column(name="Nif")
	private int nif;
	
	@ManyToMany
	@JoinTable(name = "CUSTOMER_VEHICLE",
			joinColumns = { @JoinColumn(name = "id") }, 
			inverseJoinColumns = { @JoinColumn(name = "License") })
	private Set<Vehicle> vehicles = new HashSet<Vehicle>();
	
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

	public int getNif() {
		return nif;
	}

	public void setNif(int nif) {
		this.nif = nif;
	}

	public Customer() {}

	public Set<Vehicle> getVehicles() {
		return vehicles;
	}

	public void setVehicles(Set<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}

}
