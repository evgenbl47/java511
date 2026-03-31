package animal;

public class Bird extends Animal {

    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Chu - chu");
    }

    @Override
    public void makeSound(String message) {
        System.out.println(message);
    }

    public void fly() {
        System.out.println("I'm flying....");
    }

    @Override
    public void doSmth() {
        fly();
    }
}
