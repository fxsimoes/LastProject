package io.altar.parkee.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "VEHICLE")
public class Vehicle extends EntityModel implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Column(name="License")
	private String license;
	//@Column(name="CustomerId")
	//private int customerId;
	//@Column(name="CustomerName")
	//private String customerName;
	@Column(name="Brand")
	private String brand;
	@Column(name="Color")
	private String color;

	@ManyToMany(mappedBy="vehicles")
	private Set<Customer> customers = new HashSet<Customer>();
	
	public String getLicense() {
		return license;
	}


	public void setLicense(String license) {
		this.license = license;
	}

	
	public String getBrand() {
		return brand;
	}

	
	public void setBrand(String brand) {
		this.brand = brand;
	}

	
	public String getColor() {
		return color;
	}

	
	public void setColor(String color) {
		this.color = color;
	}

	
	public Vehicle() {
	}


	public Set<Customer> getCustomers() {
		return customers;
	}


	public void setCustomers(Set<Customer> customers) {
		this.customers = customers;
	}
	
}
