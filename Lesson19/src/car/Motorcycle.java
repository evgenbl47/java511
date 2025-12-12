package car;

public class Motorcycle extends Vehicle {

    private String type;

    public Motorcycle(String model, int manufacture) {
        super(model, "Motorcycle", manufacture);
    }

    @Override
    public void move() {
        setSpeed(20);
        System.out.println("I'm start moving by " + this.type + " with speed " + this.getSpeed());
    }
}
