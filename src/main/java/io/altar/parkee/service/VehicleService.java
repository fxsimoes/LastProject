package io.altar.parkee.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import io.altar.parkee.model.Customer;
import io.altar.parkee.model.Vehicle;
import io.altar.parkee.repository.CustomerRepository;
import io.altar.parkee.repository.VehicleRepository;

@Named("VehicleService")
@RequestScoped
public class VehicleService extends EntityService<Vehicle>{
	
	@Inject
	private VehicleRepository vehicleList;
	
	//APAGAR DEPOIS
	@Inject
	private CustomerRepository customerList;

	public VehicleRepository getVehicleList() {
		return vehicleList;
	}
	
	public Vehicle addVehicle(Vehicle newVehicle){
		
		// APAGAR DEPOIS
		Customer teste = (Customer)customerList.getDb().createNativeQuery("SELECT * FROM customer ORDER BY id DESC LIMIT 1",Customer.class).getResultList().get(0);
		teste.addVehicle(newVehicle);
		customerList.update(teste);
		
//		vehicleList.addToDb(newVehicle);
		return newVehicle;
	}

	public void removeVehicle(int id) {
		// TODO Auto-generated method stub
		
	}

	public Collection<Vehicle> showVehicles(VehicleRepository vehicleList2) {
		// TODO Auto-generated method stub
		return null;
	}

}
