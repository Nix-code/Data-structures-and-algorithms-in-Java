import java.io.*;
import java.util.*;

public class Target_sum{

  public static void main(String[] args) {
    
    int a[] = {4,2,7,1,3};
    int target = 10;
    int n = a.length;
    boolean dp[][] = new boolean[5+1][target+1];

    for(int i = 0; i <dp.length; i++){

      for(int j = 0; j <dp[0].length; j++){

        dp[i][j] = false;
      }
    }

    for(int i = 0; i <dp.length; i++ ){

      for(int j = 0; j <dp[0].length; j++){

        if(i==0 && j==0){
          // first value
          dp[i][j] = true;
        }
        else if(i==0){

          dp[i][j] = false;
        }
        else if(j==0){

          dp[i][j] = true;
        }
        else{

          if(dp[i-1][j]==true){

            dp[i][j] = true;
          }
          else{
            int val = a[i-1];


            if(j >= val){

              if(dp[i-1][j-val] == true){
                dp[i][j] = true;
              }
            }
          }
        }
      }
    }
    System.out.println(dp[a.length][target]);

  }
}
