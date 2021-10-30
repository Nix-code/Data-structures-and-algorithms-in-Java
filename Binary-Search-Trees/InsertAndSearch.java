// Nishant Banjade 

public class InsertAndSearch{
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

  static void insert(int data){

    root = insertMe(root, data);
  }

  static Node insertMe(Node root, int data){
    if(root == null){
      root = new Node(data);
      
      return root;
    }
    if(data < root.data){
      root.left = insertMe(root.left, data);
    }
    else if( data > root.data ){
      root.right = insertMe(root.right, data);
    }
    return root;
  }
  static void inorder(Node root){
    if(root!=null){
      inorder(root.left);
      System.out.print(root.data+" ");
      inorder(root.right);
    }
  }
  public static void main(String[] args) {
   insert(50);
   insert(30);
   insert(20);
   insert(40);
   insert(70);
   insert(80);
   insert(60);

   inorder(root);
  }
}














