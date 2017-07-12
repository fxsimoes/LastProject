package io.altar.parkee.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.persistence.Query;
import javax.transaction.Transactional;

import io.altar.parkee.model.Park;

@Named("ParkRepository")
@ApplicationScoped
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
	
//	public static Connection getConnection(){
//		
//		try{
//		String driver = "com.mysql.jdbc.Driver";
//		String url = "jdbc:mysql://localhost:3306/FSi";
//		String user = "root";
//		String password = "123";
//		Class.forName(driver);
//		
//		Connection con = DriverManager.getConnection(url, user, password);
//		System.out.println("Worked!!!");
//		
//		return con;
//		}catch(Exception e){
//			System.out.println(e);
//		}
//
//		return null;
//	}
	
	public List<Park> getDbElements() {
		Query query = getDb().createQuery("FROM Park");
		List<Park> dbElements = (List<Park>) query.getResultList();
		return dbElements;
	}
	
	@Override
	@Transactional
	public void removeFromDb(Park park){
		Park parkToRemove = getDb().find(Park.class, park.getId());
		getDb().remove(parkToRemove);
	}
	
	@Transactional
	public void modifyDb(int id, String name, int spots, String spotRef, String location, int longitude, int latitude, int price){
		Park dbPark = getDb().find(Park.class, id);
		dbPark.setHourlyPrice(price);
		dbPark.setParkName(name);		
		dbPark.setNrOfSpots(spots);
		dbPark.setSpotRef(spotRef);
		dbPark.setParkLocation(location);
		dbPark.setLongitude(longitude);
		dbPark.setLatitude(latitude);
	}
	
}
