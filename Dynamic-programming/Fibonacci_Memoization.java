import java.io.*;
import java.util.*;

public class Fibonacci_Memoization{

  static int fib(int n, int q[]){
    if(n==0 || n==1){
      return n;
    }
    if(q[n]!=0){
      return q[n];
    }
    System.out.println("Hello "+n);

    int f1 = fib(n-1, q);
    int f2 = fib(n-2, q);
    int f = f1+f2;

    q[n] = f;
    return f;
  }
  public static void main(String[] args) {
    
    int n = 10;
    int q[] = new int[n+1];

    System.out.println(fib(n, q));

  }
}
