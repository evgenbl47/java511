public class SingleLinkedList {

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

    public void addStart(String value) {
        if (head == null) {
            head = new Node(value);
        }else {
            addToBegin(value);
        }
    }

    public void add(int index, String value) {
        if (index <= 0) {
            addToBegin(value);
            return;
        }

        Node adress = head;
        int ctn = 0;

        while (ctn != index - 1) {
            if (adress.next == null) {
                break;
            }
            adress = adress.next;
            ctn++;
        }

        Node newNode = new Node(value);
        newNode.next = adress.next;
        adress.next = newNode;
    }

    private void addToBegin(String value) {
        Node newHead = new Node(value);
        newHead.next = head;
        head = newHead;
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