package io.altar.parkee.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Customer")
public class Customer extends EntityModel implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Column(name="CustomerName")
	private String customerName;
	@Column(name="CustomerContact")
	private int customerContact;
	@Column(name="Nif")
	private int nif;
	@Column(name="Vehicle")
	private Vehicle myVehicle;
	
	@OneToOne(cascade = CascadeType.ALL)
	public Vehicle getMyVehicle() {
		return myVehicle;
	}

	public void setMyVehicle(Vehicle myVehicle) {
		this.myVehicle = myVehicle;
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

	public int getNif() {
		return nif;
	}

	public void setNif(int nif) {
		this.nif = nif;
	}

	public Customer() {}
	
}
