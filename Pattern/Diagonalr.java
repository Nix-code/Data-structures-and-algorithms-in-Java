import java.io.*;

import java.util.*;

public class Diagonalr{

  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   int n =sc.nextInt();

   int k = n;
   for(int i =1; i <=n; i++){

     for(int j = n; j >=1; j--){
       

       if(i==j){
         System.out.print("*\t");
       }
       else{
         System.out.print("\t");
       }

   }
   System.out.println();
  }
}

}
