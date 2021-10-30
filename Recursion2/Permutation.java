public class Permutation{

   public static void solve(int[] boxes, int level, int r){
    if(level> r){
      for(int i = 0; i < boxes.length; i++){
        System.out.print(boxes[i]);
      }
      System.out.println();
      return;
    }

    for(int i = 0; i < boxes.length; i++){
      if(boxes[i] == 0){
        boxes[i] = level;
        solve(boxes, level+ 1, r);
        boxes[i] = 0;
      }
    }
  }  public static void main(String[] args) {
    int r = 3;
    int n = 5;
    int box[] = new int[n];
    solve(box,1, r); 
  }
}
