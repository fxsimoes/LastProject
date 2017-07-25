package io.altar.parkee.service;

import java.util.Collection;
import java.util.List;

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
	
	//TESTE
	
	public VehicleRepository getVehicleRepository() {
		return vehicleList;
	}
	
	public List<Vehicle> showVehiclesByCustomerName(VehicleRepository vehicleList){
			
		List<Vehicle> list = vehicleList.getDbVehiclesByCustomerName();
		return list;
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

	public Collection<Vehicle> showVehicles(VehicleRepository vehicleList) {
		List<Vehicle> list = vehicleList.getDbElements();
		return list;
	}

}
