package io.altar.parkee.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ConstraintMode;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "VEHICLE")
public class Vehicle extends EntityModel implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Column(name="LICENSE")
	private String license;


	//@Column(name="CustomerId")
	//private int customerId;
	//@Column(name="CustomerName")
	//private String customerName;

	@Column(name="BRAND")

	private String brand;
	@Column(name="COLOR")
	private String color;
	
	//@ManyToMany(fetch = FetchType.EAGER, mappedBy="vehicles", cascade={CascadeType.PERSIST, CascadeType.MERGE})
	@ManyToMany(fetch = FetchType.LAZY,
	        cascade =
	        {
	                CascadeType.DETACH,
	                CascadeType.MERGE,
	                CascadeType.REFRESH,
	                CascadeType.PERSIST
	        },
	        targetEntity = Customer.class)
	@JoinTable(name = "CUSTOMER_VEHICLE",
	        joinColumns = @JoinColumn(name = "VEHICLE_ID",
	                nullable = false,
	                updatable = false),
	        inverseJoinColumns = @JoinColumn(name = "CUSTOMER_ID",
	                nullable = false,
	                updatable = false),
	        foreignKey = @ForeignKey(ConstraintMode.CONSTRAINT),
	        inverseForeignKey = @ForeignKey(ConstraintMode.CONSTRAINT))
	private List<Customer> customers;

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
}
