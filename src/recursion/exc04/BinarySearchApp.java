package recursion.exc04;

public class BinarySearchApp {
    public static void main(String[] args) {
        int mazSize = 100;
        OrdArray arr = new OrdArray(mazSize);

        arr.insert(56);
        arr.insert(36);
        arr.insert(11);
        arr.insert(83);
        arr.insert(58);
        arr.insert(16);
        arr.insert(23);
        arr.insert(26);
        arr.insert(190);
        arr.insert(32);
        arr.insert(99);
        arr.insert(8);
        arr.insert(5);
        arr.insert(44);
        arr.insert(110);
        arr.insert(1);

        arr.display();

        int searchKey = 36;
        if(arr.find(searchKey)!=arr.size()) System.out.println("Found "+searchKey);
        else System.out.println("Can't find "+searchKey);
    }
}
