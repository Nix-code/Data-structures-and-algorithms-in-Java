public class SwapinPairs{
  static class Node{
    int data;
    Node next;
    Node(int data){
      this.data = data;
      this.next = null;
    }
  }

  static Node first;
  static void create(int a[]){
    Node last, t;
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

  static Node pairs(Node head){

  if (head == null || head.next == null) {
            return head;
        }
 
        Node curr = head, prev = null;
 
        
        while (curr != null && curr.next != null)
        {
            Node temp = curr.next;
            curr.next = temp.next;
            temp.next = curr;
 
            if (prev == null) {
                head = temp;
            }
            else {
                prev.next = temp;
            }
 
            prev = curr;
            curr = curr.next;
        }
 
        return head;  
  }
  public static void main(String[] args) {
    int a[] = {1,2};
    create(a);

    pairs(first);

    print(first);
  }

}
