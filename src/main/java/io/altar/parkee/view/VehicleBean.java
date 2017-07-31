package io.altar.parkee.view;

import java.io.Serializable;
import java.util.Collection;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import io.altar.parkee.model.Vehicle;
import io.altar.parkee.service.CustomerService;
import io.altar.parkee.service.VehicleService;


@Named("VehicleBean")
@RequestScoped
public class VehicleBean implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Vehicle newVehicle = new Vehicle();
	private Vehicle activeVehicle = new Vehicle();

	
	public Vehicle getActiveVehicle() {
		return activeVehicle;
	}

	public void setActiveVehicle(Vehicle activeVehicle) {
		this.activeVehicle = activeVehicle;
	}

	public Vehicle getNewVehicle() {
		return newVehicle;
	}

	public void setNewVehicle(Vehicle newVehicle) {
		this.newVehicle = newVehicle;
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
		return vehicleService.showVehicles(vehicleService.getVehicleList());
	}

	public void addNewVehicle(){
		vehicleService.addVehicle(newVehicle);
	}
	
	public String deleteVehicle() {
		
		vehicleService.removeEntity(vehicleService.getVehicleRepository(), activeVehicle);
		return null;
	}
	
	public void updateVehicle() {
		
		vehicleService.editEntity(vehicleService.getVehicleRepository(), activeVehicle);
	}
	
	//TESTE
	public Collection<Vehicle> getVehiclesByCustomerName() {
		
		return vehicleService.showVehiclesByCustomerName(vehicleService.getVehicleRepository());
	}
	
}
