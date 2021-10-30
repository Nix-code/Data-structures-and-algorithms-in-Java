import java.io.*;

import java.util.*;

public class Zigzag{

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
    if(n == null){
      return;
    }

    // declare the two stacks 
    Stack<Node> curr = new Stack<>();
    Stack<Node> temp = new Stack<>();

    curr.push(n);
    boolean ltor = true;
    while(!curr.isEmpty()){
      Node node = curr.pop();
      System.out.print(node.data+" ");

      if(ltor){
        if(node.left!=null){
          temp.push(node.left);
        }
        if(node.right!=null){
          temp.push(node.right);
        }
      }
      else{
        if(node.right!=null){
          temp.push(node.right);
        }
        if(node.left!=null){
          temp.push(node.left);
        }
      }
      if(curr.isEmpty()){
        ltor = !ltor;
        Stack<Node> nx = curr;
        curr = temp;
        temp = nx;
      }
    }
   }
 public static void main(String[] args) {
   create();
   Level(root);
  }
}


