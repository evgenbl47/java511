package animal;

public class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = setAge(age);
    }

    public void makeSound(String message) {
        makeSound();
    }

    public void makeSound() {
        System.out.println("I can't make sound");
    }

    public String getInfo() {
        return "Animal [" +
                "name: " + name +
                ", age: " + age +
                "]";
    }

    public void doSmth() {
        System.out.println("I can't");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int setAge(int age) {
        if (age < 0 || age > 100) {
            return 0;   // means unknown
        }
        return age;
    }
}
