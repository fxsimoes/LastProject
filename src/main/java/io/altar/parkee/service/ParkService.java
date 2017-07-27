package io.altar.parkee.service;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

import io.altar.parkee.model.Park;
import io.altar.parkee.model.ParkSpot;
import io.altar.parkee.repository.ParkRepository;
import io.altar.parkee.repository.ParkSpotRepository;


	@Named("ParkService")
	@RequestScoped
	public class ParkService extends EntityService<Park>{
		
		
		@Inject
		private ParkRepository parkList;
		
		public ParkRepository getParkRepository(){
			return parkList;
		}
		
		@Transactional
		public Park create(Park newPark){
			parkList.create(newPark);
			return newPark;
		}
		
		
		@Transactional
		public Park remove(Park oldPark){
			parkList.delete(oldPark);
			return oldPark;
		}
		
		public List<Park> showParks(ParkRepository parkList){
			List<Park> list = parkList.getDbElements();
			return list;
		}
		
		@Inject
		private ParkSpotRepository spotsList;
		
		
		
		public ParkRepository getParkList() {
			return parkList;
		}

		public void setParkList(ParkRepository parkList) {
			this.parkList = parkList;
		}

		public List<String> getSpotsDbList() {
			return spotsDbList;
		}

		public void setSpotsList(ParkSpotRepository spotsList) {
			this.spotsList = spotsList;
		}

		private List<String> spotsDbList = new ArrayList<>();

		public List<String> getSpotsList() {
			return spotsDbList;
		}

		public void setSpotsDbList(List<String> spotsDbList) {
			this.spotsDbList = spotsDbList;
		}

		public Park update(Park currentPark){
			parkList.update(currentPark);
			return currentPark;
		}
//		public void modifyEntity(int id, String name, int spots, String spotRef, String location, int longitude, int latitude, int price){
//			parkList.modifyDb(id, name, spots, spotRef, location, longitude, latitude, price);
//		}
		
}