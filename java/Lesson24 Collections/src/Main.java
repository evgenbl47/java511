public class Main {
    public static void main(String[] args) {
        SingleLinkedList linkedList = new SingleLinkedList();

        linkedList.add("list1");
        linkedList.add("list2");
        linkedList.addStart("list0");
        linkedList.add(1, "list1.1");
        linkedList.add(9, "end");
        linkedList.print();
        System.out.println(linkedList.size());

    }
}



