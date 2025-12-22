import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        ClassWork myList = new ClassWork();


        myList.addEnd(55);
        myList.addEnd(66);
        myList.addEnd(66);
        myList.addEnd(66);
        myList.addEnd(77);
        myList.addEnd(88);
        myList.addEnd(99);
        myList.print();
        myList.addByIndex(3, 999);
        myList.print();

    }
}

//
//        int[] arr = new int[3];
//        arr[0] = 1;
//        arr[1] = 2;
//        arr[2] = 3;
//
//        arr = new int[4];
//        System.out.println(arr[0]);

//        List<Integer> list = new ArrayList<>();
//
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        list.add(6);
//
//        for (int i : list) {
//            System.out.print(i + " ");
//        }