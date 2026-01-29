 import java.util.ArrayList;
 import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Dictionary dictionary = new Dictionary();
        dictionary.runDictionary();


    }

    static void runMain() {
        Map<String, List<String>> dictionary = new HashMap<>();

        dictionary.put("mother", new ArrayList<>());
        dictionary.get("mother").add("мама");
        dictionary.get("mother").add("мать");

        dictionary.put("father", new ArrayList<>());
        dictionary.get("father").add("папа");
        dictionary.get("father").add("отец");

        for (Map.Entry<String, List<String>> entry : dictionary.entrySet()) {
            System.out.print(entry.getKey() + " => ");
            for (String value : entry.getValue()) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

}