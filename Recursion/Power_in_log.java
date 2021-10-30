public class Power_in_log{
  static int log_me(int x, int n){

    if(n == 0){
      return 1;
    }

    int p = log_me(x,n/2);
    int pm = p*p;
     if( n % 2==1 ){
       pm = pm*x;
    } 

    return pm;
  }
  public static void main(String[] args) {
    int x = 4;
    int n = 2;

    System.out.println(log_me(x,n));
    
  }
}
