public class ZigZag{
  public static void z(int n) {

    if(n==0){
      return;
    }
    
    System.out.println("Pre "+n);
    z(n-1);
    System.out.println("In "+n);

    z(n-1);

    System.out.println("Post "+n);
}
public static void main(String[] args) {
  
  int n = 2;

  z(n);
}
}
