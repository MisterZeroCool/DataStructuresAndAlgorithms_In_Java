package sort.objectSort;

import array.Person;

public class ArrayInOb {
    private Person[] arrayPerson;
    private int nElems;

    public ArrayInOb(int maxSize){
        arrayPerson = new Person[maxSize];
        nElems = 0;
    }

    public void insert(String last, String first, int age){
        arrayPerson[nElems] = new Person(last,first,age);
        nElems++;
    }

    public void insertionSort() {
        int in, out;
        for(out=1; out<nElems; out++){
            Person temp = arrayPerson[out];
            in=out;
            while(in>0 && arrayPerson[in-1].getLastName().compareTo(temp.getLastName())>0) {
                arrayPerson[in] = arrayPerson[in-1];
                --in;
            }
            arrayPerson[in] = temp; // Вставить помеченный элемент
        }
    }

    public void display(){
        for(int j = 0; j < nElems; j++) {
            arrayPerson[j].displayPerson();
        }
    }
}
