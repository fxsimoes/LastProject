package io.altar.parkee.view;

import java.io.Serializable;
import java.util.Collection;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import io.altar.parkee.model.Vehicle;
import io.altar.parkee.service.VehicleService;


@Named("VehicleBean")
@RequestScoped
public class VehicleBean implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Vehicle newVehicle = new Vehicle();
	private Vehicle activeVehicle = new Vehicle();
	
	public Vehicle getNewVehicle() {
		return newVehicle;
	}

	public void setNewVehicle(Vehicle newVehicle) {
		this.newVehicle = newVehicle;
	}
	
	public Vehicle getActiveVehicle() {
		return activeVehicle;
	}

	public void setActiveVehicle(Vehicle activeVehicle) {
		this.activeVehicle = activeVehicle;
	}

	@Inject
	private VehicleService vehicleService;
	
	public VehicleService getVehicleService() {
		return vehicleService;
	}

	public void setVehicleService(VehicleService vehicleService) {
		this.vehicleService = vehicleService;
	}
	
	public Collection<Vehicle> getVehicles() {
		return vehicleService.showVehicles(vehicleService.getVehicleRepository());
	}

	public void addVehicle(){
		vehicleService.addVehicle(newVehicle);
	}
	
<<<<<<< HEAD
	public String deleteVehicle() {
		
		vehicleService.removeEntity(vehicleService.getVehicleRepository(), activeVehicle);
		return null;
=======
	public void removeNewVehicle(int id){
		vehicleService.removeVehicle(id);
		System.out.println(id);
>>>>>>> 412346be9db215bb59739b84dd3221c9d2c4761b
	}
	
	//TESTE
	public Collection<Vehicle> getVehiclesByCustomerName() {
			
		return vehicleService.showVehiclesByCustomerName(vehicleService.getVehicleRepository());
	}
	
}
