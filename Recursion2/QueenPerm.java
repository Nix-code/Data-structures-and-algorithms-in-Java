public class QueenPerm{

  static void solve(int qpsf, int tq, int [][] chess){

    if(qpsf == tq){

      
      for(int i = 0; i <chess.length; i++){

        for(int j = 0; j <chess[0].length; j++){

          if(chess[i][j] == 0){
            System.out.print("-\t");
          }
          else{
            System.out.print("q"+chess[i][j]+"\t");
          }
        }
        System.out.println();
      }
      System.out.println();
    }


    for(int i = 0; i <chess.length; i++){

      for(int j = 0; j <chess[0].length; j++){

        if(chess[i][j] == 0){
          chess[i][j] = qpsf+1;
          solve(qpsf+1, tq, chess);
          chess[i][j] = 0;
        }
      }
    }
  }
  public static void main(String[] args) {
    int n = 2;
    int chess[][] = new int[n][n];
    solve(0, n, chess);
    
  }
}
