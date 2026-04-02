package weather;


public class EmailTest {
    @Test
    public void testGeneratesAlertString() {
        Email email = new Email();
        assertEquals("It is sunny", email.generateWeatherAlert("sunny"));
    }
}
