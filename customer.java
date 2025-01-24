package EsiRentalServices;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Customer {
    private final String customerId;
    private final String name;
    private final List<RentalTransaction> rentalHistory;

    public Customer(String customerId, String name) {
        this.customerId = customerId;
        this.name = name;
        this.rentalHistory = new ArrayList<>();
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public void addRental(RentalTransaction transaction) {
        rentalHistory.add(transaction);
    }

    public List<RentalTransaction> getRentalHistory() {
        return Collections.unmodifiableList(rentalHistory);
    }
}
