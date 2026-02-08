import hWork.Home;

import java.util.*;


class Person {
    String name;
    int age;
    boolean isMan;

    public Person(String name, int age, boolean isMan) {
        this.name = name;
        this.isMan = isMan;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " " + age + " " + isMan;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && isMan == person.isMan && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, isMan);
    }
}

public class Main {

    public static void main(String[] args) {

        Home home = new Home();
        home.start();

    }
}