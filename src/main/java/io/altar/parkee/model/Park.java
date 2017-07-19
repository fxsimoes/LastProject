package io.altar.parkee.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import io.altar.parkee.model.EntityModel;

@Entity
@Table(name = "Park")
public class Park extends EntityModel implements Serializable {
//
	private static final long serialVersionUID = 1L;
	
	@Column(name="ParkName")
	private String parkName;
	@Column(name="HourlyPrice")
	private int hourlyPrice;
	@Column(name="NrOfSpots")
	private int nrOfSpots;
	@Column(name="SpotRef")
	private String spotRef;
	@Column(name="Location")
	private String parkLocation;
	@Column(name="Longitude")
	private int longitude;
	@Column(name="Latitude")
	private int latitude;
	
//	@OneToMany(mappedBy="Park", orphanRemoval=true)
//	@Cascade(value= {org.hibernate.annotations.CascadeType.ALL})
//	private List<ParkSpot> parkSpot = new ArrayList<ParkSpot>();
//-------------------------------------------------------------------------------	
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
