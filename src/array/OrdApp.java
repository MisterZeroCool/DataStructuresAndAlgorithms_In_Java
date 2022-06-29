package array;
//Сортируем массив и определяем место вставки элемента
public class OrdApp {
    public static void main(String[] args) {
        int maxSize = 100;
        OrdArray array = new OrdArray(maxSize);
        array.insert(177);
        array.insert(255);
        array.insert(3);
        array.insert(21);
        array.insert(85);
        array.insert(54);
        array.insert(78);
        array.insert(45);
        array.insert(15);
        array.insert(1);
        array.insert(0);

        int searchKey = 55;
        if(array.find(searchKey) != array.size()) System.out.println("Found " + searchKey);
        else System.out.println("Can't find " + searchKey);

        array.display();

        array.delete(0);
        array.delete(1);
        array.delete(45);

        array.display();

    }
}
