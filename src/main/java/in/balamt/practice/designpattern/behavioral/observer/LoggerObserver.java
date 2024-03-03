package in.balamt.practice.designpattern.behavioral.observer;

import in.balamt.practice.util.JavaPracticeUtils;

public class LoggerObserver implements WeatherObserver {
    private float temperature;
    private int windSpeed;
    private int pressure;

    LoggerObserver(WeatherStationSubject weatherStationSubject){
        weatherStationSubject.registerObserver(this);
    }

    public void log(){
        JavaPracticeUtils.printLine(String.format("Logger: Temperature is %f", this.temperature));
        JavaPracticeUtils.printLine(String.format("Logger: Wind Speed is %d", this.windSpeed));
        JavaPracticeUtils.printLine(String.format("Logger: Pressure is %d", this.pressure));
    }

    @Override
    public void updateWeatherStats(float temp, int windSpeed, int pressure) {
        this.temperature = temp;
        this.windSpeed = windSpeed;
        this.pressure = pressure;
        log();
    }

    @Override
    public void updateTemperature(float temp) {
        this.temperature = temp;
        log();
    }

    @Override
    public void updateWindSpeed(int speed) {
        this.windSpeed = windSpeed;
        log();
    }

    @Override
    public void updatePressure(int pressure) {
        this.pressure = pressure;
        log();
    }
}
