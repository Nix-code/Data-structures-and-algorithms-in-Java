import java.util.*;
public class Inverted_Triangle{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n =sc.nextInt();

    int temp = n;
    for(int i = 1; i <=n; i++){

      for(int j = 1; j <=temp; j++){
        System.out.print("*\t");
      }
      temp--;
      System.out.println();
    }
  }
}
