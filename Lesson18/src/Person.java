public class Person {
    private static int counter = 0;
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        counter++;
    }

    public Person() {
    }

    public void speakHello() {
        System.out.println("Hello, this name is :" + name);
    }

    public static int getCounter() {
        return counter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
