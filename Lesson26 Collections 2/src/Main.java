import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {

        //2
        Integer[] numbers = {1, 2, 3, 4};
        printArr(numbers);

        //1
        Box<String> box = new Box<>("Box");
        System.out.println(box.getItem());
        box.setItem("Pandora's Box");
        System.out.println(box.getItem());

        //3
        List<String> list = new ArrayList<>();
        list.add("first");
        System.out.println(getFirstElem(list));

        //4
        System.out.println(contains(numbers, 1));

        //5
        Pair<Integer, String > pair = new Pair<>(1, "One");
        System.out.println("First: " + pair.getFirst() + ", Second: " + pair.getSecond());
    }

//    Задание 2: Метод печати массива
//    Напишите generic-метод printArray, который печатает любой массив.
    public static <T> void printArr(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

//    Задание 3: Метод получения первого элемента
//    Напишите generic-метод getFirst, который возвращает первый элемент из списка.
//    public static <T> T getFirst(List<T> list) {
//      проверьте, что список не пустой
//      верните первый элемент
//    }
    public static <T> T getFirstElem(List<T> list) {
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is Empty");
        } else {
            return list.get(0);
        }
    }

//    Задание 4: Метод проверки содержания элемента
//    Напишите generic-метод contains, который проверяет, есть ли элемент в массиве.
    public static<T> boolean contains(T[] arr, T elem) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == elem) {
                return true;
            }
        }
        return false;
    }
}

//Задание 1: Класс Box (Коробка)
//Создайте generic-класс Box<T>, который хранит один элемент любого типа.
//class Box<T> {
//    создайте приватное поле item типа T
//    создайте конструктор, который принимает T item
//    создайте метод getItem() который возвращает item
//    создайте метод setItem(T item) который устанавливает item
//}
class Box<T> {
    private T item;

    public Box(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}

//Задание 5: Класс Pair для двух элементов
//Создайте generic-класс Pair<F, S>, который хранит два элемента разных типов (First и Second).
//class Pair<F, S> {
//создайте два приватных поля: first типа F и second типа S
//      создайте конструктор
//      создайте геттеры getFirst() и getSecond()
//}
class Pair<F, S> {
    private F first;
    private S second;


    public Pair(F first, S second) {
        this.first = first;
        this.second = second;
    }

    public F getFirst() {
        return first;
    }

    public void setFirst(F first) {
        this.first = first;
    }

    public S getSecond() {
        return second;
    }

    public void setSecond(S second) {
        this.second = second;
    }
}
