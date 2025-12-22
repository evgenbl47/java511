

public class Main {
    public static void main(String[] args) {

        MyList myList = new MyList();
        System.out.println("addEnd(55)");
        myList.addEnd(55);
        System.out.println("addEnd(66)");
        myList.addEnd(66);
        System.out.println("addByIndex(2, 99)");
        myList.addByIndex(2, 99);
        System.out.println("addEnd(77)");
        myList.addEnd(77);
        myList.print();
        System.out.println("addStart(44)");
        myList.addStart(44);
        System.out.println("addStart(33)");
        myList.addStart(33);
        myList.print();
        System.out.printf("getFrirst() :arr[%d] : %d\n", 0, myList.getFirst());
        System.out.printf("isHasValue(%d) : %b\n", 66, myList.isHasValue(66));
        System.out.printf("List size : %d\n", myList.size());
        System.out.println("List clear()");
        myList.clear();
        myList.print();
        myList.addStart(555);
        myList.print();
    }
}

//Выполнить от 1 - 9
//1    +   public  void addEnd(int num);
//2    +   public  void print();
//3    +   public  void addStart(int num);
//4    +   public  int getFirst();
//5    +   public  boolean isHasValue(int num);
//6    +   public  int size();
//7    +   public  void clear();
//8    -   public  void removeByIndex(int index);
//9    +   public  void removeByValueFirst(int num);

