public class MyList {

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
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");;
            System.out.println();
        }
    }

    //todo correct this method. Remove firs find element
    public void removeByValueFirst(int num) {
        int[] tmp = new int[size - 1];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = arr[i + 1];
        }
        arr = tmp;
        size--;
    }
}
