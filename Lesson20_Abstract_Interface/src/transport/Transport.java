package transport;

public abstract class Transport {
    protected String brand;
    protected int year;
    protected int maxSpeed;

    public Transport(String brand, int year, int maxSpeed) {
        this.brand = brand;
        this.year = year;
        this.maxSpeed = maxSpeed;
    }

    public void displayInfo() {
        System.out.printf("Transport brand :%s, manufactured :%d, maxSpeed :%d.\n", brand, year, maxSpeed);
    }

    public abstract void move();
    public abstract void refuel();

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
}
