package sort.objectSort;

public class ObjectSortApp {
    public static void main(String[] args) {
        int maxSize = 100;
        ArrayInOb arrayInOb = new ArrayInOb(maxSize);

        arrayInOb.insert("Vagsta", "Jax", 44);
        arrayInOb.insert("Fox", "Dax", 34);
        arrayInOb.insert("Tilda", "Kelly", 33);
        arrayInOb.insert("Astra", "Max", 22);
        arrayInOb.insert("Sasta", "Hax", 64);
        arrayInOb.insert("Dofer","Rex", 31);
        arrayInOb.insert("Basta", "Fax", 20);

        System.out.println("Before sorting: ");
        arrayInOb.display();
        arrayInOb.insertionSort();

        System.out.println("After sorting: ");
        arrayInOb.display();
    }
}
