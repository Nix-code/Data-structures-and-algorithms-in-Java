import java.io.*;
import java.util.*;

public class BalancedParanthesis{

  static boolean isbal(String str){

    Stack<Character> st = new Stack<>();

    for(int i = 0; i <str.length(); i++){
      char ch = str.charAt(i);

      if(ch == '(' || ch == '{' || ch == '['){
        st.push(ch);
        continue;
      }

      char c;

      switch (ch) {
        case ')':
          c = st.pop(); 
          if(c == '{' || c == '[')
            return false;
          break;
        case '}':
          c = st.pop(); 
          if(c == '(' || c == '[')
            return false;
          break;
        case ']':
         c = st.pop(); 
          if(c == '(' || c == '[')
            return false;
          break;



        default:
          break;
      }
    }
    return (st.isEmpty());
  }
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    String st = sc.next();

    if(isbal(st)){
      System.out.println("Balanced");
    }
    else{
      System.out.println("Not balanced");
    }
  }
}
