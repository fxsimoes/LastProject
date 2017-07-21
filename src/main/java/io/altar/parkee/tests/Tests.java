package io.altar.parkee.tests;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import io.altar.parkee.model.Park;
import io.altar.parkee.model.ParkSpot;

public class Tests {

//	public static void main(String[] args) {
//		Park park = new Park();
//		park.setHourlyPrice(13);
//		park.setLatitude(23);
//		park.setLongitude(34);
//		park.setParkLocation("dolo");
//		park.setParkName("cascais");
//		park.setSpotRef("wololo");
//		park.setNrOfSpots(666);
//		
//		ParkSpot pSpot = new ParkSpot();
//		pSpot.setNumber(34);
//		pSpot.setRow("row");
//		pSpot.setPark(park);
//
//		park.setpSpot(pSpot);
//		
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("YoloScoped");
//		EntityManager em = emf.createEntityManager();
//		EntityTransaction et = null;
//		
//		try{
//			et=em.getTransaction();
//			et.begin();
//			em.persist(park);
//			em.persist(pSpot);
//			et.commit();
//		}catch(Exception ex){
//			System.out.println("Es o pior");
//		}
//		
//	}

}
