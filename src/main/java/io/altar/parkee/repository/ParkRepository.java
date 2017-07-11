package io.altar.parkee.repository;

import io.altar.parkee.model.Park;
import io.altar.parkee.service.EntityService;

public class ParkRepository extends EntityService<Park> {
	
	
	
	
	
	private static final ParkRepository INSTANCE = new ParkRepository();

	private ParkRepository() {}

	public static ParkRepository getInstance() {
		return INSTANCE;
	}

	private int parkId;
	private String parkName;
	private int hourlyPrice;
	private int nrOfSpots;
	private int spotRef;
	private String parkLocation;
	private int longitude;
	private int latitude;
	
	public void modifyPark(int id, String name, int spots, String spotRef, int price) {
		((Park) ParkRepository.getInstance().get(id)).setHourlyPrice(price);
		((Park) ParkRepository.getInstance().get(id)).setParkName(name);		
		((Park) ParkRepository.getInstance().get(id)).setDiscount(discount);
		((Park) ParkRepository.getInstance().get(id)).setIva(Iva);
		((Park) ParkRepository.getInstance().get(id)).setPrice(price);
	}	
}
