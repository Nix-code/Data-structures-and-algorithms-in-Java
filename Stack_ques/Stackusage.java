import java.io.*;
import java.util.*;

public class Stackusage{

  public static void main(String[] args) {
    Stack<Integer> st = new Stack<>();

    st.push(45);
    st.push(100);
    System.out.println(st.peek()+" ");
    st.pop();
    System.out.println(st.pop());
    st.push(123);
    st.push(103);
    st.push(145);
    st.pop();
    System.out.println(st);
    System.out.println("peek "+st.peek());
    System.out.println("size "+st.size());
  }
}
