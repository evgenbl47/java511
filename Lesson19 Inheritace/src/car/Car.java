package car;

public class Car extends Vehicle{
    int doors;

    public Car(String model, int manufactre) {
        super(model, "Car", manufactre);

    }

    @Override
    public void move() {
        setSpeed(20);
        System.out.println("I'm start moving by " + getType() + " with speed " + getSpeed());
    }
}
