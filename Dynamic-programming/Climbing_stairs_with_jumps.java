import java.io.*;
import java.util.*;

public class Climbing_stairs_with_jumps{

  
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int steps[] = new int[n];

    for(int i = 0; i <steps.length; i++){
      steps[i] = sc.nextInt();
    }
    int ans[] = new int[n+1];

    
    ans[n] = 1;
    for(int i = n-1; i >=0; i--){

      for(int j =1;j <=steps[i] && i+j < ans.length; j++){
        ans[i] += ans[i+j];
      }
    }
    System.out.println(ans[0]);
    
  }
}
