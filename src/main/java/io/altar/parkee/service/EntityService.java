package io.altar.parkee.service;

import io.altar.parkee.model.Entity;
import io.altar.parkee.repository.EntityRepository;

public class EntityService<E extends Entity> {
	
	
	public void addEntity(EntityRepository<E> entityList, E entity){
//		Collection<E> list = new ArrayList<E>(entityList.values());
		entityList.addToDb(entity);
	}
	
	public void editEntity(EntityRepository<E> entityList, E entity){
		entityList.modifyDb(entity);
	}
	
	public void removeEntity(EntityRepository<E> entityList, E entity){
		entityList.removeFromDb(entity);
	}
}