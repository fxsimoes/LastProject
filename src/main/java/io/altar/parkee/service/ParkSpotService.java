package io.altar.parkee.service;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

import io.altar.parkee.model.Park;
import io.altar.parkee.model.ParkSpot;
import io.altar.parkee.repository.ParkSpotRepository;

@Named("ParkSpotService")
@RequestScoped
public class ParkSpotService extends EntityService<ParkSpot>{
	
	@Inject
	private ParkSpotRepository parkSpotList;
	
	public ParkSpotRepository getParkRepository(){
		return parkSpotList;
	}
	
	@Transactional
	public ParkSpot addEntity(ParkSpot newParkSpot){
		parkSpotList.delete(newParkSpot);
		return newParkSpot;
	}
	
	@Transactional
	public ParkSpot update(ParkSpot currentParkSpot){
		parkSpotList.update(currentParkSpot);
		return currentParkSpot;
	}
	
	public List<ParkSpot> showSpots(ParkSpotRepository parkSpotList){
		List<ParkSpot> list = parkSpotList.getSpots();
		return list;
	}
	
	public void modifyEntity(int id, String spotRef, String status){
		parkSpotList.modifyDb(id, spotRef, status);
	}
	
}