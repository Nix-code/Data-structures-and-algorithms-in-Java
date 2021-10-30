public class DisplayLinkedList{

  static class Node{
    int data;
    Node next; // node type 

    Node(int data){
      this.data = data;
      this.next = null;
    }
  }

  static Node first;

  static void create(int a[]){
    Node last;
    Node t;

    first = new Node(a[0]);
    last = first;
    for(int i = 1; i <a.length; i++){
     t = new Node(a[i]);
     last.next = t;
     last = t;
    }
  }

  static void print(Node n){
    
    while(n!=null){
      System.out.print(n.data+" ");
      n = n.next;
    }
  }
  public static void main(String[] args) {
    int a[] = {1,3,3,5};
    create(a);
    print(first);
  }
}
