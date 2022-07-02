package array;

public class ClassDataApp {
    public static void main(String[] args) {
        int maxSize = 100;
        ClassDataArray array = new ClassDataArray(maxSize);

        array.insert("Gangsta", "Jax", 44);
        array.insert("Fox", "Jax", 34);
        array.insert("Tilda", "Jax", 33);
        array.insert("Astra", "Jax", 22);
        array.insert("Sassta", "Jax", 64);
        array.insert("Gmmg","Jax", 31);
        array.insert("Basta", "Jax", 20);

        array.display();

        String searchKey = "Tilda";
        Person found = array.find(searchKey);
        if(found != null){
            System.out.print("Found ");
            found.displayPerson();
        }
        else System.out.println("Can't find " + searchKey);

        System.out.println("Deleting Basta, Astra");
        array.delete("Astra");
        array.delete("Basta");

        array.display();
    }
}
