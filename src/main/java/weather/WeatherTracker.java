package weather;

public class WeatherTracker {
    String currentConditions;

    public void setCurrentConditions(String weatherDescription) {
        this.currentConditions = weatherDescription;

        Notifier notifier = NotifierFactory.create(weatherDescription);
        String alert = notifier.generateWeatherAlert(weatherDescription);
        System.out.print(alert);
    }
}