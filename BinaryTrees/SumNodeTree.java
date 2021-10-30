
// Nishant Banjade 

import java.util.*;
public class SumNodeTree{

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

  static int Height(Node n){
    if(n==null){
      return 0;
    }

    int lh = Height(n.left);
    int rh = Height(n.right);
    int res = Math.max(lh,rh)+1;

    return res;
  }

  static int sumnode(Node n){
    int c = 0;
    if(n==null){
      return 0;
    }
    
    c = sumnode(n.left)+sumnode(n.right)+n.data;
    return c;
  }
 public static void main(String[] args) {
   create();
   System.out.println(sumnode(root));
  }
}





