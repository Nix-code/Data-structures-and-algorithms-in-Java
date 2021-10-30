import java.io.*;
import java.util.*;
public class Floodfill{

  public static void  floodfill(int a[][], int row, int col, String psf, boolean visited[][]) {
    
    if(row < 0 || col < 0 || row >=a.length || col >= a.length || a[row][col] == 1 || visited[row][col] == true){
      return;
    }

      else if(row == a.length-1 && col == a[0].length-1){
      System.out.println(psf);
      return;
    }
    visited[row][col] = true;
    floodfill(a, row-1,col,psf+" t ", visited);
    floodfill(a, row, col-1, psf+" l ", visited);
    floodfill(a, row+1, col, psf+" d " , visited);
    floodfill(a, row, col+1, psf+ " r ", visited);
    visited[row][col] =false;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();

    int a[][] = new int[n][m];

    for(int i = 0; i <n; i++){
      for(int j = 0; j <m; j++){
        a[i][j] = sc.nextInt();
      }
    }

    boolean visited[][] = new boolean[n][m];
    floodfill(a, 0, 0, "", visited);
  }
}
//3 3
//0 0 0
//1 0 1
//0 0 0
