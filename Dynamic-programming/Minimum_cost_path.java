import java.io.*;
import java.util.*;

public class Minimum_cost_path{

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int a[][] = new int[n][m];
   
    for(int i = 0; i <a.length; i++){
      for(int j = 0; j <a[0].length; j++){
        a[i][j] = sc.nextInt();
      }
    }
    int dp[][] = new int[n][m];
    for(int i =dp.length-1; i >=0; i--){
      for(int j = dp[0].length-1; j >=0; j--){

        if(i == dp.length-1 && j == dp[0].length-1){

          dp[i][j] = a[i][j];
        }

        else if( i == dp.length-1){
          dp[i][j] = dp[i][j+1] + a[i][j];
        }

        else if(j == dp[0].length-1){
        dp[i][j] = dp[i+1][j] + a[i][j];
        }
        else{
        dp[i][j] = Math.min(dp[i][j+1], dp[i+1][j])+a[i][j];

        }
        
      }
    }
    System.out.println(dp[0][0]);
  }
}
