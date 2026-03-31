package animal;

public class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("woof - woof");
    }

    public void findBranch() {
        System.out.println("Searching something...");
    }

    @Override
    public void doSmth() {
        findBranch();
    }
}
