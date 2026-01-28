import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dictionary {
    Map<String, Map<String, Map<String, List<String>>>> dictionary = new HashMap<>();

    Map<String, String> simpleMap = new HashMap<>();

    public void runDictionary() {

        System.out.println("""
                1 - EN - RU
                2 - RU - EN""");
    }

}
