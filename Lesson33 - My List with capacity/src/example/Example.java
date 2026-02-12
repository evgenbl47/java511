package example;

public class Example {

    //    int[] arr = {-5, 0, 1, 1, 2, 3, 6, 8, 22, 45, 678};
    int[] arr = {-5, 22};
    int[] arr2 = {-10, 998, 1100};
//    int[] arr2 = {-10, 2, 3, 6, 7, 7, 7, 9, 11, 1000, 1010, 1100};


    public void start() {

        int[] arr3 = mergeArrays(arr, arr2);

        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
        //retuslt =>
        // arr3 = { -10,-5,0,1,1,2,2,3,3,6,6,7,7,7,8,9,11,22,45,678,1000,1010,1100}
    }

    public void start2() {

//        String str = "101112";
//        int num = 1000;
//        System.out.println(str.length());

//
//        int[] arr = {1111111,22222222,333333};
//        System.out.println(arr.length);

        String str = "111111122222222333333";
        System.out.println(str.length());

        MyLIst list = new MyLIst();
        for (int i = 1000; i < 1003; i++) {
            list.addEnd(i);

            System.out.println(list.capacity() + "/" + list.size());
        }


        list.print();


//        String str = "";
//        StringBuilder stringBuilder = new StringBuilder();
//        for (int i = 0; i < 100; i++) {
//            str += i;
//            //0
//            //01
//            //012
//            //0123
//            //01234
//            //012345
//            //0123456
//            //01234567
//            //012345678
//            //0123456789
//            //012345678910
//            //01234567891011
//            //0123456789101112
//
//
//            stringBuilder.append(i);
//
//            System.out.println(stringBuilder.capacity() + "/" + stringBuilder.length());
//            //10/20
//            //0123456789
//
//        }
//        System.out.println(stringBuilder);
//        System.out.println(str);


//        MyList myList = new MyList();
//        myList.addEnd(1);
//        myList.addEnd(2);
//        myList.addEnd(3);
//        myList.addEnd(4);
//        myList.addEnd(5);
//        myList.addEnd(6);
//        myList.addEnd(7);
//        myList.addEnd(4);
//        myList.print();
//        myList.removeByValueLast(4);
//        myList.print();
    }

    //Sortirovku
    //v 3 massiv a potom sortirovat
    // one + two =>
    //todo method not working
    public int[] mergeArrays(int[] one, int[] two) {
        int[] result = new int[one.length + two.length];
        boolean add = false;
        int first = 0;
        int second = 0;

        boolean fstop = false;
        boolean sstop = false;

//        first = one[first];
//        second = two[second];
//        int[] arr = {-5, 22};
//        int[] arr2 = {-10, 998, 1100};
        // arr3 = { -10,-5,0,1,1,2,2,3,3,6,6,7,7,7,8,9,11,22,45,678,1000,1010,1100}
        for (int i = 0; i < result.length; i++) {

            fstop = first + 1 > one.length;
            sstop = second + 1> two.length;
            add = one[first] < two[second];  //todo исправь ошибку решение будет на гитхабе
            System.out.println(one[first] + " < " + two[second]);

            if ((add && !fstop) || fstop) {
                result[i] = one[first];
                fstop = (first++) == one.length;
            }

            if ((!add && !sstop) || sstop) {
                result[i] = two[second];
                second ++;
            }
        }

        return result;
    }

}
