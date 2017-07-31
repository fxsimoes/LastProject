package io.altar.parkee.repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.persistence.Query;
import javax.transaction.Transactional;

import io.altar.parkee.model.ParkSpot;

@Named("ParkSpotRepository")
@ApplicationScoped
public class ParkSpotRepository extends EntityRepository<ParkSpot> {
	
	public List<ParkSpot> getSpots() {
		
		Query query = getEm().createQuery("FROM ParkSpot");
		List<ParkSpot> dbParkSpots = (List<ParkSpot>) query.getResultList();
		return dbParkSpots;
	}
	
//  public Query cenas() throws SQLException {
//	  
//	  Query num = getEm().createQuery("SELECT COUNT (Status) FROM dbParkSpots WHERE Status = FREE");
//	  num.getFirstResult();
//	return num;
//	}
	
	

	@Transactional
	public void modifyDb(int id, String spotRef, String status) {
		ParkSpot dbParkSpot = getEm().find(ParkSpot.class, id);
		dbParkSpot.setSpotRef(spotRef);		;
		dbParkSpot.setStatus(status);	
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
