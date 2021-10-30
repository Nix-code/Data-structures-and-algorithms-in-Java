public class AreMirror{

  static class Node{
    int data;
    Node left, right;

    public Node(int data){
      this.data = data;
      this.left = null;
      this.right = null;
    }
  }

  Node a, b;

  static boolean areM(Node a, Node b){
    if(a == null && b == null){
      return true;
    }
    if(a==null || b==null){
      return false;
    }

    return a.data == b.data && areM(a.left, b.right) && areM(a.right,b.left);
  }
  public static void main(String[] args) {
    
    Node a = new Node(1);
    Node b = new Node(1);

    a.left = new Node(2);
    a.right = new Node(3);
    a.left.left = new Node(4);
    a.left.right = new Node(5);;

    b.left = new Node(3);
    b.right = new Node(2);
    b.right.left = new Node(5);
    b.right.right = new Node(4);

    System.out.println(areM(a,b));

  }
}
