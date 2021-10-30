import java.io.*;
import java.util.*;

public class StockSpan{

  static int[] solve(int a[]){

    Stack<Integer> st = new Stack<>();
    int res[] = new int[a.length];

    st.push(0);

    res[0] = 1;
    for(int i = 1; i <a.length;i++){

      while(st.size() > 0 && a[i] >= a[st.peek()]){

        st.pop();
      }


      if(st.size() == 0){

        res[i] = i+1;
      }
      else{

        res[i] = i - st.peek();
      }

      st.push(i);
    }
    return res;
  }
  public static void main(String[] args) {
    
    int a[] = {10,4,5,90,120,80};
    int b[] = solve(a);

    for(int i = 0; i <a.length; i++){
      System.out.println(b[i]);
    }

  }
}
