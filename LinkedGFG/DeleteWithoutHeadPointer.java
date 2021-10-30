public class DeleteWithoutHeadPointer{
  static Node head;
  static class Node{
    int data;
    Node next;
    Node(int data){
      this.data = data;
      this.next = null;
    }
  }
  static void create(int a[]){
    Node last,t;
    head = new Node(a[0]);
    last = head;
    for(int i =1; i <a.length; i++){
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
  static void del(Node n){
    if(n==null){
      return;
    }
    else if(n.next==null){
      return;
    }
    Node temp = n.next;
    n.data = n.next.data;
    n.next = n.next.next;
  }
 public static void main(String[] args) {
   int a[] = {1,3,4,5,6};
   create(a);
   del(head.next.next);
   print(head);
  }
}
