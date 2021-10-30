public class Combination{

  static void print(int level, int n, int r, int ssf, String asf){

    if(level > n){
      if(ssf == r){
        System.out.println(asf);
      }
    }
    else{
      print(level+1, n, r, ssf+1, asf+" i");
      print(level+1, n, r,ssf, asf+"-");
    }
  }
  public static void main(String[] args) {
    print(1,3,2,0,"");
  }
}
