package array;

public class ClassDataArray {
    private Person[] arrayPerson;
    private int nElems;

    public ClassDataArray(int maxSize){
        arrayPerson = new Person[maxSize];
        nElems = 0;
    }

    public Person find(String searchName){
        int j;
        for(j = 0; j < nElems; j++)
            if(arrayPerson[j].getLastName().equals(searchName))
                break;
            if(j == nElems)
                return null;
            else
                return arrayPerson[j];
    }

    public void insert(String last, String first, int age){
        arrayPerson[nElems] = new Person(last,first,age);
        nElems++;
    }

    public boolean delete(String searchName){
        int j;
        for(j = 0; j < nElems; j++)
            if(arrayPerson[j].getLastName().equals(searchName))
                break;
            if(j == nElems)
                return false;
            else{
                for(int k = j; k < nElems; k++)
                    arrayPerson[k] = arrayPerson[k+1];
                nElems--;
                return true;
            }
    }

    public void display(){
        for(int j = 0; j < nElems; j++) {
            arrayPerson[j].displayPerson();
        }
    }
}
