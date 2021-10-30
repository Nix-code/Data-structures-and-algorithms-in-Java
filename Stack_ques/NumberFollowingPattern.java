import java.io.*;
import java.util.*;

public class NumberFollowingPattern{

  public static void main(String[] args) {
   
    Stack<Integer> st  = new Stack<>();

    int k =1;
    Scanner sc  = new Scanner(System.in);

    String s = sc.next();

    for(int i = 0; i <s.length(); i++){
      char ch = s.charAt(i);

      if(ch == 'd'){
        st.push(k);
        k++;
      }
      else{
        st.push(k);
        k++;

        while(st.size() > 0){
          System.out.println(st.pop());
        }
      }
      
    }
    while(st.size()>0){
      System.out.println(st.pop());
    }
  }
}
