package sort.selectedSort;

public class SelectSortApp {
    public static void main(String[] args) {
        int maxSize = 100;
        ArraySelect arraySelect = new ArraySelect(maxSize);

        arraySelect.insert(73);
        arraySelect.insert(33);
        arraySelect.insert(745);
        arraySelect.insert(141);
        arraySelect.insert(423);
        arraySelect.insert(514);
        arraySelect.insert(644);
        arraySelect.insert(11);
        arraySelect.insert(84);
        arraySelect.insert(949);

        arraySelect.display();

        arraySelect.selectSort();

        arraySelect.display();
    }
}
