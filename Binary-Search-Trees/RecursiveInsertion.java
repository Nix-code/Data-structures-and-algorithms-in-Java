import java.io.*;
import java.util.*;

public class RecursiveInsertion{

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

  static void insert(int data){
    root = ins(root, data);
  }

  static Node ins(Node root, int data){
    if(root==null){
      root = new Node(data);
      return root;
    }
    if(data < root.data){
      root.left = ins(root.left, data);
    }
    else if(data > root.data){
      root.right = ins(root.right, data);
    }
    return root;
  }

  static void pre(Node n){
    if(n!=null){

      pre(n.left);
      System.out.print(n.data+" ");
      pre(n.right);
    }
  }
  public static void main(String[] args) {
    
   insert(1);
   insert(5);
   insert(4);
   insert(13);
   pre(root);
  }
}
