public class Maximum_in_array{


  public static int maxi(int a[], int n) {

    if(n==1){
      return a[0];
    }  

    return Math.max(a[n-1], maxi(a, n-1));
  
  }   
  
  public static void main(String[] args) {
   int a[] = {111,3,4,5};

   int n = a.length;

   System.out.println(maxi(a, n));
  }
}
