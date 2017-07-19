package io.altar.parkee.view;

import java.io.Serializable;
import java.util.Collection;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import io.altar.parkee.model.ParkSpot;
import io.altar.parkee.service.ParkSpotService;

@Named("ParkSpotBean")
@RequestScoped
public class ParkSpotBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private ParkSpot newParkSpot = new ParkSpot();
	private ParkSpot activeParkSpot = new ParkSpot();
	
	public ParkSpot getNewParkSpot() {
		return newParkSpot;
	}

	public void setNewParkSpot(ParkSpot newParkSpot) {
		this.newParkSpot = newParkSpot;
	}

	public ParkSpot getActivePark() {
		return activeParkSpot;
	}

	public void setActivePark(ParkSpot activeParkSpot) {
		this.activeParkSpot = activeParkSpot;
	}

	public ParkSpotService getParkSpotService() {
		return parkSpotService;
	}

	public void setParkService(ParkSpotService parkSpotService) {
		this.parkSpotService = parkSpotService;
	}

	@Inject
	private ParkSpotService parkSpotService;
	public Collection<ParkSpot> getSpots() {
		return parkSpotService.showSpots(parkSpotService.getParkRepository());
	}
	
	public void addParkSpot(){
		parkSpotService.addEntity(newParkSpot);
	}
	
}