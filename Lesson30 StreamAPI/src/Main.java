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
        stream.forEach(System.out::println);

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        //filter
        list = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());

    }
}