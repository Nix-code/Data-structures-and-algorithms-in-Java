import java.io.*;
import java.util.*;

class StackScratch{

  static int top = -1;

  static int max = 1000;
  static int a[] = new int[max];
  int push(int x){
    if(top >=max){
      return -1;
    }
    else{
      top++;
      a[top] = x;
    }
    return a[top];

  }

  int pop(){
    if(top <= -1){
      return -1;
    }

    else{
      top--;

    }
    return a[top+1];
  }

    
  int peek(){
    return pop();
  }

  int size(){
    return top+1;
  }
  public static void main(String[] args) {
    StackScratch st = new StackScratch();
    st.push(12);
    st.push(10);
    st.push(4);


    
    
  }
}
