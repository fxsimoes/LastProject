package io.altar.parkee.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;


//import javax.persistece.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.SecondaryTable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Park")
public class Park extends EntityModel implements Serializable {
//
	private static final long serialVersionUID = 1L;

	@Column(name="ParkName")
	private String parkName;
	@Column(name="HourlyPrice")
	private int hourlyPrice;
	@Column(name="nrOfSpots")
	private static int nrOfSpots;

//    @OneToOne(optional=false, mappedBy="park", cascade=CascadeType.ALL, 
//    		targetEntity=ParkSpot.class, fetch=FetchType.EAGER)
//	private ParkSpot parkSpot;
    
	@Column(name="SpotRef")
	private String spotRef;
	@Column(name="Location")
	private String parkLocation;
	@Column(name="Longitude")
	private int longitude;
	@Column(name="Latitude")
	private int latitude;
	
//	public void setParkSpot(ParkSpot parkSpot){ this.parkSpot=parkSpot;}

	public static int getNrOfSpots() {
		return nrOfSpots;
	}

	public void setNrOfSpots(int nrOfSpots) {
		this.nrOfSpots = nrOfSpots;
	}

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
