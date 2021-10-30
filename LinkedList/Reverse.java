public class Reverse{
  static Node first;
  static class Node{

    int data;
    Node next;

    Node(int data){
      this.data =data;
      this.next = null;
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

  static void reverse(Node p){
    int b[] = new int[6];
    Node q = p;

    int i = 0;
    while(q!=null){
      b[i] = q.data;
      q = q.next;
      i++;
    }
    q = p;
    i--;
    while(q!=null){

      q.data = b[i];
      q = q.next;
      i--;
    }

  }
  static void print(Node n){
    while(n!=null){
      System.out.println(n.data);
      n = n.next;
    }
  }
  public static void main(String[] args) {

    int a[] = {1,2,4};
    create(a);
    
    reverse(first);
    print(first);
  }
}
