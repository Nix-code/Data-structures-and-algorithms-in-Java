public class Increasing_decreasing{

  static void increasing(int n){

    if(n > 0) {
    System.out.println(n);
    increasing(n-1);

    System.out.println(n);
  }
  }
  public static void main(String[] args) {
    
    increasing(5);
  }
}


