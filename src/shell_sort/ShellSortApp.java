package shell_sort;

public class ShellSortApp {
    public static void main(String[] args) {
        int maxSize = 10;
        ArraySh arraySh = new ArraySh(maxSize);

        for(int j = 0; j < maxSize; j++) {
            long n = (int)(java.lang.Math.random()*99);
            arraySh.insert(n);
        }
        arraySh.display();
        arraySh.shellSort();
        arraySh.display();
    }
}
