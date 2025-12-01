//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static char[] trim(char[] ch) {

        return null;
    }

    public static void print(char[] ch) {
        System.out.println("=======");
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i]);
        }
        System.out.println("\n=======");
    }

    public static void main(String[] args) {

//        char[] arr = {'X', 'i', 'a', 'o', 'm', 'i'};
        String str = "  Redme 13 pro plus   ";
        char[] arr = str.toCharArray();

        print(arr);
        trim(arr);

        str = str.trim();
        System.out.println("Original trim :" + str + " (" + str.length() + ")");
        arr = trim(arr);
        System.out.println("My trim       :" + str + " (" + str.length() + ")");


//        String str = "  Redme 13 pro plus   ";
//        System.out.println("Original :" + str + " (" + str.length() + ")");
//        str = str.trim();
//        System.out.println("Trim     :" + str + " (" + str.length() + ")");


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