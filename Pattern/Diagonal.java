import java.io.*;
import java.util.*;

public class Diagonal{

  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);

   int n = sc.nextInt();

   for(int i =1; i <=n; i++){

     for(int j = 1; j <=n; j++){
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
