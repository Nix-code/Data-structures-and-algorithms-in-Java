import java.io.*;
import java.util.*;

public class Middleoflist
{
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

  static int Length(Node n){
    int c = 0;
    while(n!=null){
      c++;
      n = n.next;
    }
    return c;
  }
  static int find_middle(Node n){

    int m = Length(n)/2;
    Node temp = first;
    for(int i =0; i <m; i++){
      temp = temp.next; 
    }
    return temp.data;
  }

  public static void main(String[] args) {
   
    Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();

      int a[] = new int[n];

      for(int i = 0; i <n; i++){
        a[i] = sc.nextInt();
      }

      create(a);
      System.out.println(find_middle(first));
  }
}

