//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static boolean startsWith(char[] arr, char[] arr2) {
        for (int i = 0; i < arr2.length; i++) {
            if (arr[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean endsWith(char[] arr, char[] arr2) {
        for (int i = arr.length-1, j = arr2.length - 1; j >= 0; i--, j--) {
            if (arr[i] != arr2[j]) {
                return false;
            }
        }
        return true;
    }

    public static char[] concat(char[] arr, char[] arr2) {
        int arrSize = arr.length + arr2.length;
        char[] newArr = new char[arrSize];


        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }

        for (int i = arr.length; i < arr2.length + arr.length; i++) {
            newArr[i] = arr2[i - arr.length];

        }

        return newArr;
    }

    public static boolean equalsIgnoreCase(char[] arr, char[] arr2) {
        if (arr.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            char c1 = arr[i];
            char c2 = arr2[i];

            if (c1 >= 65 && c1 <= 90) {
                c1 += 32;
            }

            if (c2 >= 65 && c2 <= 90) {
                c2 += 32;
            }

            if (c1 != c2) {
                return false;
            }
        }

        return true;
    }

    public static boolean equals(char[] arr, char[] arr2) {
        if (arr.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            char c1 = arr[i];
            char c2 = arr2[i];

            if (c1 != c2) {
                return false;
            }
        }

        return true;
    }

    public static char[] substring(char[] arr, int start) {
        int newSize = arr.length - start;
        char[] newArr = new char[newSize];

        for (int i = start, j = 0; i < arr.length; i++, j++) {
            newArr[j] = arr[i];
        }

        return newArr;
    }

    public static char[] substring(char[] arr, int start, int end) {
        int counter = 0;

        for (int i = end; i < arr.length; i++) {
            counter++;
        }

        int newSize = arr.length - start - counter;
        char[] newArr = new char[newSize];

        for (int i = start, j = 0; i < end; i++, j++) {
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
        String str2 = "Some text";
        char[] charArr = str.toCharArray();
        char[] charArr2 = str2.toCharArray();



        System.out.println("Original substring              :" + str.substring(5));
        System.out.print("My substring                    :");
        print(substring(charArr, 5));;
        System.out.println();

        System.out.println("Original substring 2param       :" + str.substring(5, 7));
        System.out.print("My substring 2param             :");
        print(substring(charArr, 5, 7));;
        System.out.println();

        System.out.println("Original equalsIgnoreCase       :" + str.equalsIgnoreCase(str2));
        System.out.println("My equalsIgnoreCase             :" + equalsIgnoreCase(charArr, charArr2));

        System.out.println("Original equals                 :" + str.equals(str2));
        System.out.println("My equals                       :" + equals(charArr, charArr2));

        System.out.println("Original concat                 :" + str.concat(str2));
        System.out.print("My concat                       :");
        print(concat(charArr, charArr2));
        System.out.println();

        System.out.println("Original startsWith             :" + str.startsWith("So"));
        System.out.println("My startsWith                   :" + startsWith(charArr, "So".toCharArray()));

        System.out.println("Original endsWith               :" + str.endsWith("ext"));
        System.out.print("My endsWith                     :" + endsWith(charArr, "ext".toCharArray()));


        //HomeWork

        //concat
        //equals
        //equalsIgnoreCase
        //startsWith
        //endsWith
        //substring(int startIndex)
        //substring(int startIndex, int endIndex)

//String methods

//charAt()	Returns the character at the specified index (position)	char
//codePointAt()	Returns the Unicode of the character at the specified index	int
//codePointBefore()	Returns the Unicode of the character before the specified index	int
//codePointCount()	Returns the number of Unicode values found in a string.	int
//compareTo()	Compares two strings lexicographically	int
//compareToIgnoreCase()	Compares two strings lexicographically, ignoring case differences	int
//concat()	Appends a string to the end of another string	String
//contains()	Checks whether a string contains a sequence of characters	boolean
//contentEquals()	Checks whether a string contains the exact same sequence of characters of the specified CharSequence or StringBuffer	boolean
//copyValueOf()	Returns a String that represents the characters of the character array	String
//endsWith()	Checks whether a string ends with the specified character(s)	boolean
//equals()	Compares two strings. Returns true if the strings are equal, and false if not	boolean
//equalsIgnoreCase()	Compares two strings, ignoring case considerations	boolean
//format()	Returns a formatted string using the specified locale, format string, and arguments	String
//getBytes()	Converts a string into an array of bytes	byte[]
//getChars()	Copies characters from a string to an array of chars	void
//hashCode()	Returns the hash code of a string	int
//indexOf()	Returns the position of the first found occurrence of specified characters in a string	int
//intern()	Returns the canonical representation for the string object	String
//isEmpty()	Checks whether a string is empty or not	boolean
//join()	Joins one or more strings with a specified separator	String
//lastIndexOf()	Returns the position of the last found occurrence of specified characters in a string	int
//length()	Returns the length of a specified string	int
//matches()	Searches a string for a match against a regular expression, and returns the matches	boolean
//offsetByCodePoints()	Returns the index within this String that is offset from the given index by codePointOffset code points	int
//regionMatches()	Tests if two string regions are equal	boolean
//replace()	Searches a string for a specified value, and returns a new string where the specified values are replaced	String
//replaceAll()	Replaces each substring of this string that matches the given regular expression with the given replacement	String
//replaceFirst()	Replaces the first occurrence of a substring that matches the given regular expression with the given replacement	String
//split()	Splits a string into an array of substrings	String[]
//startsWith()	Checks whether a string starts with specified characters	boolean
//subSequence()	Returns a new character sequence that is a subsequence of this sequence	CharSequence
//substring()	Returns a new string which is the substring of a specified string	String
//toCharArray()	Converts this string to a new character array	char[]
//toLowerCase()	Converts a string to lower case letters	String
//toString()	Returns the value of a String object	String
//toUpperCase()	Converts a string to upper case letters	String
//trim()	Removes whitespace from both ends of a string	String
//valueOf()	Returns the string representation of the specified value	String

    }
}