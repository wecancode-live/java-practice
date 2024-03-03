package in.balamt.practice.designpattern.behavioral.observer;

import in.balamt.practice.util.JavaPracticeUtils;

public class UserInterfaceObserver implements WeatherObserver {

    private float temperature;
    private int windSpeed;
    private int pressure;
    private final WeatherStationSubject weatherStationSubject;

    UserInterfaceObserver(WeatherStationSubject weatherStationSubject){
        this.weatherStationSubject = weatherStationSubject;
        this.weatherStationSubject.registerObserver(this);
    }

    @Override
    public void updateWeatherStats(float temp, int windSpeed, int pressure) {
        this.temperature = temp;
        this.windSpeed = windSpeed;
        this.pressure = pressure;
        display();
    }

    @Override
    public void updateTemperature(float temp) {
        this.temperature = temp;
        display();
    }

    public void display() {
        JavaPracticeUtils.printLine(String.format("Temperature is %f", this.temperature));
        JavaPracticeUtils.printLine(String.format("Wind Speed is %d", this.windSpeed));
        JavaPracticeUtils.printLine(String.format("Pressure is %d", this.pressure));
    }

    @Override
    public void updateWindSpeed(int speed) {
        this.windSpeed = speed;
        display();
    }

    @Override
    public void updatePressure(int pressure) {
        this.pressure = pressure;
        display();
    }
}
