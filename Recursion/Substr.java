import java.io.*;
import java.util.*;

public class Substr{

  static List<String> al = new ArrayList<>();
  public static void main(String[] args) {
    
    String s = "abc";
    find(s, "");
    System.out.println(al);

  }

  static void find(String s, String ans){

    if(s.length() == 0){
      al.add(ans);
      return;
    }
    find(s.substring(1), ans+s.charAt(0));

    find(s.substring(1),ans);
  }
}
