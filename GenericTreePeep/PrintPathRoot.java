import java.io.*;

import java.util.*;

public class PrintPathRoot{

  static class Node{
    int data;
    Node left;
    Node right;
    
    // constructor 
    Node(int data){
      this.data = data;
      this.left = null;
      this.right = null;
    }

  }

  static Node root;
  static void create(){

    Scanner sc = new Scanner(System.in);

    Queue<Node> q = new LinkedList<>();
    int x;
    Node p,t;
    System.out.println("Enter the root");
    x = sc.nextInt();
    root = new Node(x);
    q.add(root);
    while(!q.isEmpty()){
     p = q.poll();
     System.out.println("Enter left node of "+p.data);
     x = sc.nextInt();
     if(x!=-1){
       t = new Node(x);
       p.left = t;
       q.add(t);
     }

     System.out.println("Enter right node of "+p.data);
     x = sc.nextInt();
     if(x!=-1){
       t = new Node(x);
       p.right = t;
       q.add(t);
     }
    }
  }

  static boolean hasPath(Node root, ArrayList<Integer> arr, int x){

    if(root == null){
      return false;
    }
    arr.add(root.data);
    if(root.data == x){
      return true;
    }

    if(hasPath(root.left, arr, x) || hasPath(root.right, arr, x)){
      return true;
    }
    // if the value is not present in none of the subtrees and then remove the node 
    arr.remove(arr.size()-1);
    return false;
  }

  static void printPath(Node root, int x){
    ArrayList<Integer> arr = new ArrayList<>();

    if(hasPath(root, arr, x)){
    for(int i = 0; i <arr.size(); i++){
      System.out.print(arr.get(i)+" ");
    }
    
    }
    else{
      System.out.println("");
    }
  }
  public static void main(String[] args) {
   create();
   int x = 7;

   printPath(root, x);
  }
}




