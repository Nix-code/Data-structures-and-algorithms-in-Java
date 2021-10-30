import java.io.*;
import java.util.*;

public class AreaHistogram{

  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in); 
   int n = sc.nextInt();

   int a[] = new int[n];
   int rb[] = new int[n];
   int lb[] = new int[n];
   for(int i = 0; i <n; i++){
     a[i] = sc.nextInt();
   }
    // for right most next smallest element 

   Stack<Integer> st = new Stack<>();
   
   st.push(a.length-1);
   rb[a.length-1] = a.length;

   for(int i = a.length-2; i >=0; i--){
     while(st.size() > 0 && a[i] <= a[st.peek()]){
       st.pop();
     }
     if(st.size() == 0){
       rb[i] = a.length;
     }
     else{
       rb[i] = st.peek();
     }
     st.push(i);
   }


   st = new Stack<>();
   st.push(0);
   lb[0] = -1;

   for(int i = 1; i <a.length; i++){
     while(st.size() > 0 && a[i]  <= a[st.peek()]){
       st.pop();
     }
     if(st.size() == 0){
       lb[i] = -1;
     }
     else{
       lb[i] = st.peek();
     }
     st.push(i);
   }



   int max = 0;

   for(int i = 0; i <n; i++){
    int width = rb[i] - lb[i] -1;
    
    int area = a[i] * width;

    if(area> max){
      max = area;
    }
   }
   System.out.println(max);
  }
}
