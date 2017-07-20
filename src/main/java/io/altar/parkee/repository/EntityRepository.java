package io.altar.parkee.repository;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import javax.transaction.UserTransaction;

import io.altar.parkee.model.EntityModel;
import io.altar.parkee.model.Park;
import io.altar.parkee.model.ParkSpot;


public class EntityRepository<E extends EntityModel> {
	
	@PersistenceContext(unitName="database")
	private EntityManager em;
	
	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}
	
//	public void getRef(){
//
//	Park park = em.getReference(Park.class, nrOfSpots());
//	ParkSpot newParkSpot = new ParkSpot();
//	newParkSpot.setPark(park);
//	em.persist(newParkSpot);
//	}

	@Resource
    private UserTransaction userTransaction;
	
	public EntityManager getDb() {
		return em;
	}

	public void setDb(EntityManager em) {
		this.em = em;
	}

	@Transactional
	public void addToDb(E entity){
		em.persist(entity);
	}
	
	@Transactional
	public void removeFromDb(E entity){
		em.remove(entity);
	}
	
	@Transactional
	public void modifyDb(E newEntity){
		em.merge(newEntity);
	}
	
//private int id = 0;
//private LinkedHashMap<Integer, E> entityList = new LinkedHashMap<>();
//
//public Integer getNextId() {
//	return ++id;
//}
//
//public Collection<E> values(){
//	return entityList.values();
//}
//
//public void addToList(E entity) {
//	entity.setId(getNextId());
//	entityList.put(entity.getId(), entity);
//}
//
//public void remove(Integer id) {
//	entityList.remove(id);
//}
//
//public E get(int id) {
//	return entityList.get(id);
//}
//
//public boolean isEmpty() {
//	return entityList.isEmpty();
//}
//
//public Set<Integer> keySet() {
//	return entityList.keySet();
//}
//
//public boolean containsKey(Integer key) {
//	return entityList.containsKey(key);
//}
//
//public void display(Integer key) {
//	System.out.println(entityList.get(key).toString() + "\n");
//}

}
