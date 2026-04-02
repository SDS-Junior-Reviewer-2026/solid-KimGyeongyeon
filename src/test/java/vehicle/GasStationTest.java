package vehicle;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GasStationTest {
    private GasStation createGasStation(double pricePerLiter) {
        return new GasStation(pricePerLiter);
    }
    private Vehicle createVehicle(int remainingFuel, int maxFuel) {
        Vehicle v = new Vehicle(maxFuel);
        v.setRemainingFuel(remainingFuel);
        return v;
    }
    @Test
    public void given_주유량10L일때_whenReFuel_then15000청구() {
        GasStation sut = createGasStation(1500);
        Vehicle vehicle = createVehicle(90, 100);

        // when
        double amount = sut.reFuel(vehicle);

        // then
        Assertions.assertEquals(15_000, amount);
    }
}
