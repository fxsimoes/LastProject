package io.altar.parkee.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.FetchType;
import javax.persistence.JoinTable;
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

	@ManyToMany(fetch = FetchType.EAGER, mappedBy="vehicles")
	private List<Customer> customers;
	
	
//	@ManyToMany(mappedBy="")
//    private List<Customer> Customers;
	
	
//	public List<Customer> getCustomers(){
//		return Customers;
//	}
//
//
//	public void setCustomers(List<Customer> customers) {
//		Customers = customers;
//	}


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

	public List<Customer> getCustomers() {
		return customers;
	}


	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}
	
//	public void addCustomer(Customer customer) {
//		customers.add(customer);
//	}
	
}
