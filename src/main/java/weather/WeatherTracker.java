package weather;

public class WeatherTracker {
    String currentConditions;
    Phone phone;
    Email email;

    public WeatherTracker() {
        phone = new Phone();
        email = new Email();
    }

    public void setCurrentConditions(String weatherDescription) {
        this.currentConditions = weatherDescription;
        if (weatherDescription == "rainy") {
            String alert = phone.generateWeatherAlert(weatherDescription);
            System.out.print(alert);
        }
        if (weatherDescription == "sunny") {
            String alert = email.generateWeatherAlert(weatherDescription);
            System.out.print(alert);
        }
    }
}