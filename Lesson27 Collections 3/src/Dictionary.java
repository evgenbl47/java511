import java.util.*;

public class Dictionary {
    Map<String, Map<String, Map<String, List<String>>>> dictionary = new HashMap<>();

    public Dictionary() {
        dictionary.put("en", new HashMap<>());
        dictionary.get("en").put("ru", new HashMap<>());
        dictionary.get("en").get("ru").put("mother", new ArrayList<>());
        dictionary.get("en").get("ru").get("mother").add("мама");
        dictionary.get("en").get("ru").get("mother").add("мать");

        dictionary.put("en", new HashMap<>());
        dictionary.get("en").put("ru", new HashMap<>());
        dictionary.get("en").get("ru").put("mother", new ArrayList<>());
        dictionary.get("en").get("ru").get("mother").add("мама");
        dictionary.get("en").get("ru").get("mother").add("мать");

    }

    public void runDictionary() {

        do {
            System.out.println("""
                    1 - print
                    2 - translate
                    3 - print
                    4 - exit""");

            Scanner sc = new Scanner(System.in);
            int choise = sc.nextInt();

            if (choise == 1) {
                printDictionary(dictionary);
            } else if (choise == 2) {
                sc = new Scanner(System.in);

                System.out.println("Enter word to translate");
                String word = sc.next();
            } else if (choise == 3) {

            } else if (choise == 4) {
                System.out.println("Exit");
                break;
            } else {
                System.out.println("Wrong choise");
            }

        } while (true);


//        System.out.println("""
//                1 - EN - RU
//                2 - RU - EN""");
    }

    public static void printDictionary(Map<String, Map<String, Map<String, List<String>>>> dictionary) {
        for (Map.Entry<String, Map<String, Map<String, List<String>>>> entry : dictionary.entrySet()) {
            System.out.print(entry.getKey() + " - "); //ru -

            for (Map.Entry<String, Map<String, List<String>>> subEntry : entry.getValue().entrySet()) {
                System.out.println(subEntry.getKey() + " "); //en

                for (Map.Entry<String, List<String>> subSubEntry : subEntry.getValue().entrySet()) {
                    System.out.print(subSubEntry.getKey() + " => ");  //key =>

                    for (String key : subSubEntry.getValue()) {
                        System.out.print(key + " ");  //value value value
                    }
                    System.out.println();
                }
            }
            Map<String, Map<String, List<String>>> value = entry.getValue();
            System.out.println(entry.getKey() + " | " + value.entrySet());
        }
    }

    public static void translated(String word, Map<String, Map<String, Map<String, List<String>>>> dictionary) {
        word = word.toLowerCase();
        for (Map.Entry<String, Map<String, Map<String, List<String>>>> entry : dictionary.entrySet()) {
            System.out.print(entry.getKey() + " ");  //en

            for (Map.Entry<String, Map<String, List<String>>> subEntry : entry.getValue().entrySet()) {
                System.out.println(subEntry.getKey() + " ");  //ru

                for (Map.Entry<String, List<String>> subSubEntry : subEntry.getValue().entrySet()) {
                    System.out.print(subEntry.getKey() + " => ");  //key =>

                    for (String key : subSubEntry.getValue()) {
                        System.out.print(key + " ");  //value
                    }
                    System.out.println();
                }
            }
        }
    }
}

