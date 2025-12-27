//todo Added method removeAllDuplicat() from classWork

public class Main {
    public static void main(String[] args) {

//        MyList myList = new MyList();

//        System.out.println("addEnd(55)");
//        myList.addEnd(55);
//        System.out.println("addEnd(66)");
//        myList.addEnd(66);
//        System.out.println("addByIndex(2, 99)");
//        myList.addByIndex(2, 99);
//        System.out.println("addEnd(77)");
//        myList.addEnd(77);
//        myList.print();
//        System.out.println("addStart(44)");
//        myList.addStart(44);
//        System.out.println("addStart(33)");
//        myList.addStart(33);
//        myList.print();
//        System.out.printf("getFrirst() :arr[%d] : %d\n", 0, myList.getFirst());
//        System.out.printf("isHasValue(%d) : %b\n", 66, myList.isHasValue(66));
//        System.out.printf("List size : %d\n", myList.size());
//        System.out.println("addStart(555)");
//        myList.addStart(555);
//        System.out.println("getIndexElem(0)");
//        System.out.println(myList.getIndexElem(0));
//        System.out.println("addEnd(77)");
//        myList.addEnd(77);
//        System.out.println("addEnd(78)");
//        myList.addEnd(78);
//        System.out.print("List before remove -> ");
//        myList.print();
//        System.out.println("removeByValueLast(88)");
//        myList.removeByValueLast(88);
//        //myList.reverse();
//        System.out.print("List  after remove -> ");
//        myList.print();
//        System.out.printf("Array isEmpty : %b\n", myList.isEmpty());
//        System.out.println("Array last elem :" + myList.getLast());
//        System.out.println("List clear()");
//        myList.clear();
//        System.out.println(myList.getFirst());;

        MyList myList = new MyList();
        myList.addStart(1);
        myList.addEnd(2);
        myList.addEnd(2);
        myList.addEnd(3);
        myList.addEnd(3);
        myList.addEnd(4);
        myList.addEnd(5);
        myList.addEnd(5);
        myList.addEnd(6);
        myList.addEnd(7);

//before => after
//1 2 3 4 1 1 1 1 1 2 3 4 => 1 2 3 4

        myList.print();//1 2 2 3 3 4 5 5 6 7
        myList.removeAllDuplicat();
        myList.print();//1 2 3 4 5 6 7

    }
}

//part_1
//1    +   public  void addEnd(int num);
//2    +   public  void print();
//3    +   public  void addStart(int num);
//4    +   public  int getFirst();
//5    +   public  boolean isHasValue(int num);
//6    +   public  int size();
//7    +   public  void clear();
//8    -   public  void removeByIndex(int index);
//9    +   public  void removeByValueFirst(int num);

//part_2
//10   +    public  void reverse();
//11   +    public  boolean isEmpty();
//12   -    public  int get(int index);
//13   -    public  int indexOf(int num);
//14   -    public  int lastIndexOf(int num);
//15   +    public  int getLast();
//16   +    public  void addByIndex(int index, int num);
//17   +    public  void removeByIndexLast(int index);