import java.io.*;
import java.util.*;

public class Digit_diamond{
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    int space = n/2;
    int star = 1;
    int o = 1;
    for(int i = 1; i <=n; i++){

      int val = o;


      for(int k = 1; k <=space; k++){
        System.out.print("\t");
      }

      for(int j = 1; j <=star; j++){

        System.out.print(val+"\t");

        if(j <=star/2){
          val++;
        }
        else{
          val--;
        }
        }

      if(i <=n/2){
        o++;
        space--;
        star+=2;
      }
      else{
        o--;
        space++;
        star-=2;
      }
      System.out.println();
    }
    
  }
}
