package stack;

public class StackApp {
    public static void main(String[] args) {
        StackX theStack = new StackX(10);
        theStack.push(20);
        theStack.push(55);
        theStack.push(21);
        theStack.push(87);
        theStack.push(53);
        theStack.push(80);
        theStack.push(43);

        while(!theStack.isEmpty()){
            long value = theStack.pop();
            System.out.print(value);
            System.out.print(" ");
        }
        System.out.println(" ");
    }
}
