package sort.selectedSort;

public class ArraySelect {
    private long[] array;
    private int nElems;

    public ArraySelect(int maxSize){
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

    public void selectSort(){
        int out, in, min;
        for(out = 0; out < nElems-1 ; out++) {
            min = out;
            for(in  = out+1; in < nElems; in++)
                if(array[in] < array[min])
                    min = in;
            swap(out, min);
        }
    }

    private void swap(int one, int two){
        long temp = array[one];
        array[one] = array[two];
        array[two] = temp;
    }
}
