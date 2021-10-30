public class Bst_from_levelorder{

  static class Node{
    int data;
    Node left;
    Node right;
  }
  static Node getNode(int data){
    Node newNode = new Node();
    newNode.data =data;
    newNode.left = newNode.right = null;
    return newNode;
  }

  static Node levelorder(Node root, int data){

    if(root == null){
      root =  getNode(data);
      return root;
    }

    if(data<= root.data){
      root.left = levelorder(root.left, data);
    }
    else{
      root.right = levelorder(root.right, data);
    }
    return root;
  }

  static Node construct(int a[], int n){
    if(n==0)return null;

    Node root = null;

    for(int i = 0; i <n; i++){
      root = levelorder(root, a[i]);

    }

    
      return root;
  }

  static void inorder(Node root){
    if(root == null){
      return;
    }
    inorder(root.left);
    System.out.println(root.data);
    inorder(root.right);
  }
  
  public static void main(String[] args) {
    int a[] = {7,4,12,3,6,8,1,5,10};
    int n = a.length;
    Node root = construct(a,n);
    inorder(root);
    
  }
}
