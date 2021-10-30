import java.io.*;
import java.util.*;

public class Min_Node{

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
  static int min(Node root){
    if(root.left!=null){
      return min(root.left);
    }
    return root.data;
  }

  
public static void main(String[] args) {
    
   insert(11);
   insert(5);
   insert(4);
   insert(13);
   insert(44);
   System.out.println(min(root));
  }
}




