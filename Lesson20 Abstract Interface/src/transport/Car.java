package transport;

public class Car extends Transport{
    public Car(String brand, int year, int maxSpeed) {
        super(brand, year, maxSpeed);
    }

    @Override
    public void move() {
        System.out.printf("Car :%s manufactured %d driving with speed :%d.\n", getBrand(), getYear(), getMaxSpeed());
    }

    @Override
    public void refuel() {
        System.out.printf("Car :%s stop at the gas station and getting refuel.\n", brand);
    }
}
