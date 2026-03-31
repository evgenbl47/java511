package example;

public class MySecondList {

    String string = "";
    StringBuilder str = new StringBuilder(string);

    public void start() {
        for (int i = 0; i < 10; i++) {
            str.append(i);
        }

        print();
    }

    public void print() {
        System.out.println(str);
    }
}
