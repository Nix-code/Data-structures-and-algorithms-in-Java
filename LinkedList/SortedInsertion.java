public class SortedInsertion{
  
  static Node first;
  static class Node{

    int data;
    Node next;

    Node(int data){
      this.data = data;
      this.next = next;

    }

  }

  static void create(int a[]){
    Node last,t;
    first = new Node(a[0]);

    last = first;

    for(int i = 1; i <a.length; i++){
      t = new Node(a[i]);

      last.next = t;
      last = t;
    }
  }
    static Node sortedInsert(Node head, int key) {
        // Add your code here.7\
        Node node = new Node(key);
       if (head == null || head.data >= node.data)
        {
            node.next = head;
            head = node;
            return head;
        }
 
       
        Node current = head;
        while (current.next != null && current.next.data < node.data) {
            current = current.next;
        }
 
        node.next = current.next;
        current.next = node;
 
        return head;
}

  static int isSort(Node n){
    int max = -535353;

    while(n!=null){

      if(n.data < max){
        return -1;
      }
      max = n.data;
      n = n.next;
    }
    return 1;
    }

  static void display(Node n){
    if(n!=null){
      System.out.print(n.data+" ");
      display(n.next);
    }
  }

  public static void main(String[] args) {
    int a[] = {10,20,30,40,5};

    create(a);
    sortedInsert(first, 15);

    display(first);
    System.out.println();
    System.out.println(isSort(first));
  }
}
