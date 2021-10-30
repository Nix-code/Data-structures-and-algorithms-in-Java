import java.io.*;
import java.util.*;

public class SameStr{

  static class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
      this.data = data;
      this.left = null;
      this.right = null;
    }
  }
  static Node root;
  static void create(){
    Scanner sc = new Scanner(System.in);
    int x;
    Node p, t;

    Queue<Node> q = new LinkedList<>();
    System.out.println("Enter the root");
    x = sc.nextInt();
    root = new Node(x);
    q.add(root);
    while(!q.isEmpty()){
      p = q.poll();
      System.out.println("Enter the left child of "+p.data);
      x = sc.nextInt();
      if(x!=-1){
       t = new Node(x);
       p.left = t;
       q.add(t);
      }
      System.out.println("Enter the right child of "+p.data);
      x = sc.nextInt();
      if(x!=-1){
       t = new Node(x);
       p.right= t;
       q.add(t);
      }


    }
  }
  static boolean same(Node a, Node b){
    if(a==null && b==null){
      return true; 
    }
    if(a!=null && b!=null){
      same(a.left, b.left);
      same(a.right, b.right);
    }
    return false;
  }
  public static void main(String[] args) {
  create();  
  }
}
