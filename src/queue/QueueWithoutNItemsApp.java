package queue;

public class QueueWithoutNItemsApp {
    public static void main(String[] args) {
        Queue queue = new Queue(7);
        queue.insert(100);
        queue.insert(200);
        queue.insert(300);
        queue.insert(400);

        queue.remove();
        queue.remove();
        queue.remove();

        queue.insert(500);
        queue.insert(600);
        queue.insert(700);
        queue.insert(800);

        while(! queue.isEmpty()){
            long n = queue.remove();
            System.out.print(n);
            System.out.print(" ");
        }
        System.out.println(" ");
    }
}
