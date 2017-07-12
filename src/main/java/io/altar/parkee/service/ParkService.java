package io.altar.parkee.service;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Instance;
import javax.inject.Inject;
import javax.inject.Named;

import io.altar.parkee.model.Park;
import io.altar.parkee.repository.ParkRepository;

	@Named("ParkService")
	@RequestScoped
	public class ParkService extends EntityService<Park>{
		
		@Inject
		private Instance <ParkRepository> parkList;
		
		public ParkRepository getParkRepository(){
			return (ParkRepository) parkList;
		}
		
		public List<Park> showParks(ParkRepository parkList){
			List<Park> list = parkList.getDbElements();
			return list;
		}
		
		public void modifyEntity(int id, String name, int spots, String spotRef, String location, int longitude, int latitude, int price){
			((ParkRepository) parkList).modifyDb(id, name, spots, spotRef, location, longitude, latitude, price);
		}
		
}