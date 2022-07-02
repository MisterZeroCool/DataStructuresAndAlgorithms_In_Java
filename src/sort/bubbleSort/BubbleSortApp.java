package sort.bubbleSort;

public class BubbleSortApp {
    public static void main(String[] args) {
        int maxSize = 100;
        ArrayBub arrayBub = new ArrayBub(maxSize);

        arrayBub.insert(77);
        arrayBub.insert(43);
        arrayBub.insert(7);
        arrayBub.insert(11);
        arrayBub.insert(23);
        arrayBub.insert(55);
        arrayBub.insert(64);
        arrayBub.insert(1);
        arrayBub.insert(87);
        arrayBub.insert(2);
        arrayBub.insert(99);

        arrayBub.display();

        arrayBub.bubbleSort();
        arrayBub.display();
    }
}
