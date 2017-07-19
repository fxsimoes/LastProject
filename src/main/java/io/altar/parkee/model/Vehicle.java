package io.altar.parkee.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Vehicle")
public class Vehicle extends EntityModel implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Column(name="License")
	private String license;
	@Column(name="CustomerId")
	private int customerId;
	@Column(name="CustomerName")
	private String customerName;
	@Column(name="Brand")
	private String brand;
	@Column(name="Color")
	private String color;
	
	@OneToOne
	private Customer customer;


	public String getLicense() {
		return license;
	}


	public void setLicense(String license) {
		this.license = license;
	}


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

}
