package vehicle;

public class GasStation {
    private double pricePerLiter = 1_500;

    GasStation(double pricePerLiter) {
        this.pricePerLiter = pricePerLiter;
    }

    public double reFuel(Vehicle vehicle) {
        int amount = vehicle.getMaxFuel() - vehicle.getRemainingFuel();
        vehicle.addFuel(amount);
        return pricePerLiter * amount;
    }
}
