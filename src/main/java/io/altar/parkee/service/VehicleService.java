package io.altar.parkee.service;

<<<<<<< HEAD
import java.util.List;
=======
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
>>>>>>> TiagoCruz

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

<<<<<<< HEAD
import io.altar.parkee.model.Park;
import io.altar.parkee.model.Vehicle;
import io.altar.parkee.repository.ParkRepository;
=======
import io.altar.parkee.model.Customer;
import io.altar.parkee.model.Vehicle;
import io.altar.parkee.repository.CustomerRepository;
>>>>>>> TiagoCruz
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
<<<<<<< HEAD
		vehicleList.create(newVehicle);
=======
		// APAGAR DEPOIS
		
//		ArrayList<Customer> temp = new ArrayList<Customer>();
//		temp.add(teste);
//		ArrayList<Vehicle> temp = (ArrayList<Vehicle>)teste.getVehicles();
//		temp.add(newVehicle);
//		teste.setVehicles(temp);
		
		
		
		
		Customer teste = (Customer)customerList.getDb().createNativeQuery("SELECT * FROM customer ORDER BY id DESC LIMIT 1",Customer.class).getResultList().get(0);
		teste.addVehicle(newVehicle);
		customerList.modifyDb(teste);
		
//		vehicleList.addToDb(newVehicle);
>>>>>>> TiagoCruz
		return newVehicle;
	}
	
	public List<Vehicle> showVehicles(VehicleRepository vehicleList){
		List<Vehicle> vlist = vehicleList.getDbElements();
		return vlist;
	}
	
	public void removeVehicle(int id){
		Vehicle productToRemove = vehicleList.getDbElements().get(id);
		vehicleList.delete(productToRemove);
	}

}
