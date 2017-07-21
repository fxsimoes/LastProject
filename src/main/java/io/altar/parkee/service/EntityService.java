package io.altar.parkee.service;

import io.altar.parkee.model.EntityModel;
import io.altar.parkee.repository.EntityRepository;

public class EntityService<E extends EntityModel> {
	
	public void addEntity(EntityRepository<E> entityList, E entity){
		entityList.create(entity);
	}
	
	public void editEntity(EntityRepository<E> entityList, E entity){
		entityList.update(entity);
	}
	
	public void removeEntity(EntityRepository<E> entityList, E entity){
		entityList.delete(entity);
	}
}