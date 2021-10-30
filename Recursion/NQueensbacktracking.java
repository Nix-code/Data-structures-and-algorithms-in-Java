public class NQueensbacktracking{

  static void solve(int chess[][], String asf, int row){
    if(row == chess.length){
      System.out.println(asf);
      return;
    }

    for(int c = 0; c < chess.length; c++){

      if(issafe(chess, row, c)){
      chess[row][c] =1;
      solve(chess, asf+" "+row+" "+c+" ",row+1);

      chess[row][c] = 0;
    }
  }
}
static boolean issafe(int chess[][], int row, int col){

  // for vertircal row 
  for(int i = row-1, j = col; i >=0; i--){
    if(chess[i][j] == 1)
      return false;
  }
  // for top left 
  for(int i = row-1, j = col-1; i >=0 && j >=0; i--, j--){

    if(chess[i][j] == 1){
      return false;
    }
  }
  // top right 
  for(int i = row-1, j = col+1; i >=0 && j < chess.length; i--,j++){
    if(chess[i][j] == 1){
      return false;
    }
  }
  return true;
}
  public static void main(String[] args) {
   int chess[][] = new int[4][4];
   String asf = "";
   int row = 0;
   solve(chess, asf, row);
  }
}
