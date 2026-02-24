public class Recursion {
    public static int fact(int n){
        if(n == 0) return 1;
        return n * fact(n-1);
    }
    public static int printSum(int n){
        if(n == 1) return 1;
        return n + printSum(n-1);
    }
    public static int fib(int n){
        if(n <= 1) return n;
        return fib(n-1) + fib(n-2);
    }
    public static void main(String[] args){
        int n = 5;
        System.out.println(fact(n));
        System.out.println(printSum(n));
        System.out.println(fib(6));
    }
}
