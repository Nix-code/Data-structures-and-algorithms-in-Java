import java.util.*;

public class Celebrity{
  static void iscelebrity(int a[][]){

    Stack<Integer> st = new Stack<>();

    for(int i = 0; i < a.length; i++){
      st.push(i); // 0 1 2 3 
    }

    while(st.size() >= 2){
      int x = st.pop();
      int y = st.pop();

      if(a[x][y] == 1){
        st.push(y);
      }
      else{
        st.push(x);
      }
    }
    int pot = st.pop();

    for(int i = 0; i <a.length; i++){
      if(i!=pot){
        if(a[pot][i] == 0 || a[i][pot] == 1){
          System.out.println("None");
          return;
        }
      }
    }
    System.out.println(pot);
  }
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);

   int n = sc.nextInt();
   int a[][] = new int[n][n];
   for(int i =0; i <n; i++){
     for(int j = 0; j <n; j++){
       a[i][j] = sc.nextInt();
     }
   }
   iscelebrity(a);
  }
}
