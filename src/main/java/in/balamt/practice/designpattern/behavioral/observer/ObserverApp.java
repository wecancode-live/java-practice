package in.balamt.practice.designpattern.behavioral.observer;

public class ObserverApp {

    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        UserInterfaceObserver uiObserver = new UserInterfaceObserver(weatherStation);
        LoggerObserver loggerObserver = new LoggerObserver(weatherStation);
        AlertObserver alertObserver = new AlertObserver(weatherStation);

        weatherStation.setWeatherStats(10f,23,33);

    }
}
