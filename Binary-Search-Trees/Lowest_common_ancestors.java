public class Lowest_common_ancestors{

  static class Node{
    int data;
    Node left,right;

    Node(int data){
      this.data = data;
      this.left = null;
      this.right = null;
    }
  }
  static Node root;

  static Node find_lca(Node n, int n1, int n2){
    if( n == null ){
      return null;
    }
    if(n.data > n1 && n.data > n2){
      return find_lca(n.left, n1, n2);
    }
    if(n.data < n1 && n.data < n2){
      return find_lca(n.right, n1, n2);
      
    }
    return n;
  }
  public static void main(String[] args) {
    root = new Node(20);
    root.left = new Node(8);
    root.right = new Node(22);
    root.left.left = new Node(4);
    root.left.right = new Node(12);
    root.left.right.left = new Node(10);
    root.left.right.right = new Node(14);
    int n1 = 10,n2 = 14;
    Node t = find_lca(root, n1, n2);
    System.out.println(t.data);

  }
}






