import java.io.*;

import java.util.*;

public class MinNode{

  static class Node{
    int data;
    Node left;
    Node right;
    
    // constructor 
    Node(int data){
      this.data = data;
      this.left = null;
      this.right = null;
    }

  }

  static Node root;
  static void create(){

    Scanner sc = new Scanner(System.in);

    Queue<Node> q = new LinkedList<>();
    int x;
    Node p,t;
    System.out.println("Enter the root");
    x = sc.nextInt();
    root = new Node(x);
    q.add(root);
    while(!q.isEmpty()){
     p = q.poll();
     System.out.println("Enter left node of "+p.data);
     x = sc.nextInt();
     if(x!=-1){
       t = new Node(x);
       p.left = t;
       q.add(t);
     }

     System.out.println("Enter right node of "+p.data);
     x = sc.nextInt();
     if(x!=-1){
       t = new Node(x);
       p.right = t;
       q.add(t);
     }
    }
  }
 
  static int min_node(Node n){
    if(n == null){
      return Integer.MAX_VALUE;
    }
    int lh = min_node(n.left);
    int rh = min_node(n.right);
    int min = n.data;
    
    if(lh < min){
      min = lh;
    }
    if(rh <min){
      min = rh;
    }
    
    return min;
  }
  static void print(Node n){
    if(n!=null){
      System.out.print(n.data+" ");
      print(n.left);
      print(n.right);
    }
  }
  public static void main(String[] args) {
   create();
   System.out.println(min_node(root));
  }
}


