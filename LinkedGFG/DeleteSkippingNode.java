
public class DeleteSkippingNode{

  static class Node{

    int data;
    Node next;

    // constructor 

    Node(int data){
      this.data = data;
      this.next = null;
    }
  }

  static Node head;

  static void create(int a[]){
    Node last,t;
    head = new Node(a[0]);
    last = head;
    for(int i = 1; i <a.length; i++){
      
      t = new Node(a[i]);
      last.next = t;
      last = t;
    }
  }

  static void print(Node head){
    while(head!=null){
      System.out.print(head.data+" ");
      head = head.next;
    }
  }

  static void deleteMe(Node head, int m, int n){
    
    Node curr = head,t;
    int count;

    // main loop
    while(curr!=null){
     // for skip

      for(count = 1; count <m && curr!=null; count++){
        curr = curr.next;
        
      }
      if(curr == null){
        return;
      }

      t = curr.next;
      // for deletion 

      for(count = 1; count <=n && t!=null; count++){
        Node temp = t;
        t = t.next;
      }
      curr.next = t;
      curr = t;
    }
  }
  public static void main(String[] args) {
    int a[] = {1,3,4,5,6,7,1,2,4,6,7};
    create(a);
  
    deleteMe(head,2,1);
    print(head);
  }
}
