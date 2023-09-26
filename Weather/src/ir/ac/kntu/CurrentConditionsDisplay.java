package ir.ac.kntu;

public class CurrentConditionsDisplay implements Observer {
    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        // write your code here!
    }

    public void update(float temperature, float humidity) {
        // write your code here!
    }

    public void display() {
        //just uncomment this:
        //.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }
}
