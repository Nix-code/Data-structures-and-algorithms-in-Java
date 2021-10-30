import java.io.*;
import java.util.*;

public class Find_node{

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
  
  static boolean find(Node root, int data){
    if(root == null){
      return false;
    }
    if(data < root.data){
      return find(root.left, data);
    }
    else if(data > root.data){
      return find(root.right, data);
    }
    else{
      return true;
    }
  }
public static void main(String[] args) {
    
   insert(11);
   insert(5);
   insert(4);
   insert(13);
   insert(44);
   System.out.println(find(root, 0));
  }
}





