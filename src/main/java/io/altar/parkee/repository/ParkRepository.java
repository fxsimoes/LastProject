package io.altar.parkee.repository;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
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
	public void delete(Park park){
		Park parkToRemove = getEm().find(Park.class, park.getId());
		getEm().remove(parkToRemove);
	}
	
	public Set<Park> getParks(List<Integer> parkIDs){
		Set<Park> parks = new HashSet<>();
		for(Integer id: parkIDs){
			TypedQuery<Park> query = getDb().createQuery("SELECT pSpot FROM Park AS pSpot WHERE pSpot.id = :id", Park.class);
			query.setParameter("id", id);
			List<Park> results = query.getResultList();
			parks.add(results.get(0));
		}
		return parks;
	}

	
	public Park getProductFromName(String parkName){
		TypedQuery<Park> query = getDb().createQuery("SELECT p FROM Park AS p WHERE p.parkName = :name", Park.class);
		query.setParameter("name", parkName);
		return query.getSingleResult();
	}
	
	public Park getParkFromId(Integer parkId){
		TypedQuery<Park> query = getDb().createQuery("SELECT p FROM Park AS p WHERE p.parkId = :id", Park.class);
		query.setParameter("id", parkId);
		return query.getSingleResult();
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