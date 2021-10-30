import java.io.*;

import java.util.*;

public class LevelLine{

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

  static void Level(Node n){
    Queue<Node> q = new LinkedList<>();
       
    if(n == null){
      return;
    }

    q.add(n);

    while(!q.isEmpty()){
      Node temp = q.poll();
      if(temp.left!=null){
        q.add(temp.left);
      }

      if(temp.right!=null){
        q.add(temp.right);
      }
      System.out.print(temp.data+"$");
    }
    }

  
  public static void main(String[] args) {
   create();
   Level(root);

  }
}


