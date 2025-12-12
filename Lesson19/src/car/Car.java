package car;

public class Car extends Vehicle {
    private String type;

    public Car(String model, int manufacture) {
        super(model, "Car", manufacture);
        this.type = getType();
    }
}
