package in.balamt.practice.designpattern.behavioral.observer;

import in.balamt.practice.util.JavaPracticeUtils;

public class AlertObserver implements WeatherObserver {

    private float temperature;
    private int windSpeed;
    private int pressure;


    AlertObserver(WeatherStationSubject wss){
        wss.registerObserver(this);
    }

    public void alert(){
        JavaPracticeUtils.printLine(String.format("Alert: Temperature is %f", this.temperature));
        JavaPracticeUtils.printLine(String.format("Alert: Wind Speed is %d", this.windSpeed));
        JavaPracticeUtils.printLine(String.format("Alert: Pressure is %d", this.pressure));
    }

    @Override
    public void updateWeatherStats(float temp, int windSpeed, int pressure) {
        this.temperature = temp;
        this.windSpeed = windSpeed;
        this.pressure = pressure;
        alert();
    }

    @Override
    public void updateTemperature(float temp) {
        this.temperature = temp;
        alert();
    }

    @Override
    public void updateWindSpeed(int speed) {
        this.windSpeed = speed;
        alert();
    }

    @Override
    public void updatePressure(int pressure) {
        this.pressure = pressure;
        alert();
    }
}
