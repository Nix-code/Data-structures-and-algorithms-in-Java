import java.io.*;
import java.util.*;

public class GetKeypad{

  static String[] codes = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

  public static void main(String[] args) throws Exception {

    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    
    ArrayList<String> words = getPc(str);
    System.out.println(words);
    
  }

  public static ArrayList<String> getPc(String str){

    if(str.length()==0){

      ArrayList<String> bres = new ArrayList<>();
      bres.add("");
      return bres;
    }

    char ch = str.charAt(0);
    String ros = str.substring(1);

    ArrayList<String> rres = getPc(ros);
    ArrayList<String> mres = new ArrayList<>();

    String codefo =codes[ch-'0'];

    for(int i = 0; i <codefo.length(); i++){

      char chcode = codefo.charAt(i);

      for(String rstr: rres){
        mres.add(chcode + rstr);
      }
    }
    return mres;
  }

  
}
