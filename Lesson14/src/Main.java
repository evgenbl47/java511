
public class Main {
    //32 const (difference between A-a and a-A), look ASC|| TABLE

    public static char[] toLowerCase(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 65 && arr[i] <= 90) {
                arr[i] += 32;
            } else continue;
        }
        return arr;
    }

    public static char[] toUpperCase(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 97 && arr[i] <= 122) {
                arr[i] -= 32;
            } else continue;
        }
        return arr;
    }

    public static char charAT(char[] arr, int index) {
        char result = '#';
        for (int i = 0; i < arr.length; i++) {
            if (i == index) {
                result = arr[i];
            }
        }

        return result;
    }

    public static int length(char[] arr) {
        int length = arr.length;
        return length;
    }

    public static int indexOf(char[] arr, char symb) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == symb) {
                index = i;
                return index;
            }
        }
        return index;
    }

    public static int lastIndexOf(char[] arr, char symb) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == symb) {
                index = i;
            }
        }
        return index;
    }

    public static char[] ltrim(char[] arr) {
        int leftCount = 0;
        char[] newArr = null;

        if (arr.length == 0) {
            return arr;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != ' ' ) {
                if (i == 0) {
                    return  arr;
                }
                break;
            }
            leftCount++;
        }

        int newArrSize;
        newArrSize = arr.length - leftCount;// - first - end;
        newArr = new char[newArrSize];

        for (int i = leftCount, k = 0; i < arr.length; i++, k++) { //start = first | length = end
            newArr[k] = arr[i];
        }

        return newArr;
    }

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

        for (int i = 0; i < arr.length; i++) { //start = first | length = end
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
        if (ch.length == 0) {
            System.out.println("[]");
        }
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i]);
        }

        System.out.print("");

    }

    public static void main(String[] args) {

        String str = " ArASDdfA ";
        char[] arr = str.toCharArray();

        System.out.print("Original message       :");
        print(arr);
        System.out.println();

        System.out.println("Original lenght        :" + str.length());

        str = str.trim();
        System.out.println("Original trim          :" + str + " (" + str.length() + ")");

        arr = trim(arr);
        System.out.print("My trim                :");
        print(arr);
        System.out.println(" (" + arr.length + ")");

        str = " ArASDdfA   ";
        arr = str.toCharArray();
        arr = ltrim(arr);
        System.out.print("My ltrim               :");
        print(arr);
        System.out.println(" (" + arr.length + ")");

        //arr = rtrim(arr);
        System.out.print("My trim                :");
        print(arr);
        System.out.println(" (" + arr.length + ")");

        str = str.toLowerCase();
        System.out.println("Original toLowerCase   :" + str);

        arr = toLowerCase(arr);
        System.out.print("My toLowerCase         :");
        print(arr);
        System.out.println();

        str = str.toUpperCase();
        System.out.println("Original toUpperCase   :" + str);

        arr = toUpperCase(arr);
        System.out.print("My toUpperCase         :");
        print(arr);
        System.out.println();

        System.out.println("Original length        :" + str.length());
        System.out.println("My length              :" + length(arr));


        try {
            System.out.println("Original charAT        :" + str.charAt(33));
        } catch (Exception e) {
            System.out.println("Original charAT        :" + '*');
        }
        System.out.println("My charAT              :" + charAT(arr, 33));


        System.out.println("Original indexOf       :" + str.indexOf('L'));
        System.out.println("My indexOf             :" + indexOf(arr, 'L'));


        System.out.println("Original lastIndexOf   :" + str.lastIndexOf('A'));
        System.out.println("My lastIndexOf         :" + lastIndexOf(arr, 'A'));


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

//      A - a, a - A :  32 dif

    }
}