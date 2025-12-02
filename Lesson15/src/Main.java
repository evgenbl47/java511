//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static char[] substring(char[] arr, int start) {
        int newSize = arr.length - start;
        char[] newArr = new char[newSize];

        for (int i = start, j = 0; i < arr.length; i++, j++) {
            newArr[j] = arr[i];
        }

        return newArr;
    }

    public static void print(char[] ch) {
        if (ch.length == 0) {
            System.out.println("[]");
        }
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i]);
        }

        System.out.print("");

    }

    public static void main(String[] args) {

        String str = "Some text";
        char[] charArr = str.toCharArray();

        System.out.println("Original substring       :" + str.substring(5));
        charArr = substring(charArr, 5);
        System.out.print("My substring             :");
        print(charArr);
        System.out.println();


        //HomeWork
        //
        //concat
        //equals
        //equalsIgnoreCase
        //startsWith
        //endsWith
        //substring(int startIndex) +
        //substring(int startIndex, int endIndex)

        //compareTo
        //replace
        //split
        //contains


    }
}