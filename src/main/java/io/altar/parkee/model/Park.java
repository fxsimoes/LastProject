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
	private String parkName = "Name";
	@Column(name="Hourly Price")
	private int hourlyPrice = 0;
	@Column(name="Nr of Spots")
	private int nrOfSpots = 0;
	@Column(name="Spot Ref")
	private String spotRef = "N1";
	@Column(name="Location")
	private String parkLocation = "Cascais";
	@Column(name="Longitude")
	private int longitude = 0;
	@Column(name="Latitude")
	private int latitude = 0;

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
