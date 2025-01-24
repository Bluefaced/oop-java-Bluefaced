package EsiRentalServices;

public class Main {
    public static void main(String[] args) {
        // Create some sample vehicles
        Vehicle car1 = new car("VEH001", "Toyota Corolla", 20.0);
        Vehicle car2 = new car("VEH002", "Hyundai Accent", 79.0);
        Vehicle car3 = new car("VEH003", "Cadillac ", 114.0);
        Vehicle car4 = new car("VEH004", "Tesla Cybertruck", 254.0);

        // Display details of each vehicle
        System.out.println("Available Vehicles:");
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);

        // Test availability toggle
        car4.setAvailable(true);
        System.out.println("\nIs " + car4.getModel() + " available for rental? " + car4.isAvailable());

        // Test rental cost calculation
        System.out.println("\nRental costs:");
        System.out.println(car1.getModel() + " for 3 days: $" + car1.calculateRentalCost(3));
        System.out.println(car2.getModel() + " for 5 days: $" + car2.calculateRentalCost(5));
        System.out.println(car3.getModel() + " for 7 days: $" + car3.calculateRentalCost(7));
        System.out.println(car4.getModel() + " for 2 days: $" + car4.calculateRentalCost(7));

    }
}

