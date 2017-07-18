package io.altar.parkee.service;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

import io.altar.parkee.model.Park;
import io.altar.parkee.repository.ParkRepository;

	@Named("ParkService")
	@RequestScoped
	public class ParkService extends EntityService<Park>{
		
		
		@Inject
		private ParkRepository parkList;
		
		public ParkRepository getParkRepository(){
			return parkList;
		}
		
		@Transactional
		public Park addEntity(Park newPark){
			parkList.addToDb(newPark);
			return newPark;
		}
		
		@Transactional
		public Park remove(Park oldPark){
			parkList.removeFromDb(oldPark);
			return oldPark;
		}
		
		@Transactional
		public Park removeIt(Park oldPark){
			parkList.removeFromDb(oldPark);
			return oldPark;
		}
		
		public List<Park> showParks(ParkRepository parkList){
			List<Park> list = parkList.getDbElements();
			return list;
		}
		
		public void modifyEntity(int id, String name, int spots, String spotRef, String location, int longitude, int latitude, int price){
			parkList.modifyDb(id, name, spots, spotRef, location, longitude, latitude, price);
		}
		
}