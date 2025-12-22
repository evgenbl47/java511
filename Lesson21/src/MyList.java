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
        tmp[size] = num;
        size++;
        arr = tmp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");;
        }
        System.out.println();
    }

    public void removeByValueFirst(int num) {
        boolean isHas = true;

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

    public void addStart(int num) {
        int[] tmp = new int[size + 1];
        for (int i = size; i > 0; i--) {
//            System.out.printf("size = %d, i = %d\n", size, i);
//            System.out.printf("arr[%d] = %d\n", i, arr[i- 1]);
//            System.out.printf("tmp[%d], arr[%d]\n", tmp[i], arr[i - 1]);
            tmp[i] = arr[i - 1];
        }
        tmp[0] = num;
        arr = tmp;
        size++;
    }
}














