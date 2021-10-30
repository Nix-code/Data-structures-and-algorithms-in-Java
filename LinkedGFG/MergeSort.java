public class MergeSort{
  static class Node{
    int data;
    Node next;
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

  static Node sortedMerge(Node a, Node b){
    Node result = null;

    if(a == null){
      return b;
    }
    if(b == null){
      return a;
    }
    
    if(a.data<= b.data){
      result = a;
      result.next = sortedMerge(a.next, b);
    }
    else{
      result = b;
      result.next = sortedMerge(a, b.next);
    }
    return result;
  }

  static Node merge(Node h){
    if(h == null || h.next == null){
      return h;
    }
    Node middle = getMid(h);
    Node nextM = middle.next;

    middle.next = null;

    Node left = merge(h);

    Node right = merge(nextM);
    Node sort = sortedMerge(left, right);
    return sort;
  }


  static void print(Node n){
    while(n!=null){
      System.out.print(n.data+" ");
      n = n.next;
    }
  }

  static Node getMid(Node head){
    if(head == null){
      return head;
    }
    Node slow = head, fast = head;
    while(fast.next!=null && fast.next.next!=null){
       slow = slow.next;
       fast = fast.next.next;
    }
    return slow;
  }
  public static void main(String[] args) {
   int a[] = {11,3,5,73,12,4,1};
   create(a);
   head = merge(head);

   print(head);
  }
}
