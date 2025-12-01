//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static char[] trim(char[] arr) {
        int first = 0, end = 0;
        char[] newArr = null;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != ' ') {
                break;
            }
            first++;
        }

        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i] != ' ') {
                break;
            }
            end++;
        }

        int newArrSize;
        newArrSize = arr.length - first - end;// - first - end;
        newArr = new char[newArrSize];

        for (int i = 0; i < arr.length; i++) {
            if (i < first) {
                continue;
            }

            if (i < (arr.length - first - end) + first) {
                newArr[i - first] = arr[i];

            }

        }
        return newArr;
    }

    public static void print(char[] ch) {
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i]);
        }
        System.out.print("");

    }

    public static void main(String[] args) {

        String str = "1234";
        char[] arr = str.toCharArray();

        print(arr);
        System.out.println();
        System.out.println("Original lenght: " + str.length());

        str = str.trim();
        System.out.println("Original trim :" + str + " (" + str.length() + ")");

        arr = trim(arr);
        System.out.print("My trim       :");
        print(arr);
        System.out.println(" (" + arr.length + ")");


        //HomeWork
//length
//charAT()
//toLowerCase
//toUpperCase
//trim
//leftTrim
//rightTrim
//indexOf
//lastIndexOf

        //String methods
//        String str = "   Some texT";
//        System.out.println("length: " + str.length());
//        System.out.println("charAT: " + str.charAt(str.length() - 1));
//        System.out.println("toLowerCase: " + str.toUpperCase());
//        System.out.println("toUpperCase: " + str.toLowerCase());
//        System.out.println("trim: " + str.trim());
//        System.out.println("indexOf: " + str.indexOf("xT"));
//        toCharArray();

    }
}