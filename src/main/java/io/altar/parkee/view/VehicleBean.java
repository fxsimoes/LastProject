package io.altar.parkee.view;

import java.io.Serializable;

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

	public void addNewVehicle(){
		vehicleService.addVehicle(newVehicle);
	}
	
}