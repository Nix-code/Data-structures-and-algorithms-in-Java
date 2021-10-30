 
import java.util.*;


public class DeleteNode 
{
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
    Node last,t;
    first =new Node(a[0]);
    last = first;

    for(int i = 1; i <a.length; i++){

      t = new Node(a[i]);
      last.next = t;
      last = t;
    }
  }

  static void print(Node n){
    while(n!=null){
      System.out.print(n.data+"\t");
      n = n.next;
    }
  }

  static int Length(Node n){
    int c = 0;
    while(n!=null){
      c++;
      n = n.next;
    }
    return c;
  }
  
static Node deleteNode(Node first, int x){

	    Node n = first;
	    Node q = null;
	    
	    if(x < 1){
	        return null;
	    }
	    
	    if(x == 1){
	        q = first;
	        first= first.next;
	        return first;
	    }
	    else{
	        for(int i = 0; i <x-1;i++){
	            q = n;
	            n= n.next;
	        }
	        q.next = n.next; 
	    }
	    return first;
    }
 
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
      int n = 4;

      int a[] = {1,6,3,9};

         create(a);
      
      deleteNode(first, 2);
      print(first);

  }
}



