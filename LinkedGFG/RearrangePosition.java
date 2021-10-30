public class RearrangePosition{
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

  static void arrange(Node head){
    if(head == null){
      return;
    }

    Node odd = head;
    Node even = head.next;

    Node evenTemp = even;

    while(true){

      // if no node, connect first node of even to last node if odd
      if(odd == null || even == null || (even.next) == null){

        odd.next = evenTemp;
        break;
      }

      odd.next = even.next;
      odd = even.next;

      if(odd.next == null){
        even.next = null;
        odd.next = evenTemp;
        break;

      }
      even.next = odd.next;
      even = odd.next;
    }
    return;
   }

 public static void main(String[] args) {
   int a[] = {1,2,3,4,5};
   create(a);
   arrange(head);
   print(head);
  }
}

