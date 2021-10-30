
// Nishant Banjade 

import java.util.*;
public class CountLeavesNode{

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
    Node p, t;
    int x;
    Queue<Node> q = new LinkedList<>();
    System.out.println("Enter the root node of the tree");


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
        p.right  = t;
        q.add(t);
      }
    } 
  }

  static int countLeaf(Node n){
    if(n==null){
      return 0;
    }

    if(n.left == null && n.right == null){
      return 1;
    }

    return countLeaf(n.left)+countLeaf(n.right);
  }

  
public static void main(String[] args) {
   create();
   System.out.println(countLeaf(root));
  }
}









