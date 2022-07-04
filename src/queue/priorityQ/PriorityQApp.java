package queue.priorityQ;

public class PriorityQApp {
    public static void main(String[] args) {
        PriorityQ priorityQ = new PriorityQ(5);
        priorityQ.insert(30);
        priorityQ.insert(60);
        priorityQ.insert(50);
        priorityQ.insert(20);
        priorityQ.insert(40);

        while(! priorityQ.isEmpty()){
            long n = priorityQ.remove();
            System.out.print(n + " ");
        }
        System.out.println(" ");
    }
}
