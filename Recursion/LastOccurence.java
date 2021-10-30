public class LastOccurence{
  public static int solve(int a[], int idx, int x) {


    if(idx == 0){
      return -1;
    }

    if(a[idx] == x){
      return idx;
    }
    else{

      int id = solve(a, idx-1, x);
      return id;
    }
    
  }
  public static void main(String[] args) {
    
    int a[] = {1,2,3,4,5,6,4,3,2,1};
    int idx = a.length;
    int x = 3;
    System.out.println(solve(a,idx-1, x));
    
  }
}
