// insert in a tree 
public class Search{

  static class Node{
    int data;
    Node left, right;

    Node(int data){
      this.data= data;
      this.left = null;
      this.right = null;
    }
  }
  static Node root;

  static void insert(int data){
    Node t = root;
    Node r = null;
    Node p;


    if(root == null){
      p = new Node(data);
      root = p;
      return;
    }
    while(t!=null){
      r = t;
      if(data < t.data){
        t = t.left;
      }
      else if(data> t.data){
        t = t.right;
      }
      else{
        return;
      }
    }
    p = new Node(data);
    if(data < r.data){
      r.left = p;
    }
    else{
      r.right = p;
    }

  }
  static boolean search(int data){
    Node t = root;

    while(t!=null){
      if(data == t.data){
        return true;
      }
      else if(data < t.data){
        t = t.left;
      }
      else{
        t = t.right;
      }
    }
    return false;
  }

   
  public static void main(String[] args) {
    
    insert(3);
    insert(7);
    insert(32);
    insert(44);
    insert(1);
    System.out.println();
    System.out.println();
  if(search(7)){
    System.out.println("It is in the tree");
  }
  else{
    System.out.println("Not in a tree");
  }
  }
}

















