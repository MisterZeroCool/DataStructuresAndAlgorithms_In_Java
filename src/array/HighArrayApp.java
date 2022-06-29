package array;

public class HighArrayApp {
    public static void main(String[] args) {
        int maxSize = 100;
        HighArray array = new HighArray(maxSize);
        array.insert(77);
        array.insert(55);
        array.insert(33);
        array.insert(22);
        array.insert(89);
        array.insert(54);
        array.insert(98);
        array.insert(65);
        array.insert(15);
        array.insert(1);
        array.insert(00);

        array.display();

        int searchKey = 65;
        if(array.find(searchKey)) System.out.println("Found " + searchKey);
        else System.out.println("Can't find " + searchKey);


        array.delete(98);
        array.delete(00);
        array.delete(1);

        array.display();
    }
}
