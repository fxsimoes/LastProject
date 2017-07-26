package io.altar.parkee.view;

import java.io.Serializable;
import java.util.Collection;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import io.altar.parkee.model.Park;
import io.altar.parkee.model.ParkSpot;
import io.altar.parkee.service.ParkService;

@Named("ParkBean")
@RequestScoped
public class ParkBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private Park newPark = new Park();
	private Park oldPark = new Park();
	private Park activePark = new Park();
	
	
	public Park getActivePark() {
		return activePark;
	}

	public void setActivePark(Park activePark) {
		this.activePark = activePark;
	}


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
	private char row = 'A';
	private String spotRef;

	public void addPark(){
		int rowNumber=1;
		
		for(int i=1; i<=newPark.getNrOfSpots(); i++){		
			spotRef=String.valueOf(row)+rowNumber;
			
			if(rowNumber%5==0) {
				row++;
				rowNumber=0;}
				rowNumber++;
				
		newPark.addToSpots(new ParkSpot("Free", spotRef));
		}
		parkService.create(newPark);
	}
	
//	public void addPark2() {
//		
//	newPark.setParkSpot(parkService);
//	parkService.addEntity(newPark);
//	for (ParkSpot pSpot : parkService) {
//		Set<Product> productSetTemp = category.getProductSet();
//		productSetTemp.add(newPark);
//		pSpot.setProductSet(productSetTemp);
//		parkService.update(pSpot);
//	}
//	}

//	public String editPark() {
//		System.out.println(activePark.toString());
//		parkService.modifyEntity(parkId, parkName, nrOfSpots, spotRef, parkLocation, longitude, latitude, hourlyPrice);
//		return null;
//	}

	public void deletePark() {
		parkService.remove(activePark);
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