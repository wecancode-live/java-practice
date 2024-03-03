package in.balamt.practice.designpattern.behavioral.observer;

public interface WeatherObserver {
    void updateWeatherStats(float temp, int windSpeed, int pressure);
    void updateTemperature(float temp);
    void updateWindSpeed(int speed);
    void updatePressure(int pressure);
}
