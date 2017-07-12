package io.altar.parkee.view;

import java.io.Serializable;
import java.util.Collection;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import io.altar.parkee.model.Park;
import io.altar.parkee.service.ParkService;


@Named("ParkBean")
@RequestScoped
public class ParkBean implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private int parkId;
	private String parkName;
	private int hourlyPrice;
	private int nrOfSpots;
	private String spotRef;
	private String parkLocation;
	private int longitude;
	private int latitude;
	
	private Park newPark = new Park();
	
	private Park activePark = new Park();

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

	public Park getNewPark() {
		return newPark;
	}

	public void setNewPark(Park newPark) {
		this.newPark = newPark;
	}

	public Park getActivePark() {
		return activePark;
	}

	public void setActivePark(Park activePark) {
		this.activePark = activePark;
	}

	public ParkService getParkService() {
		return parkService;
	}

	public void setParkService(ParkService parkService) {
		this.parkService = parkService;
	}

	@Inject
	private ParkService parkService;

	public Collection<Park> getParks() {
		return parkService.showParks(parkService.getParkRepository());
	}

	public String addPark() {
		parkService.addEntity(parkService.getParkRepository(), newPark);
		return null;
	}

	public String editPark() {
		System.out.println(activePark.toString());
		parkService.modifyEntity(parkId, parkName, nrOfSpots, spotRef, parkLocation, longitude, latitude, hourlyPrice);
		return null;
	}

	public String deletePark() {
//		try{
		parkService.removeEntity(parkService.getParkRepository(), activePark);
//		}catch(NullPointerException e){
//			System.out.println("Exception Caught");
//		}
		return null;
	}
}
