package io.altar.parkee.repository;

import java.util.List;

import javax.persistence.Query;
import javax.transaction.Transactional;

import io.altar.parkee.model.Park;

public class ParkRepository extends EntityRepository<Park> {
	
//	private static final ParkRepository INSTANCE = new ParkRepository();
//	
//	private ParkRepository() {}
//
//	public static ParkRepository getInstance() {
//		return INSTANCE;
//	}
//	
//	public void modifyPark(int id, String name, int spots, String spotRef, String location, int longitude, int latitude, int price) {
//		((Park) ParkRepository.getInstance().get(id)).setHourlyPrice(price);
//		((Park) ParkRepository.getInstance().get(id)).setParkName(name);		
//		((Park) ParkRepository.getInstance().get(id)).setNrOfSpots(spots);
//		((Park) ParkRepository.getInstance().get(id)).setSpotRef(spotRef);
//		((Park) ParkRepository.getInstance().get(id)).setParkLocation(location);
//		((Park) ParkRepository.getInstance().get(id)).setLongitude(longitude);
//		((Park) ParkRepository.getInstance().get(id)).setLatitude(latitude);
//	}	
	
	public List<Park> getDbElements() {
		Query query = getDb().createQuery("FROM Park");
		List<Park> dbElements = (List<Park>) query.getResultList();
		return dbElements;
	}
	
	@Override
	@Transactional
	public void removeFromDb(Park park){
		Park productToRemove = getDb().find(Park.class, park.getId());
		getDb().remove(productToRemove);
	}
	
	@Transactional
	public void modifyDb(int id, String name, int spots, String spotRef, String location, int longitude, int latitude, int price){
		Park dbProduct = getDb().find(Park.class, id);
		dbProduct.setHourlyPrice(price);
		dbProduct.setParkName(name);		
		dbProduct.setNrOfSpots(spots);
		dbProduct.setSpotRef(spotRef);
		dbProduct.setParkLocation(location);
		dbProduct.setLongitude(longitude);
		dbProduct.setLatitude(latitude);
	}
	
}
