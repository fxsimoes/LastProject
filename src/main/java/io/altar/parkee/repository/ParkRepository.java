package io.altar.parkee.repository;

import io.altar.parkee.model.Park;

public class ParkRepository extends EntityRepository<Park> {
	
	private static final ParkRepository INSTANCE = new ParkRepository();
	
	private ParkRepository() {}

	public static ParkRepository getInstance() {
		return INSTANCE;
	}
	
	public void modifyPark(int id, String name, int spots, String spotRef, String location, int longitude, int latitude, int price) {
		((Park) ParkRepository.getInstance().get(id)).setHourlyPrice(price);
		((Park) ParkRepository.getInstance().get(id)).setParkName(name);		
		((Park) ParkRepository.getInstance().get(id)).setNrOfSpots(spots);
		((Park) ParkRepository.getInstance().get(id)).setSpotRef(spotRef);
		((Park) ParkRepository.getInstance().get(id)).setParkLocation(location);
		((Park) ParkRepository.getInstance().get(id)).setLongitude(longitude);
		((Park) ParkRepository.getInstance().get(id)).setLatitude(latitude);
	}	
}
