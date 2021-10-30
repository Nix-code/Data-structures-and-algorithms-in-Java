import java.io.*;

public class Kthsmallest_element_BST{

  static class Node{
    int data;
    Node left, right;

    Node(int data){
      this.data = data;
      this.left = null;
      this.right = null;
    }
  }

  static int count = 0;

  static Node insert(Node root, int x){
    if(root == null){
      return new Node(x);
    }
    if(x < root.data){
      root.left = insert(root.left, x);
    }
    else if( x > root.data ){
      root.right = insert(root.right, x);
    }
    return root;
  }
  static Node kthsmallest(Node root, int k){
    if(root == null){
      return null;
    }
    Node left = kthsmallest(root.left, k);

    if(left!=null){
      return left;
    }
    count++;

    if(count == k){
      return root;
    }
    return kthsmallest(root.right, k);
  }

  static void print(Node root, int k){
    count = 0;
    Node res = kthsmallest(root, k);

    if(res == null){
      System.out.println("No result");
    }
    else{
      System.out.println(res.data);
    }
  }
  public static void main(String[] args) {
   Node root = null;
   int keys[] = {20,8,22,4,12,10,14};
   for(int x: keys){
     root = insert(root, x);
   }
   int k = 3;
   print(root, k);
  }
}
