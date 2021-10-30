import java.io.*;
import java.util.*;

public class ReverseList{

  static Node first;
  static class Node{
    int data;
    Node next;

    Node(int data){
      this.data = data;
      this.next = null;
    }
  }

  static void create(int a[]){
    Node last, t;
    first = new Node(a[0]);

    last = first;

    for(int i = 1; i <a.length; i++){
      t = new Node(a[i]);
      last.next = t;
      last = t;
    }
  }

  static void reverse(){

    Node p = first;
    Node q = null;
    Node r = null;
    while(p!=null){
      r = q;
      q = p;
      p = p.next;
      q.next = r;
    }
    first= q;

  }


  static void show(Node n){
    if(n!=null){
      System.out.print(n.data+" ");
      show(n.next);
    }
  }
  public static void main(String[] args) {
   int a[] = {4,5,2,6,7};
   create(a);
  reverse();
   show(first);
  }
}

