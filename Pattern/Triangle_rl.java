import java.io.*;
import java.util.*;

public class Triangle_rl{

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for(int i =1; i <=n; i++){

      for(int k = 1; k <= n-i; k++){
        System.out.print("\t");
      }
      for(int j = 1; j <=i; j++){
        System.out.print("*\t");
      }
      System.out.println();
    }
  }
}

