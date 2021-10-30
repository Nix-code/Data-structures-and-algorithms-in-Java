import java.util.*;
public class PalindromeLinkedList{

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

  static boolean ispalin(Node n){
    Node temp = n;

    Stack<Integer> st = new Stack<>();

    boolean f = true;
    while(temp!=null){
      st.push(temp.data);
      temp = temp.next;
    }
    
    while(n!=null){
      int i = st.pop();
      if(n.data == i){
        f = true;
      }
      else{
        f = false;
        break;
      }
      n = n.next;
    }
    return f;
  }

  static void print(Node n){
    while(n!=null){
      System.out.print(n.data+" ");
      n = n.next;
    }
  }
  public static void main(String[] args) {
   int a[] = {1,2,1};
   create(a);

   System.out.println(ispalin(first));
  }
}
