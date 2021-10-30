import java.io.*;
import java.util.*;

public class Stairs_path{

  static int stairs(int n, int qb[]){
    if(n==0){
      return 1;
    }
    if(n <0){
      return 0;
    }

    if(qb[n]!=0){
      return qb[n];
    }

    int f1 = stairs(n-1, qb);
    int f2 = stairs(n-2, qb);
    int f3 = stairs(n-3, qb);

    int f = f1+f2+f3;
    
    qb[n] = f;
    return f;
  }
  public static void main(String[] args) {
   int n = 8;
   int qb[] = new int[n+1];
   System.out.println(stairs(n, qb));
  }
}
