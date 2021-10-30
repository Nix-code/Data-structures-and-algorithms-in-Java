 
import java.io.*;
import java.util.*;

public class Nthnodefromend
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
  static int find_nth(Node n, int id){

    Node temp = n;
    int x = Length(n)-id;
    if(x <0){
      return -1;
    }
    for(int i = 0; i <x; i++){
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
      System.out.println(find_nth(first,2));
  }
}


