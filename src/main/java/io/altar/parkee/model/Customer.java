package io.altar.parkee.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
<<<<<<< HEAD
import javax.persistence.OneToOne;
=======
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
>>>>>>> TiagoCruz
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
	
<<<<<<< HEAD
=======
	@ManyToMany(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinTable(name = "customer_vehicle",
			joinColumns = { @JoinColumn(name = "cust_id") }, 
			inverseJoinColumns = { @JoinColumn(name = "vehicle_id") })
	private List<Vehicle> vehicles;
	

//	@ManyToMany
//    private List<Vehicle> vehicleList;
	
	
>>>>>>> TiagoCruz
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
