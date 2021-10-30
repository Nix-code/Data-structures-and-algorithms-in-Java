public class FirstOccurence{

  static int fist(int a[], int idx, int x){

    if(idx == a.length){
      return -1;
    }

    if(a[idx] == x){
      return idx;
    }
    else{
      int fi = fist(a, idx+1, x);
      return fi;
    }

      
  }
  public static void main(String[] args) {
    int a[] = {1,2,4,5,2,3,4,5,6,5,3,2,1};
    
    System.out.println(fist(a,0,3));
    
  }
}
