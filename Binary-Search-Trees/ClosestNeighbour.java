import java.io.*;
import java.util.*;
public class ClosestNeighbour{

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
  static int min_diff, min_temp;

  static void maxUtil(Node n, int k){

    if(n == null){
      return;
    }
    if(n.data == k){
      min_diff = k;
      return;
    }

    if(min_diff > Math.abs(n.data - k)){

      min_diff = Math.abs(n.data - k);

      min_temp = n.data;

    }
    if(k < n.data){
      maxUtil(n.left, k);

    }
    else{
      maxUtil(n.right, k);
    }
  }

  static int max(Node root, int k){
    min_diff = Integer.MAX_VALUE;
    min_temp = -1;

    maxUtil(root, k);

    return min_temp;
  }
 public static void main(String[] args) {
   root = new Node(10); 
   root.left = new Node(5);
   root.right = new Node(50);
   root.left.left = new Node(1);
   root.right.left = new Node(40);
   root.right.right = new Node(100);

   System.out.println(max(root, 54));
  }
}

