package io.altar.parkee.service;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

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
		
		public List<Park> showParks(ParkRepository parkList){
			List<Park> list = parkList.getDbElements();
			return list;
		}
		
		public void modifyEntity(int id, String name, int spots, String spotRef, String location, int longitude, int latitude, int price){
			parkList.modifyDb(id, name, spots, spotRef, location, longitude, latitude, price);
		}
		
}