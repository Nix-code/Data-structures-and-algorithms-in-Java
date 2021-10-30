import java.io.*;
import java.util.*;

public class PrintThepurmutation{

  static void solve(String st, String ans){

    if(st.length()==0){
      System.out.print(ans+" ");
      return;
    }

    for(int i = 0; i <st.length();i++){
      char ch = st.charAt(i);
      String l = st.substring(0,i);
      String r = st.substring(i+1);

      String temp = l+r;

      solve(temp, ans+ch);
    }

    

 }
  public static void main(String[] args) {

    String s = "abc";

    solve(s,"");
    
  }
}
