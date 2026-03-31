package car;

public class Bicycle extends Vehicle {
    private int gears;

    public Bicycle(String model, int manufacture) {
        super(model, "Bicycle", manufacture);
    }


    @Override
    public void move() {
        setSpeed(10);
        System.out.println("I'm start moving by " + getType() +" with speed " + getSpeed());
    }
}
