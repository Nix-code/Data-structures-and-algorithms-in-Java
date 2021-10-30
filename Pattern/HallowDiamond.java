import java.io.*;
import java.util.*;

public class HallowDiamond{

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    int div = n/2+1;
    int space = 1;
    for(int i = 1; i <=n; i++){
      for(int k = 1; k <=div; k++){
       System.out.print("*\t"); 
      }

      for(int j = 1; j <=space; j++){

        System.out.print("\t");

      }

      for(int x = 1; x <=div; x++){
        System.out.print("*\t");
      }



      if(i <=n/2){
        space+=2;
        div --;
      }
      else{
        space-=2;
        div++;
      }
      System.out.println();
    }
  }
}
