import java.io.*;
import java.util.*;

public class SizeTree{

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

  static int size(Node root){
    
    if(root == null){
      return 0;
    }
    int lf = size(root.left);
    int rf = size(root.right);
    int sum = lf+rf+1;
    return sum;
  }
  public static void main(String[] args) {
    
   insert(1);
   insert(5);
   insert(4);
   insert(13);
   insert(44);
   System.out.println(size(root));
  }
}

