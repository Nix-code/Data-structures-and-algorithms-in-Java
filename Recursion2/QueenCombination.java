import java.io.*;
import java.util.*;

public class QueenCombination{
  static void solve(int qpsf, int tq, int row, int col, String asf){
    if(row == tq){
      if(qpsf == tq){
        System.out.println(asf);
      }
      return;
    }

    int nr = 0;
    int nc = 0;
    String ysf = "";
    String nfs = "";

    if(col == tq-1){
      nr = row+1;
      nc = 0;
      ysf = asf+"q\n";
      nfs = asf+"-\n";
    }
    else{
      nr=row;
      nc = col+1;
      ysf = asf+"q";
      nfs = asf+"-";
    }

    solve(qpsf+1, tq, nr, nc, ysf);
    solve(qpsf+0, tq, nr, nc, nfs);
  }
  public static void main(String[] args) {

    int n = 2;
    solve(0, n, 0,0,""); 
  }
}
