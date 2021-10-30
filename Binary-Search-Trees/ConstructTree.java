import java.io.*;
import java.util.*;

public class ConstructTree{

  static class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
      this.data = data;
      this.left = left;
      this.right = right;
    }
  }

  static Node root;
  static void create(int a[], int n){
    Stack<Node> st = new Stack<>();
    Node t;
    int i = 0;
    Node p;

    root = new Node(a[i++]);
    p = root;
    while(i < n){
      if(a[i] < p.data){
        t = new Node(a[i++]);
        p.left =t;
        st.push(p);
        p = t;
      }
      else{
        if(a[i] >p.data && a[i] < st.pop().data){

          if(st.isEmpty()){
            Node x = new Node(444);
            st.push(x);
          }
          t = new Node(a[i++]);
          p.right = t;
          p = t;
        }
        else{
          p = st.pop();
        }
      }
    }
  }

  void Inorder(Node n){
    if(n!=null){
      System.out.print(n.data+" ");

      Inorder(n.left);
      Inorder(n.right);
    }
  }
  public static void main(String[] args) {
    ConstructTree tree = new ConstructTree();
    int a[] = {30,20,10,15,25,40,50,45};
    
    tree.create(a,8);
    tree.Inorder(root);  
  }
}
