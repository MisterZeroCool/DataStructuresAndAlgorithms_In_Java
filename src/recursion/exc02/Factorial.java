package recursion.exc02;

public class Factorial {
    public long factorial(long n){
        if(n==0)
            return 1;
        else
            return (n*factorial(n-1));
    }
}
