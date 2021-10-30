import java.io.*;
import java.util.*;

public class Subset{

  static void print(int a[], int ind, String src, int ssf, int target){

    if(ind == a.length){
      if(ssf==target){
        System.out.println(src);
      } 

        return;
    }
    print(a,ind+1, src+a[ind]+" ",ssf+a[ind], target);
    print(a, ind+1, src, ssf, target);

  }
  public static void main(String[] args) {
    int a[] = {10,20,30,40,50};
    int target = 70;
    
    print(a,0,"",0,target);
    
  }
}
