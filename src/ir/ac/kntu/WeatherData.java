package ir.ac.kntu;

import java.util.ArrayList;

public class WeatherData implements Subject {
    // write your code here!

    public WeatherData() {
        // write your code here!
    }

    public void registerObserver(Observer o) {
        // write your code here!
    }

    public void removeObserver(Observer o) {
        // write your code here!

    }

    public void notifyObservers() {
        // write your code here!
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity) {
        // write your code here!
    }
}