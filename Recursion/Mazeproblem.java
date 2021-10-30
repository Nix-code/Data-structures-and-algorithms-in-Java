import java.io.*;
import java.util.*;

public class Mazeproblem{

  public static void main(String[] args) throws Exception {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt(); // for row and col 

    ArrayList<String> paths = getpath(0,0,n-1,m-1);
    System.out.println(paths);
    
  }

  public static ArrayList<String> getpath(int sr, int sc, int dr, int dc) {
    
    
    if(sr > dr || sc > dc){
     return new ArrayList<>(); 
    }
    if(sr == dr && sc == dc){

      ArrayList<String> temp = new ArrayList<>();
      temp.add("");
      return temp;
    }

    ArrayList<String> hpath = getpath(sr, sc+1, dr, dc);
    ArrayList<String> vpath = getpath(sr+1, sc, dr, dc);
    ArrayList<String> paths = new ArrayList<>();

    for(String h: hpath){
      paths.add('h' + h);
    }

    for(String v: vpath){
      paths.add('v'+ v);
    }


    return paths;
  }
}
