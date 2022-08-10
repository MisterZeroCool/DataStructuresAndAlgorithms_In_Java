package recursion.exc02;

public class FactorialApp {
    public static void main(String[] args) {
        Factorial f = new Factorial();
        System.out.println("Факториал 0 равен "+f.factorial(0));
        System.out.println("Факториал 5 равен "+f.factorial(5));
        System.out.println("Факториал 7 равен "+f.factorial(7));
        System.out.println("Факториал 10 равен "+f.factorial(24));


    }
}