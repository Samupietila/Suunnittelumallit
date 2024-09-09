package observer;
import java.util.Random;
import java.util.List;
import java.util.ArrayList;

public class WeatherStation implements Runnable {
    private List<Observer> observers = new ArrayList<>();
    private boolean running = true;
    private int temperature;
    private static final Random random = new Random();

    public WeatherStation() {
        this.temperature = random.nextInt(30);
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature);
        }
    }

    public void stop() {
        running = false;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public void run() {

        while (running) {
            setTemperature(temperature + random.nextInt(5) - 2);
            notifyObservers();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
