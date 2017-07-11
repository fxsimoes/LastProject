package io.altar.parkee.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name="Products")
public class Park extends Entity implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int parkId;
	private String parkName;
	private int hourlyPrice;
	private int nrOfSpots;
	private String spotRef;
	private String parkLocation;
	private int longitude;
	private int latitude;
	
//	
//		@Column(name="Shelves", nullable = true)
//
//		private String shelfLoc ="shelfId";
//
//		private String name = "Name";
//		@Column(name="Discount")
//		private Integer discount = 0;
//		@Column(name="IVA")
//		private Integer iva = 0;
//		@Column(name="Price")
//		private Double price = 0.0;
	
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
	public int getParkId() {
		return parkId;
	}
	public void setParkId(int parkId) {
		this.parkId = parkId;
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
	
	public Park(){}
	
}
