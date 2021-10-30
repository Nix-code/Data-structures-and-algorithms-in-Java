import java.io.*;
import java.util.*;

public class BalancedTree{

  static Node root;
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

  // create the tree 
  static void create(){
    Scanner sc = new Scanner(System.in);
    int x;
    Node p,t;

    Queue<Node> q = new LinkedList<>();
    System.out.println("Enter the root Node");
    x = sc.nextInt();
    root = new Node(x);
    q.add(root);

    // for left and the right 

    while(!q.isEmpty()){
      p = q.poll();

      System.out.println("Enter the left node of "+p.data);
      x = sc.nextInt();

      if(x!=-1){
        t = new Node(x);
        p.left = t;
        q.add(t);
      }

      System.out.println("Enter the right node of "+p.data);
      x = sc.nextInt();

      if(x!=-1){
        t = new Node(x);

        p.right = t;
        q.add(t);
      }
    }


  }
  static boolean isBal(Node n){

    if(n==null){
      return true;
    }
    int lh = height(n.left);
    int rh = height(n.right);

    if(Math.abs(lh-rh) <=1 && isBal(n.left) && isBal(n.right)){
      return true;
    }
    return false;
  }

  static int height(Node n){
    if(n==null){
      return 0;
      
    }
    int l = height(n.left);
    int r = height(n.right);
    int res = Math.max(l, r)+1;
    return res;
  }

  //static void pre(Node n){
    //if(n!=null){
      //System.out.println(n.data);
      //pre(n.left);
      //pre(n.right);
    //}
  //}

  public static void main(String[] args) {
    create();
    System.out.println(isBal(root));
  }
}
