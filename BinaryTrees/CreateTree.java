import java.util.*;

public class CreateTree{

  static Node root;
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

  static void create(){

    Scanner sc = new Scanner(System.in);
    
    int x;
    Node p, t;
    System.out.println("Enter the root node");
    x = sc.nextInt();
    root = new Node(x);

    Queue<Node> q = new LinkedList<>();
    q.add(root);

    while(!q.isEmpty()){
     p = q.poll();
     System.out.println("Enter the left root");
     x = sc.nextInt();

     if(x!=-1){
       t = new Node(x);
       p.left = t;
       q.add(t);
     }

     System.out.println("Enter the right root");

     x = sc.nextInt();
     if(x!=-1){
       t = new Node(x);
       p.right = t;
       q.add(t);
     }

    }
    
  }

  public static void main(String[] args) {
   create();
  }
}
