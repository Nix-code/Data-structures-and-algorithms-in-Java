import java.io.*;

import java.util.*;

public class Fibseq{

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int l = 0;
    int r = 1;
    for(int i = 0; i <n; i++){
 
      for(int j = 0; j <=i; j++){


        System.out.print(l+" ");
        int ans = l+r;
        l = r;
        r = ans;
        
      }
      System.out.println();
    }
  }
}
