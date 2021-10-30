import java.io.*;
import java.util.*;
public class BSTRange{

  static class Node{
    int data;
    Node left, right;

    Node(int data){
      this.data = data;
      this.left = null;
      this.right = null;
    }
  }
  static Node root;

static   int getC(Node n, int l, int h){

    if(n==null){
      return 0;
    }

    if(n.data >=l && n.data <=h){
      return 1+getC(n.left, l, h)+getC(n.right, l, h);
    }
    else if(n.data < l){
      return getC(n.right, l, h);
    }
    else{
      return getC(n.left, l,h);
    }
  }
  public static void main(String[] args) {
   root = new Node(10); 
   root.left = new Node(5);
   root.right = new Node(50);
   root.left.left = new Node(1);
   root.right.left = new Node(40);
   root.right.right = new Node(100);

   System.out.println(getC(root, 5, 50));
  }
}
