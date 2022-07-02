package sort.insertSort;

public class ArrayIns {
    private long[] array;
    private int nElems;

    public ArrayIns(int maxSize){
        array = new long[maxSize];
        nElems = 0;
    }

    public void insert(long value){
        array[nElems] = value;
        nElems++;
    }

    public void display(){
        for(int j = 0; j < nElems; j++)
            System.out.print("("+array[j] +")"+ " ");
        System.out.println(" ");
    }

    public void insertSort(){
        int out, in;
        for(out = 1; out < nElems ; out++) {
            long temp = array[out];
            in = out;
            while(in > 0 && array[in-1] >= temp){
                array[in] = array[in-1];
                --in;
            }
            array[in] = temp;
        }
    }

    private void swap(int one, int two){
        long temp = array[one];
        array[one] = array[two];
        array[two] = temp;
    }
}
