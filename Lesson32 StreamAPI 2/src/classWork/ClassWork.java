package classWork;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
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

    public void main2() {

        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();

        System.out.print("Введите общее количество фильмов: ");
        int totalMovies = sc.nextInt();

        for (int i = 1; i <= totalMovies; i++) {
            list.add("Movie #"+i);
        }
        int view = 3; // skolko filmov na 1 stranicu
//        int page = 5;  // kakaya stranica
        int pageSize = 10; //  skolko vseqo filmov podskazka totalMovies/view
        int totalPages = (totalMovies + pageSize - 1) / pageSize;

        do {
            sc = new Scanner(System.in);
            for(int i = 1; i <= pageSize; i++) {
                System.out.print(i + " ");
            }
            System.out.println();  // Otobrazitsa vozmojnie stranici
            int page = sc.nextInt();
            //choice
            //todo: list.stream().limit(10).forEach(System.out::println); // pecataet pravilniy diapazon

            //
        }while(true);

    }
}




