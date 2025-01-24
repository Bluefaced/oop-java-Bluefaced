package EsiRentalServices;


public class car extends Vehicle {
    private static final double INSURANCE_FEE = 20.0;

    public car (String vehicleId, String model, double baseRentalRate) {
        super(vehicleId, model, baseRentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        if (days <= 0) {
            throw new IllegalArgumentException("Rental days must be positive.");
        }
        return (getBaseRentalRate() + INSURANCE_FEE) * days;
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }
}
