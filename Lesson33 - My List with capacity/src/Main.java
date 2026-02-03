//public class Main {
//    public static void main(String[] args) {
//
//    }
//}

import java.util.ArrayList;
import java.util.List;


class MyList {
    int[] arr;
    int size;
    int capacity;

    {
        size = 0;
        capacity = 16;
        arr = new int[capacity];
    }
    public void increaseCapacity() {
        if(size >= capacity) {
//            System.out.println("Peresozday massiv!!!!!");
            capacity = capacity * 2 + 2;
            int[] tmp = new int[capacity];
            for (int i = 0; i < size; i++) {
                tmp[i] = arr[i];
            }
            arr = tmp;
        }
    }

    public void decreaseCapacity(){
        int newSize = size;

        while (newSize < capacity && newSize > 0) {
            newSize = size / 2;
        }

        if (newSize < capacity && newSize > 0) {
            int[] tmp = new int[capacity];
            for (int i = 0; i < newSize; i++) {
                if (arr[i]  == 0)
                tmp[i] = arr[i];
            }
            arr = tmp;
            }
    }

    public void addEnd(int num) {
        increaseCapacity();

        arr[size] = num;
        size++;
    }
    public void addStart(int num) {
        increaseCapacity();

        for(int i = size; i > 0; i--)
            arr[i] = arr[i-1];

        arr[0] = num;
        size++;
    }


//    public  void addByIndex(int index, int num){
//        if (index<=0) {
//            addStart(num);
//        } else if (index>=size) {
//            addEnd(num);
//        }else{
//            int[] tmp = new int[size + 1];
//            for (int i = 0,j =0; i < tmp.length; i++ ) {
//                if(i==index){
//                    tmp[i] = num;
//                }else{
//                    tmp[i] = arr[j++];
//                }
//            }
//            size++;
//            arr = tmp;
//        }
//    }


    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public int capacity() {
        return  capacity;
    }
    public int size() {
        return  size;
    }


    public  void removeByValueLast(int num){
        if (isHasValue(num)) {
            int[] tmp = new int[size - 1];

            int count = 0;
            for (int i = arr.length-1,j = tmp.length-1; i >= 0; i--) {
                if (arr[i] == num && count==0) {
                    count++;
                    continue;
                }
                tmp[j--] = arr[i];
            }

            size--;
            arr = tmp;
        }
    }

    public  boolean isHasValue(int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return true;
            }
        }
        return false;
    }

    public  void removeByValueFirst(int num){
        boolean isHas = false;

        for (int i = 0; i < size; i++) {
            if (arr[i] == num) {
                isHas = true;
                break;
            }
        }

        if (isHas) {
            int[] tmp = new int[size - 1];
            for (int i = 0,j=0; i < size; i++) {
                if (isHas && arr[i] == num) {
                    isHas = false;
                    continue;
                }

                tmp[j++] = arr[i];
            }

            size--;
            arr = tmp;
        }
    }
}

//1    +   public  void addEnd(int num);
//2    +   public  void print();
//3    +   public  void addStart(int num);
//4    -   public  int getFirst();
//5    -   public  boolean isHasValue(int num);
//9    -   public  int size();
//10   -   public  void clear();
//7    -   public  void removeByIndex(int index);
//8    +   public  void removeByValueFirst(int num);


//10   -    public  void reverse();
//11   -    public  boolean isEmpty();
//12   -    public  int get(int index);
//13   -    public  int indexOf(int num);
//14   -    public  int lastIndexOf(int num);
//15   -    public  int getLast();
//16   +    public  void addByIndex(int index, int num);
//17   +    public  void removeByValueLast(int num);



public class Main {
    public static void main(String[] args) {


//        String str = "101112";
//        int num = 1000;
//        System.out.println(str.length());

//
//        int[] arr = {1111111,22222222,333333};
//        System.out.println(arr.length);

        String str = "111111122222222333333";
        System.out.println(str.length());

        MyList list = new MyList();
        for (int i = 1000; i < 1003; i++) {
            list.addEnd(i);

            System.out.println(list.capacity() + "/" + list.size());
        }


        list.size = 200;
        System.out.println(list.size);
        list.decreaseCapacity();
        System.out.println(list.size);


        list.print();


//        String str = "";
//        StringBuilder stringBuilder = new StringBuilder();
//        for (int i = 0; i < 100; i++) {
//            str += i;
//            //0
//            //01
//            //012
//            //0123
//            //01234
//            //012345
//            //0123456
//            //01234567
//            //012345678
//            //0123456789
//            //012345678910
//            //01234567891011
//            //0123456789101112
//
//
//            stringBuilder.append(i);
//
//            System.out.println(stringBuilder.capacity() + "/" + stringBuilder.length());
//            //10/20
//            //0123456789
//
//        }
//        System.out.println(stringBuilder);
//        System.out.println(str);





//        MyList myList = new MyList();
//        myList.addEnd(1);
//        myList.addEnd(2);
//        myList.addEnd(3);
//        myList.addEnd(4);
//        myList.addEnd(5);
//        myList.addEnd(6);
//        myList.addEnd(7);
//        myList.addEnd(4);
//        myList.print();
//        myList.removeByValueLast(4);
//        myList.print();


    }
}