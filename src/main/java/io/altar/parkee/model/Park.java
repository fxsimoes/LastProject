package io.altar.parkee.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Park")
public class Park extends EntityModel implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Column(name="ParkName")
	private String parkName;
	@Column(name="HourlyPrice")
	private int hourlyPrice;
	@Column(name="nrOfSpots")
	private int nrOfSpots;
    @OneToMany(mappedBy="park", cascade = {CascadeType.ALL})
    private List<ParkSpot> parkSpots = new ArrayList<ParkSpot>();
	@Column(name="Location")
	private String parkLocation;
	@Column(name="Longitude")
	private int longitude;
	@Column(name="Latitude")
	private int latitude;


	@Column(name= "NumberOfFreeSpots")
	private int numFreeSpot=(int) (Math.random()*70);
	
	
	
	public int getNumFreeSpot() {
		return numFreeSpot;
	}

	public void setNumFreeSpot(int numFreeSpot) {
		this.numFreeSpot = numFreeSpot;
	}

	public void addToSpots(ParkSpot spot){
		spot.setPark(this);
		this.parkSpots.add(spot);
	}
	
	public List<ParkSpot> getParkSpots() {
		return parkSpots;
	}

	public void setParkSpots(List<ParkSpot> parkSpots) {
		this.parkSpots = parkSpots;
	}

	public int getNrOfSpots() {
		return nrOfSpots;
	}

	public void setNrOfSpots(int nrOfSpots) {
		this.nrOfSpots = nrOfSpots;
	}

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

	public String getParkLocation() {
		return parkLocation;
	}

	public void setParkLocation(String parkLocation) {
		this.parkLocation = parkLocation;
	}

	public Park() {}
}
