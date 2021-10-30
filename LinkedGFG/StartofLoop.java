import java.io.*;

public class StartofLoop{

  static Node first;
  static class Node{
    int data;
    Node next;

    Node(int data){
      this.data = data;
      this.next = null;
    }
  }

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

  static Node detectLoop(Node n){
    Node slow = n;
    Node fast = n;

    while(slow!=null && fast!=null && fast.next!=null){
      slow = slow.next;
      fast = fast.next.next;

      if(slow == fast){
        return slow;
      }
    }
    return null;
  }

  static Node  point(Node head){
    Node meet = detectLoop(head);

    Node start = head;

    Node prev = null;
    while(start!=meet){

      start = start.next;
      meet = meet.next;
    }
    return start;

  }

  

  public static void main(String[] args) {
   int a[] = {1,3,4,5,6,7};

   create(a);

   first.next.next.next = first.next;
   Node k = point(first);
   System.out.println(k.data);

  }
}

