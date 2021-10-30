public class Reverse_array_in_recursion{
  
  static void recurse(int a[], int n){

    if(n-1 >= 0){

      System.out.print(a[n-1]+" ");

      recurse(a, n-1);
      
    }

  }
  public static void main(String[] args) {
   int a[] = {1,2,3,4,5};
   int n = a.length;

   recurse(a,n);
  }
}
