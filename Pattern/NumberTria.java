import java.io.*;

import java.util.*;

public class NumberTria{
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();

   int p = 0;
   for(int i = 1; i <=n; i++){

     for(int j = 1; j <=i; j++){

       p = p+1;
       System.out.print(p+" ");
     }
     System.out.println();
   }
  }
}
