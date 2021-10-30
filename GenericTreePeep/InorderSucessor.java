import java.io.*;
import java.util.*;
public class InorderSucessor{

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

    static void create(){
      Scanner sc = new Scanner(System.in);
      int x;
      Node p, t;
      System.out.println("Enter the root");
      x = sc.nextInt();
      Queue<Node> q = new LinkedList<>();
      root = new Node(x);
      q.add(root);

      while(!q.isEmpty()){
        
        p = q.poll();
        System.out.println("Enter the left root of "+p.data);
        x = sc.nextInt();
        if(x!=-1){
          t = new Node(x);
          p.left = t;
          q.add(t);
        }
        System.out.println("Enter the right root of "+p.data);
        x = sc.nextInt();
        if(x!=-1){
          t = new Node(x);
          p.right = t;
          q.add(t);
        }

      }
    }

    static int ceil(Node root, int d){
      int c =root.data;

      if(root == null){
        return -1;
      }
      if(root.data == d){
        return root.data;
      }
      int l =  ceil(root.left, d);
      int r=   ceil(root.right, d);

      if(l > d){
        if( l < c ){
          c = l;
        }
      }
      return c;
    }
  
    static void in(Node n){
      if(n!=null){
        in(n.left);
        System.out.print(n.data+" ");
        in(n.right);
      }
    }
  public static void main(String[] args) {
   create();
   System.out.println(ceil(root, 30));

  }
}
