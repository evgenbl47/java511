public class ClassWork {

    int[] arr;
    int size;

    {
        size = 0;
        arr = new int[size];
    }

    public void addEnd(int num) {
        int[] tmp = new int[size + 1];
        for (int i = 0; i < size; i++) {
            tmp[i] = arr[i];
        }

        tmp[size] = num;
        size++;
        arr = tmp;


        //num = 4   index = 1

        //  1 2 3
        //  1 4 2 3
    }

    public void addStart(int num) {
        int[] tmp = new int[size + 1];
        for (int i = 0; i < size; i++) {
            tmp[i + 1] = arr[i];
        }

        tmp[0] = num;
        size++;
        arr = tmp;
    }

    public void addByIndex(int index, int num) {
        if (index <= 0) {
            addStart(num);
        } else if (index >= size) {
            addEnd(num);
        } else {
            int[] tmp = new int[size + 1];
            for (int i = 0, j = 0; i < tmp.length; i++) {
                if (i == index) {
                    tmp[i] = num;
                } else {
                    tmp[i] = arr[j++];
                }
            }
//            for (int i = 0,j =0; i < size; i++,j++ ) {
//                if(j==index){
//                    tmp[j] = num;
//                    i--;
//                }else{
//                    tmp[j] = arr[i];
//                }
//            }
            size++;
            arr = tmp;
        }
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void removeByValueFirst(int num) {
        boolean isHas = false;

        for (int i = 0; i < size; i++) {
            if (arr[i] == num) {
                isHas = true;
                break;
            }
        }

        if (isHas) {
            int[] tmp = new int[size - 1];
            for (int i = 0, j = 0; i < size; i++) {
                if (isHas && arr[i] == num) {
                    isHas = false;
                    continue;
                }

                tmp[j++] = arr[i];
            }

            size--;
            arr = tmp;
        }
    }

    public  boolean isHasValue(int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return true;
            }
        }

        return false;
    }




}

//1    +   public  void addEnd(int num);
//2    +   public  void print();
//3    +   public  void addStart(int num);
//4    -   public  int getFirst();
//5    -   public  boolean isHasValue(int num);
//9    -   public  int size();
//10   -   public  void clear();
//7    -   public  void removeByIndex(int index);
//8    +   public  void removeByValueFirst(int num);


//10   -    public  void reverse();
//11   -    public  boolean isEmpty();
//12   -    public  int get(int index);
//13   -    public  int indexOf(int num);
//14   -    public  int lastIndexOf(int num);
//15   -    public  int getLast();
//16   -    public  void addByIndex(int index, int num);
//17   -    public  void removeByIndexLast(int index);
