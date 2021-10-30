import java.io.*;
import java.util.*;

public class SlidingWindowMax{

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int n =sc.nextInt();

    int k = 4;
    int a[] = new int[n];
    for(int i = 0; i <n; i++){

      a[i] = sc.nextInt();
    }


    Stack<Integer> st = new Stack<>();

    st.push(a.length-1);
    int nge[] = new int[n];
    nge[n-1] = a.length;

    for(int i = a.length-2; i >=0; i--){

      while(st.size() > 0 && a[i] >= a[st.peek()]){
        st.pop();
      }

      if(st.size() == 0){
        nge[i] =a.length;
      }
      else{
        nge[i] = st.peek();
      }
      st.push(i);
    }

    int j = 0;

    for(int i = 0; i <=a.length-k; i++){

      if(j < i){
        j = i;
      }

      while(nge[j] < i+k){
        j = nge[j];
      }

    System.out.println(a[j]);
    }

  }
}
