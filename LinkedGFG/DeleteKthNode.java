import java.util.*;

public class DeleteKthNode{

 
    static Node head;

    static class Node{
      int data;
      Node next;

      Node(int data){
        this.data =data;
        this.next = null;
      }
    }

    static void create(int a[]){
      
      Node last, t;
      head = new Node(a[0]);
      last = head;

      for(int i = 1; i <a.length; i++){
        t = new Node(a[i]);
        last.next = t;
        last = t;
      }
    }
    
    static Node firstNode(Node n){

      while(n!=null){
        Node next = n.next;
        n = next;
      }
      return n;
    }

    static Node remkth(Node head, int k){

      if(head == null){
        return null;
      }

      if(k==1){
        head = firstNode(head);
        return null;
      }

      Node temp = head, prev = null;

      int c = 0;

      while(temp!=null){
        c++;

        if(k == c){
          prev.next = temp.next;
          
          c = 0;
        }

        if(c!=0){
          prev = temp;
        }

        temp = prev.next;
      }
      return head;
    }


    
    static void display(Node n){
      while(n!=null){
        System.out.print(n.data+" ");
        n = n.next;
      }
    }
  public static void main(String[] args) {
   
    int a[] = {1,2,3,4,5,6,7,8,9};
    create(a);
    remkth(head,2);
    display(head);
  }
}
