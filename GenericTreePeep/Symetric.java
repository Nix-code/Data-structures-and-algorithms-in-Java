public class Symetric{

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

  static boolean is_symmetric(Node n1, Node n2){

    if(n1 == null && n2==null){
      return true;
    }

    if(n1!=null && n2!=null && n1.data == n2.data){
      return (is_symmetric(n1.left,n2.right) && is_symmetric(n1.right, n2.left));
    }
    return false;

  }

  public static void main(String[] args) {
    root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(2);
    root.left.left = new Node(3);
    root.left.right = new Node(4);
    root.right.left = new Node(4);
    root.right.right = new Node(3);
  }
}
