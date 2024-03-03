package in.balamt.practice.designpattern.behavioral.observer;

public interface WeatherStationSubject {
    void registerObserver(WeatherObserver wo);
    void removeObserver(WeatherObserver wo);
    void notifyObserver();
}
