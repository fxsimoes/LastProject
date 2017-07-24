package io.altar.parkee.repository;

import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.persistence.Query;
import javax.transaction.Transactional;
import io.altar.parkee.model.Customer;
import io.altar.parkee.model.ParkSpot;
//import io.altar.parkee.model.ParkSpot.statusID;

@Named("ParkSpotRepository")
@ApplicationScoped
public class ParkSpotRepository extends EntityRepository<ParkSpot> {
	
	public List<ParkSpot> getDbElements() {
		
		Query query = getEm().createQuery("FROM ParkSpot");
		List<ParkSpot> dbParkSpots = (List<ParkSpot>) query.getResultList();
		return dbParkSpots;
	}
	
	@Transactional
//	public void modifyDb(int id, int inputSpotNum, int number, String row, statusID statusId) {
//		ParkSpot dbParkSpot = getEm().find(ParkSpot.class, id);
//		dbParkSpot.setInputSpotNum(inputSpotNum);
//		dbParkSpot.setNumber(number);		
//		dbParkSpot.setRow(row);
//		dbParkSpot.setStatusID(statusId);	
//	}
	
	public void modifyDb(int id, int inputSpotNum, int number, String row, int statusId) {
		ParkSpot dbParkSpot = getEm().find(ParkSpot.class, id);
		dbParkSpot.setInputSpotNum(inputSpotNum);
		dbParkSpot.setNumber(number);		
		dbParkSpot.setRow(row);
		dbParkSpot.setStatusId(statusId);	
	}
	
	
	
	@Override
	@Transactional
	public void delete(ParkSpot parkSpot){
		ParkSpot parkSpotToRemove = getEm().find(ParkSpot.class, parkSpot.getId());
		getEm().remove(parkSpotToRemove);
	}
	
//	@Transactional
//	public ParkSpot addToDb(int id, int inputSpotNum, int number, String row, int statusId){
//		ParkSpot newParkSpot =  new ParkSpot();
//		newParkSpot.setInputSpotNum(inputSpotNum);
//		newParkSpot.setNumber(number);	
//		newParkSpot.setRow(row);
//		newParkSpot.setStatusId(statusId);
//		em.persist(newParkSpot);
//		return newParkSpot;
//	
	}
