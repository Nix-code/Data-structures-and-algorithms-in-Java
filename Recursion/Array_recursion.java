public class Array_recursion{

  static void print(int a[] , int n){

    if(n==0){
      return;
    }

    print(a,n-1);
    System.out.println(a[n-1]);

  }
  public static void main(String[] args) {
    
    int a[] = {1,2,3,4,5};
    int n = a.length;
    print(a,n);
  }
}
