package Lab4;

public class Fibonacci {
    public static void main(String[] args) {
            int n = 9;
            int result = fib(n);
        System.out.println(result);
    }
    public static int fib(int n){
      if(n <= 1)
          return n;
      return fib(n-1) + fib(n-2);
    }

}
