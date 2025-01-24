package EsiRentalServices;

import java.util.HashMap;
import java.util.Map;

class EsiRentalServices{
    private final Map<String, Vehicle> vehicles;

    public EsiRentalServices() {
        this.vehicles = new HashMap<>();
    }

    public void addvehicle(Vehicle vehicle) {
        vehicles.put(vehicle.getVehicleId(), vehicle);
    }

    public void rentvehicle(String vehicleId, Customer customer, int days) {
        Vehicle vehicle = vehicles.get(vehicleId);
        if (vehicle != null && vehicle.isAvailableForRental()) {
            vehicle.setAvailable(false);
            RentalTransaction transaction = new RentalTransaction(vehicle, customer, days);
            customer.addRental(transaction);
        } else {
            throw new IllegalArgumentException("Vehicle is not available.");
        }
    }

    public void returnVehicle(String vehicleId) {
        Vehicle vehicle = vehicles.get(vehicleId);
        if (vehicle != null) {
            vehicle.setAvailable(true);
        }
    }
}
