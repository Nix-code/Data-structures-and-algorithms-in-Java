import java.io.*;
import java.util.*;

public class Fibonacci_series{
  static int Fib(int n){

    if( n == 0 || n == 1 ){
      return n;
    }
    int f1 = Fib(n-1);
    int f2 = Fib(n-2);
    int f = f1+f2;
    return f;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int fib = Fib(n);
    System.out.println(fib);
  }
}
