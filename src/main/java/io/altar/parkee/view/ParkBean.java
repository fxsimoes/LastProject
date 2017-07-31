package io.altar.parkee.view;

import java.io.Serializable;
import java.util.Collection;
import java.util.Random;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import io.altar.parkee.model.Park;
import io.altar.parkee.model.ParkSpot;
import io.altar.parkee.model.ParkSpot.StatusSpot;
import io.altar.parkee.service.ParkService;

@Named("ParkBean")
@RequestScoped
public class ParkBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private Park newPark = new Park();
	private Park oldPark = new Park();
	private Park activePark = new Park();
	private char row = 'A';
	private String spotRef;
	
	
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

	public void addPark(){
		int rowNumber=1;

		for(int i=1; i<=newPark.getNrOfSpots(); i++){		
			spotRef=String.valueOf(row)+rowNumber;
			
			if(rowNumber%5==0) {
				row++;
				rowNumber=0;}
				rowNumber++;	
				
		newPark.addToSpots(new ParkSpot(spotRef));
		
		}	
		parkService.create(newPark);
	}
	
	public void updatePark(){
//		int rowNumber=1;
//		for(int i=1; i<=newPark.getNrOfSpots(); i++){		
//			spotRef=String.valueOf(row)+rowNumber;
//			
//			if(rowNumber%5==0) {
//				row++;
//				rowNumber=0;}
//				rowNumber++;
//				
//		newPark.addToSpots(new ParkSpot(status, spotRef));
//		}
		parkService.update(activePark);
	}
	
	public void deletePark() {
		
		if(activePark==null){
			System.out.println("Can't delete anything");
		}else{
			parkService.remove(activePark);
		}
	}	
}

