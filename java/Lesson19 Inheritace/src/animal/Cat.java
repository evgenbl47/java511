package animal;

public class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Meow - meow");
    }

    public void trackDog() {
        System.out.println("Looking around...");
    }

    @Override
    public void doSmth() {
        trackDog();
    }
}
