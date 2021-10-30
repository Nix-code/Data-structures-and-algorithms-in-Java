import java.util.*;
import java.io.*;
public class GetPath{

  public static void main(String[] args) {
    
       
    int n = 3;

    ArrayList<String> paths = gets(n);
    System.out.println(paths);
    
  }

  public static ArrayList<String> gets(int n){

    if(n <= 0){
      ArrayList<String> bres = new ArrayList<>();
      
      if(n==0){
        bres.add("");
      }
      return bres;
    }
    ArrayList<String> p1 = gets(n-1);
    ArrayList<String> p2 = gets(n-2);
    ArrayList<String> p3 = gets(n-3);
    ArrayList<String> mres = new ArrayList<>();
    for(String s1:p1){
      mres.add(1+s1); 
    }

    for(String s2:p2){
      mres.add(2+s2);
    }
    for(String s3:p3){
      mres.add(3+s3);
    }
    return mres;


  }
}
