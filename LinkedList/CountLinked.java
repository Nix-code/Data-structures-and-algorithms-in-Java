import java.io.*;
import java.util.*;

public class CountLinked{

  static Node first;

  static class Node{
    int data;
    Node next;

    Node(int data){
      this.data = data;
      this.next = next;
    }
  }

  static void create(int a[], int n){
    Node last;
    Node t;

    first = new Node(a[0]);
    last = first;

    for(int i = 1; i <n; i++){
      t = new Node(a[i]);
      last.next = t;
      last = t;
    }
  }

  static int node_count(Node h){
    int count = 0;
    while(h!=null){
      count+=h.data;
      h = h.next;
    }
    return count;
  }
  

  static void display(Node n){
    if(n==null){
      return;
    }
    System.out.print(n.data+" ");

    display(n.next);
  }

  static int max_of_node(Node n){

    int max  = Integer.MIN_VALUE;
    while(n!=null){
      max = Math.max(max, n.data);
      n = n.next;
    }
    return max;
  }

  static int Lsearch(Node p, int key){

    while(p!=null){
      if(key == p.data){
        return p.data;
      }
      p = p.next;
    }
    return -1;
  }

  static int recursive_search(Node n, int key){
    if(n==null){
      return -1;
    }
    if(n.data == key){
      return n.data;
    }
    else{
      return recursive_search(n.next, key);
    }
  }

  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   
   int n = sc.nextInt();
   int a[] = new int[n];

   for(int i = 0; i <n; i++){
     a[i] = sc.nextInt();
   }
   create(a,n);
   display(first);
   System.out.println();
   System.out.println(max_of_node(first));
   System.out.println(recursive_search(first,5));
  }
}
