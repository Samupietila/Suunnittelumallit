package observer;

public class Main {
    public static void main(String[] args) {
        ObservingStation observingStation = new ObservingStation("Station 1");
        ObservingStation observingStation2 = new ObservingStation("Station 2");
        ObservingStation observingStation3 = new ObservingStation("Station 3");
        ObservingStation observingStation4 = new ObservingStation("Station 4");
        ObservingStation observingStation5 = new ObservingStation("Station 5");

        WeatherStation weatherStation = new WeatherStation();
        Thread thread = new Thread(weatherStation);
        thread.start();
        weatherStation.addObserver(observingStation);
        weatherStation.addObserver(observingStation2);
        weatherStation.addObserver(observingStation3);
        weatherStation.addObserver(observingStation4);
        weatherStation.addObserver(observingStation5);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        weatherStation.removeObserver(observingStation);
        weatherStation.removeObserver(observingStation2);
    }
    
}
