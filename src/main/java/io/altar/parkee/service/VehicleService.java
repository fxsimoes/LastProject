package io.altar.parkee.service;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import io.altar.parkee.model.Park;
import io.altar.parkee.model.Vehicle;
import io.altar.parkee.repository.ParkRepository;
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
	
	public List<Vehicle> showVehicles(VehicleRepository vehicleList){
		List<Vehicle> vlist = vehicleList.getDbElements();
		return vlist;
	}
	
	public void removeVehicle(int id){
		Vehicle productToRemove = vehicleList.getDbElements().get(id);
		vehicleList.removeFromDb(productToRemove);
	}

}
