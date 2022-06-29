package array;

public class ArrayDeleteElemApp {
    public static void main(String[] args) {
        long[] arr = new long[100];
        int nElems = 0;
        int j;
        long searchKey;
        arr[0] = 77;
        arr[1] = 99;
        arr[2] = 4;
        arr[3] = 31;
        arr[4] = 16;
        arr[5] = 83;
        arr[6] = 100;
        arr[7] = 27;
        nElems = 8;

        //delete
        searchKey = 16;
        for(j = 0; j < nElems; j++) {
            if(arr[j]  == searchKey)
                break;
            for(int k = j; k < nElems; k++)   //сдвиг последующих элементов
                arr[k] = arr[k+1];
            nElems--;
        }

//        for(long e : arr)
//            System.out.print(e + " ");
//        System.out.println();

        for(int i = 0; i < nElems; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
