package io.altar.parkee.repository;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.persistence.Query;
import javax.transaction.Transactional;

import io.altar.parkee.model.Vehicle;

@Named("VehicleRepository")
@ApplicationScoped
public class VehicleRepository extends EntityRepository<Vehicle> {

	public List<Vehicle> getDbElements() {
		Query query = getEm().createQuery("FROM Vehicle");
		List<Vehicle> dbVehicles = (List<Vehicle>) query.getResultList();
		return dbVehicles;
	}
	
	//TESTE
	public List<Vehicle> getDbVehiclesByCustomerName() {
			
		Query queryvehicles = getEm().createNativeQuery("SELECT vehicle.* FROM customer INNER JOIN customer_vehicle ON customer.id = customer_vehicle.customer_id INNER JOIN vehicle ON customer_vehicle.vehicle_id = vehicle.id",Vehicle.class);
		List<Vehicle> dbVehicles = (List<Vehicle>) queryvehicles.getResultList();
		return dbVehicles;
	}
	
	@Override
	@Transactional
	public void delete(Vehicle activeVehicle){
		Vehicle vehicleToRemove = getEm().find(Vehicle.class, activeVehicle.getId());
		getEm().remove(vehicleToRemove);
	}
	
}
