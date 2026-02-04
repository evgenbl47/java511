import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

//        Stream<String> stream = Stream.of("hello", "world");
//        stream.forEach(System.out::println);

//        String[] arr = {"a1", "a2", "a3"};
//        Stream<String> stream = Arrays.stream(arr);

//        List<String> list = Arrays.asList("a", "b", "c", "d");
//        Stream<String> stream = list.stream();

        Stream<Object> stream = Stream.builder().add("a1").add("a2").add("a3").build();
//        stream.forEach(System.out::println);
        stream.forEach( x -> System.out.println(x));



//        List<Integer> list = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            list.add(i);
//        }

        //filter
//        list = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
//        list = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());


        List<String> list = Arrays.asList("one", "two", "three", "four");
        list.stream().flatMap(word -> Arrays.stream(word.split(""))).forEach(System.out::println);

        class Person{
            String name;
            int age;

            public Person(String name, int age) {
                this.name = name;
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

        List<Person> people = new ArrayList<>();
        people = people.stream().filter(x -> {
//            String res = x.name.substring(4);
//            Integer num = Integer.parseInt(res);
            Integer num = Integer.parseInt(x.name.substring(4));

//            if (num > 18) {
//                return true;
//            } else {
//                return false;
//            }
            return (num > 18);
        }).collect(Collectors.toList());

        people = people.stream().sorted((x, y) -> x.name.compareTo(y.name)).collect(Collectors.toList());

        int[] age = people.stream().mapToInt(x -> x.age).toArray();

        for (int i = 15; i < 22; i++) {
            people.add(new Person("name" + i, i));

        }
        people.add(new Person("Maxim" + 18, 19));

        people.stream()
                .peek(x -> System.out.println("hello: " + x.name))
                .filter(x -> x.age > 19)
                .peek(x -> System.out.println("my age: " + x.age))
                .forEach(System.out::println);

//        people = people.stream().filter(x -> x.age > 18).collect(Collectors.toList());
//        people = people.stream().filter(x -> x.name.contains("Max")).collect(Collectors.toList());

        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i) + " ");
        }
    }
}