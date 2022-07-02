package sort.insertSort;

public class InsertSortApp {
    public static void main(String[] args) {
        int maxSize = 100;
        ArrayIns arrayIns = new ArrayIns(maxSize);

        arrayIns.insert(34);
        arrayIns.insert(23);
        arrayIns.insert(75);
        arrayIns.insert(11);
        arrayIns.insert(123);
        arrayIns.insert(614);
        arrayIns.insert(244);
        arrayIns.insert(61);
        arrayIns.insert(874);
        arrayIns.insert(949);

        arrayIns.display();

        arrayIns.insertSort();

        arrayIns.display();
    }
}
