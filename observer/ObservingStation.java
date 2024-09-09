package observer;

public  class ObservingStation implements Observer {
    private String name;

    public ObservingStation(String name) {
        this.name = name;
    }

    @Override
    public void update(int temperature) {
        System.out.println(name + " got notified. " + "Temperature is: " + temperature);
        System.out.println("–———————————————————————————————————————–");
    }
    
}
