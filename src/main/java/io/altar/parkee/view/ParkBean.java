package io.altar.parkee.view;

import java.io.Serializable;
import java.util.Collection;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import io.altar.parkee.service.ParkService;
import io.altar.parkee.model.Park;

@Named("ParkBean")
@RequestScoped
public class ParkBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private Park newPark = new Park();
	private Park oldPark = new Park();
	
	public Park getOldPark() {
		return oldPark;
	}

	public void setOldPark(Park oldPark) {
		this.oldPark = oldPark;
	}

	public Park getNewPark() {
		return newPark;
	}

	public void setNewPark(Park newPark) {
		this.newPark = newPark;
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
	
	public void addPark(){
		parkService.addEntity(newPark);
	}

//	public String editPark() {
//		System.out.println(activePark.toString());
//		parkService.modifyEntity(parkId, parkName, nrOfSpots, spotRef, parkLocation, longitude, latitude, hourlyPrice);
//		return null;
//	}

	public void deletePark(int id) {
//		parkService.removeIt(oldPark.);
	}
	
	public void removeFromDb(Park oldPark){

	}
}

// public void addPark() {
// newPark = parkService.addEntity(getParkId(), getParkName(),
// getNrOfSpots(), getSpotRef(), getParkLocation(), getLongitude(),
// getLatitude(), getHourlyPrice());
//// newPark.setHourlyPrice(hourlyPrice);
//// newPark.setParkName(parkName);
//// newPark.setNrOfSpots(nrOfSpots);
//// newPark.setSpotRef(spotRef);
//// newPark.setParkLocation(parkLocation);
//// newPark.setLongitude(longitude);
//// newPark.setLatitude(latitude);
// }

//public Park addPark() {
//	newPark.setHourlyPrice(hourlyPrice);
//	newPark.setParkName(parkName);
//	newPark.setNrOfSpots(nrOfSpots);
//	newPark.setSpotRef(spotRef);
//	newPark.setParkLocation(parkLocation);
//	newPark.setLongitude(longitude);
//	newPark.setLatitude(latitude);
//	parkService.addEntity(parkService.getParkRepository(), newPark);
//	return newPark;
//}