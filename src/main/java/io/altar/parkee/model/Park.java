package io.altar.parkee.model;

public class Park {

	private int parkId;
	private String parkName;
	private int hourlyPrice;
	private int nrOfSpots;
	private int spotRef;
	private String parkLocation;
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
	public int getSpotRef() {
		return spotRef;
	}
	public void setSpotRef(int spotRef) {
		this.spotRef = spotRef;
	}
	public String getParkLocation() {
		return parkLocation;
	}
	public void setParkLocation(String parkLocation) {
		this.parkLocation = parkLocation;
	}
	
	
}
