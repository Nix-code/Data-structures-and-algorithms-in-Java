import java.io.*;

public class LengthOfLoop{

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
  static int count(Node n){
    int res = 1;

    Node temp = n;
    while(temp.next!=n){
      res++;
      temp = temp.next;
    }
    return res;
  }

  static int countNode(Node list){
    Node slow = list,fast = list;

    while(slow!=null && fast!=null && fast.next!=null){
      slow = slow.next;
      fast = fast.next.next;

      if(slow == fast){
        return count(slow);
      }
    }
    return 0;
  }

  public static void main(String[] args) {
   int a[] = {1,3,4,5,6,7};

   create(a);

   first.next.next.next = first.next;
   System.out.println(countNode(first));
  }
}
