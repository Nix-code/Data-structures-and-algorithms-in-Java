public class Decreasing_number{

  static void decreasing(int n){

    if(n > 0) {
    System.out.println(n);
    decreasing(n-1);
  }
  }
  public static void main(String[] args) {
    
    decreasing(5);
  }
}
