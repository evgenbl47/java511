package car;

public class Vehicle {
    private String model;
    private String type;
    private int manufacture;
    private int speed;

    public Vehicle(String model, String type, int manufacture) {
        this.model = model;
        this.type = type;
        this.manufacture = manufacture;
    }

    public void move(){
        System.out.println("How to move?");
    }

    public String getModel() {
        return model;
    }

    public int getManufacture() {
        return manufacture;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {

        this.speed = speed;
    }

    public String getType() {
        return type;
    }

}
