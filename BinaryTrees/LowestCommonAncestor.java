
// Nishant Banjade 

import java.util.*;
public class LowestCommonAncestor{

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

  static Node LCA(Node n, int n1, int n2){

    if(n==null){
      return null;
    }
    if(n.data == n1 || n.data == n2){
      return n;
    }
    Node lf = LCA(n.left, n1, n2);
    Node rf = LCA(n.right, n1, n2);

    if(lf!=null && rf!=null){

      return n;
    }

    return(lf!=null)?lf:rf;
  }

public static void main(String[] args) {
   create();
   Node k = LCA(root, 3,4);
   System.out.println(k.data);
  }
}






