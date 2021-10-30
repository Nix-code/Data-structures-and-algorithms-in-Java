class Insert{

  static Node head;

  static class Node{
    int data;
    Node next;

    Node(int data){
      this.data = data;
      this.next = null;
    }
  }


  static void push(int x){
    Node temp = new Node(x);
    temp.next = head;
    head = temp;
  }

  static void insertafter(Node prev, int x){
    if(prev == null){
      return;
    }
    
    Node temp = new Node(x); 
    temp.next = prev.next;
    prev.next = temp;
  }

  static void append(int x){
    Node temp = new Node(x);
    if(head == null){
      head = temp;
      return;
    }
    
    // head.next = null here 
    temp.next = null;

    Node last = head;

    while(last.next!=null){
      last = last.next;

    }

    last.next = temp;
    return;
  }

  static void print(){
    Node t = head;
    while(t!=null){
      System.out.print(t.data+" ");
      t = t.next;
    }
  }

  public static void main(String[] args) {
    Insert l = new Insert();
    l.push(4);
    l.push(5);
    l.insertafter(head.next, 23);
    l.push(6);
    l.append(56);
    l.print();
  }
}
