package transport;

public class Boat extends Transport{
    public Boat(String brand, int year, int maxSpeed) {
        super(brand, year, maxSpeed);
    }

    @Override
    public void move() {
        System.out.printf("Boat :%s manufactured %d swimming with speed :%d.\n", brand, year, maxSpeed);
    }

    @Override
    public void refuel() {
        System.out.printf("Boat :%s stop and captan getting some diesel or coal fuel in it\n", getBrand());
    }
}
