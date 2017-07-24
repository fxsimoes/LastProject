package io.altar.parkee.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "CUSTOMER")
public class Customer extends EntityModel implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Column(name="CUSTOMER_NAME")
	private String customerName;
	@Column(name="CUSTOMER_CONTACT")
	private int customerContact;
	@Column(name="NIF")
	private int nif;
	

	@ManyToMany(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinTable(name = "CUSTOMER_VEHICLE",
			joinColumns = { @JoinColumn(name = "CUSTOMER_ID") }, 
			inverseJoinColumns = { @JoinColumn(name = "VEHICLE_ID") })
	private List<Vehicle> vehicles;
	
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

	public List<Vehicle> getVehicles() {
		return vehicles;
	}

	public void setVehicles(List<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}
	
	public void addVehicle(Vehicle newVehicle) {
		vehicles.add(newVehicle);	
	}

}
