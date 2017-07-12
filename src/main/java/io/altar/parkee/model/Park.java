package io.altar.parkee.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import io.altar.parkee.model.EntityModel;

@Entity
@Table(name = "Park")
public class Park extends EntityModel implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Column(name="Park Name")
	private String parkName;
	@Column(name="Hourly Price")
	private int hourlyPrice;
	@Column(name="Nr of Spots")
	private int nrOfSpots;
	@Column(name="Spot Ref")
	private String spotRef;
	@Column(name="Location")
	private String parkLocation;
	@Column(name="Longitude")
	private int longitude;
	@Column(name="Latitude")
	private int latitude;

	//
	// @Column(name="Shelves", nullable = true)
	//
	// private String shelfLoc ="shelfId";
	//
	// private String name = "Name";
	// @Column(name="Discount")
	// private Integer discount = 0;
	// @Column(name="IVA")
	// private Integer iva = 0;
	// @Column(name="Price")
	// private Double price = 0.0;

	public int getLongitude() {
		return longitude;
	}

	public void setLongitude(int longitude) {
		this.longitude = longitude;
	}

	public int getLatitude() {
		return latitude;
	}

	public void setLatitude(int latitude) {
		this.latitude = latitude;
	}

	public String getParkName() {
		return parkName;
	}

	public void setParkName(String parkName) {
		this.parkName = parkName;
	}

	public int getHourlyPrice() {
		return hourlyPrice;
	}

	public void setHourlyPrice(int hourlyPrice) {
		this.hourlyPrice = hourlyPrice;
	}

	public int getNrOfSpots() {
		return nrOfSpots;
	}

	public void setNrOfSpots(int nrOfSpots) {
		this.nrOfSpots = nrOfSpots;
	}

	public String getSpotRef() {
		return spotRef;
	}

	public void setSpotRef(String spotRef) {
		this.spotRef = spotRef;
	}

	public String getParkLocation() {
		return parkLocation;
	}

	public void setParkLocation(String parkLocation) {
		this.parkLocation = parkLocation;
	}

	public Park() {}

}
