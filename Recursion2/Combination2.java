public class Combination2{

  static void solve(boolean box[], int ci, int r, int lb){

    if(ci > r){
      for(int i = 0; i <box.length; i++){
        if(box[i]){
          System.out.print("i");
        }
        else{
          System.out.print("-");
        }
      }
      System.out.println();
      return;
    }

    for(int b = lb+1; b <box.length; b++){
      if(box[b] == false){
        box[b] = true;
        solve(box, ci+1, r, b);
        box[b] = false;
      }
    }

  }
  public static void main(String[] args) {
    int n = 3;
    int r = 2;
    solve(new boolean[n], 1, r, -1);
    
  }
}
