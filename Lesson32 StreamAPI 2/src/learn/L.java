package learn;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class L {
//    How to Start a Stream
//    Take a list and call .stream() on it.
//    Example:

    List<String> names = Arrays.asList("apple", "banana", "cherry");
    Stream<String> myStream = names.stream();  // Now you have a belt of names
    //Stream.of("one", "two")


    List<String> result = names.stream()        // Start the belt
            //filter: Keep only items that match a simple rule. Example: keep long names.
            .filter(name -> name.length() < 6)     // Keep short names (apple stays, cherry goes)
            //map: Change every item. Example: make all names uppercase.
            .map(name -> name.toUpperCase())       // Make uppercase
            //collect: Save the final list.
            .collect(Collectors.toList());         // Save as new list: ["APPLE", "BANANA"]
}
