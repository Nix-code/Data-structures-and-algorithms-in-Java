
// Nishant Banjade 

import java.util.*;
public class LeftViewOfTree{

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


  static ArrayList<Integer> leftview(Node n){

    ArrayList<Integer> l = new ArrayList<>();

    if(n==null){
      return l;
    }
    Queue<Node> q = new LinkedList<>();

    q.add(n);

    while(!q.isEmpty()){
      int b = q.size();

      for(int i = 0; i <b; i++){

        Node temp  = q.poll();
        if(i==0){
          l.add(temp.data);
        }
        if(temp.left!=null){
          q.add(temp.left);
        }
        if(temp.right != null){
          q.add(temp.right);
        }
      }
    }
    return l;
    
  }
 public static void main(String[] args) {
   create();
   ArrayList k = leftview(root);
   System.out.println(k);
  }
}





