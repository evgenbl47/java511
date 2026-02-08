package exampl;
public class ClassWork {
    public void run() {
        SingleLnkedList linkedList = new SingleLnkedList();

        linkedList.add("Кот");
        linkedList.add("Пёс");
        linkedList.add("Ёж");
        linkedList.add("Заяц");
        linkedList.add("Слон");
        linkedList.add("Рысь");

        linkedList.print();

    }
}

class Node {
    public Node next;
    private String value;

    public Node(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

class SingleLnkedList {
    private Node head;

    public void add(String value) {
        if (head == null) {
            head = new Node(value);
        } else  {
            Node adress = head;
            while (adress.next != null) {
                adress = adress.next;
            }
            adress.next = new Node(value);
        }
    }

    public String get(int index) {
        if (head == null || index < 0) {
            throw new IndexOutOfBoundsException("Index out of bounds, index:" + index + ", head:" + head == null?"null":head.getValue());
        }
        Node start = head;
        int ctn = 0;
        while (start.next != null) {
            if (ctn == index) {
                return start.getValue();
            }
            ctn++;
            start = start.next;
        }
        throw new ArrayIndexOutOfBoundsException("Array index of bounds exception");

    }

    public void print() {
        Node tmp = head;
        while (tmp != null) {
            System.out.print(tmp.getValue() + " ");
            tmp = tmp.next;
        }
        System.out.println();
    }
}



