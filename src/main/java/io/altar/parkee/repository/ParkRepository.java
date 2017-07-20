package io.altar.parkee.repository;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;

import io.altar.parkee.model.Park;

@Named("ParkRepository")
@ApplicationScoped
public class ParkRepository extends EntityRepository<Park> {
	
	public List<Park> getDbElements() {
		Query query = getEm().createQuery("FROM Park");
		List<Park> dbParks = (List<Park>) query.getResultList();
		return dbParks;
	}
	
	@Override
	@Transactional
	public void removeFromDb(Park park){
		Park parkToRemove = getEm().find(Park.class, park.getId());
		getEm().remove(parkToRemove);
	}
	
//	@Transactional
//	public void modifyDb(int id, String name, int spots, String spotRef, String location, int longitude, int latitude, int price){
//		Park dbPark = getEm().find(Park.class, id);
//		dbPark.setHourlyPrice(price);
//		dbPark.setParkName(name);		
//		dbPark.setNrOfSpots(spots);
//		dbPark.setSpotRef(spotRef);
//		dbPark.setParkLocation(location);
//		dbPark.setLongitude(longitude);
//		dbPark.setLatitude(latitude);
//	}
}	