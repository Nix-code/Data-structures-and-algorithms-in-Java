import java.io.*;
import java.util.*;

public class MergeOverlappingInterval{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[][] = new int[n][2];

    for(int i =0; i <n; i++){
      for(int j = 0; j <2; j++){
        a[i][j] = sc.nextInt();
      }
    }
    mergeme(a);
  }

  static void mergeme(int a[][]){

    Pair pairs[] = new Pair[a.length];
    for(int i = 0; i <a.length; i++){
      pairs[i] = new Pair(a[i][0],a[i][1]);
    }
    Arrays.sort(pairs);
    Stack<Pair> st = new Stack<>();
    for(int i = 0; i <pairs.length; i++){
      if(i==0){
        st.push(pairs[i]);
      }
      else{
        Pair top = st.peek();
        if(pairs[i].st > top.et){
          st.push(pairs[i]);
        }
        else{
          top.et = Math.max(top.et, pairs[i].et);
        }
      }
    }
    Stack<Pair> rs = new Stack<>();
    while(st.size() >0){
      rs.push(st.pop());
    }
    while(rs.size() >0){
      Pair p = rs.pop();
      System.out.println(p.st+" "+p.et);
    }
  }

  static class Pair implements Comparable<Pair>{
    int st; // start time 
    int et; // end time 
    
    Pair(int st, int et){
      this.st = st;
      this.et = et;
    }
    public int compareTo(Pair other){
      if(this.st != other.st)
        return this.st - other.st;
    
    else{
      return this.et - other.et;
    }
  }
}
}
