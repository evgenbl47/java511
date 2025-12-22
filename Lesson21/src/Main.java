

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
        System.out.println("addStart(555)");
        myList.addStart(555);
        System.out.print("List before reverse -> ");
        myList.print();
        myList.reverse();
        System.out.print("List  after reverse -> ");
        myList.print();
        System.out.printf("Array isEmpty : %b\n", myList.isEmpty());
        System.out.println("List clear()");
        myList.clear();
        System.out.printf("Array isEmpty : %b\n", myList.isEmpty());
        myList.isEmpty();

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
//15   -    public  int getLast();
//16   -    public  void addByIndex(int index, int num);
//17   -    public  void removeByIndexLast(int index);