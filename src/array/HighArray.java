package array;

public class HighArray {
    private long[] array;
    private int nElems;

    public HighArray(int maxSize){
        array = new long[maxSize];
        nElems = 0;
    }

    public int size(){
        return nElems;
    }

    public boolean find(long searchKey){
        int j;
        for( j = 0; j < nElems; j++)
            if(array[j] == searchKey)
                break;
            if(j == nElems)
                return false;
            else return true;
    }


    public void insert(long value){
        array[nElems] = value;
        nElems++;
    }


    public boolean delete(long value){
        int j;
        for( j = 0; j < nElems; j++)
            if(array[j] == value)
                break;
        if(j == nElems)
            return false;
        else {
            for(int k = j; k < nElems; k++)
                array[k] = array[k+1];
            nElems--;
            return true;
        }
    }


    public void display(){
        for(int i = 0; i < nElems; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
