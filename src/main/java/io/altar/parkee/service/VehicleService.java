package io.altar.parkee.service;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import io.altar.parkee.model.Vehicle;
import io.altar.parkee.repository.VehicleRepository;

@Named("VehicleService")
@RequestScoped
public class VehicleService extends EntityService<Vehicle>{
	
	@Inject
	private VehicleRepository vehicleList;

	public VehicleRepository getVehicleList() {
		return vehicleList;
	}
	
	public Vehicle addVehicle(Vehicle newVehicle){
		vehicleList.addToDb(newVehicle);
		return newVehicle;
	}

}
