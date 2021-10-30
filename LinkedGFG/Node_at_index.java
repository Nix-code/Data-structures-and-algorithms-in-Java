import java.io.*;
import java.util.*;

public class Node_at_index{

  static class Node{

    int data;
    Node next;

    Node(int data){
      this.data = data;
      this.next = null;
    }
  }

  static Node first;

  static void create(int a[]){
    Node last,t;
    first =new Node(a[0]);
    last = first;

    for(int i = 1; i <a.length; i++){

      t = new Node(a[i]);
      last.next = t;
      last = t;
    }
  }

  static int find(int x){
    Node temp = first;
    int c = 0;
    int r =0;
    while(temp!=null){
      c++;
      if(c == x){
        r = temp.data;
      }
      temp = temp.next;
    }
    return r;
  }
  public static void main(String[] args) {
   
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while(t-->0){
      int n = sc.nextInt();
      int k = sc.nextInt(); // this is the index 

      int a[] = new int[n];

      for(int i = 0; i <n; i++){
        a[i] = sc.nextInt();
      }

      create(a);
      System.out.println(find(k));
    }
  }
}
