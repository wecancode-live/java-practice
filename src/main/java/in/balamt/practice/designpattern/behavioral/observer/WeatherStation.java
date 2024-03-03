package in.balamt.practice.designpattern.behavioral.observer;

import java.util.ArrayList;

public class WeatherStation implements WeatherStationSubject {

    private ArrayList<WeatherObserver> observers;
    private float temperature = 0;
    private int windSpeed = 0;
    private int pressure = 0;

    WeatherStation() {
        if(observers == null) {
            observers = new ArrayList<>();
        }
    }

    @Override
    public void registerObserver(WeatherObserver wo) {
        observers.add(wo);
    }

    @Override
    public void removeObserver(WeatherObserver wo) {
        observers.remove(wo);
    }

    @Override
    public void notifyObserver() {
        for(WeatherObserver wo : observers){
            wo.updateWeatherStats(temperature, windSpeed, pressure);
//            wo.updatePressure(pressure);
//            wo.updateTemperature(temperature);
//            wo.updateWindSpeed(windSpeed);
        }
    }
    public void setWeatherStats(float temp, int speed, int pressure){
        this.temperature = temp;
        this.windSpeed = speed;
        this.pressure = pressure;
        notifyObserver();
    }
}
