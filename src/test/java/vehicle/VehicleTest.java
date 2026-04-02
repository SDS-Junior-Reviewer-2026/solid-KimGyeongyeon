package vehicle;


public class VehicleTest {
    @Test
    public void test_sample() {
        Vehicle vehicle = new Vehicle(10);
        assertEquals(10, vehicle.getRemainingFuel()); 
    }
}
