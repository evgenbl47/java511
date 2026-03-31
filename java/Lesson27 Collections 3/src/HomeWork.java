import java.util.HashMap;
import java.util.Map;

public class HomeWork {
    Map<String, String[]> map = new HashMap<>();

    public HomeWork() {
        map.put("fruits" , new String[]{"apple", "banana"});
        map.put("colors" , new String[]{"red", "blue"});
    }

    public void showMap() {
        for (Map.Entry<String, String[]> entry : map.entrySet()) {
            if (entry.getKey().contains("fruits")) System.out.println("Fruits exist");
            else System.out.println("No fruits");

            System.out.print(entry.getKey() + " -> ");
            for (String s : entry.getValue()) {
                System.out.print(s + " ");
            }
            System.out.println();
        }
    }

}
//Задание: Map<String, String[]>
//УСЛОВИЕ 1
//
//Добавь в map 2 элемента:
//ключ "fruits" → массив {"apple", "banana"}
//ключ "colors" → массив {"red", "blue"}
//
//УСЛОВИЕ 2
//Выведи на экран все ключи и все элементы массивов.
//
//УСЛОВИЕ 3
//если в map есть ключ "fruits" → выведи "Fruits exist"
//если нет → "No fruits"