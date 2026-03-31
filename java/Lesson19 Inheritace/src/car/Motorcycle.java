package car;

public class Motorcycle extends Vehicle {


    public Motorcycle(String model, int manufacture) {
        super(model, "Motorcycle", manufacture);
    }

    @Override
    public void move() {
        setSpeed(20);
        System.out.println("I'm start moving by " + getType() + " with speed " + getSpeed());
    }
}
