public class Segregate{
  static class Node{
    int data;
    Node next;

    Node(int data){
      this.data = data;
      this.next = next;
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
  static void display(Node n){
    if(n!=null){
      System.out.print(n.data+" ");
      display(n.next);
    }
  }
  static void sep(int N, Node n){

    Node p1 = n;
    Node p2 = n;
    while(p2.next!=null && p2.next.next!=null){
      p1 = p1.next;
      p2 = p2.next.next;
    }
    Node prem = p1;
    Node prec = p1.next;
    while(prec.next!=null){
      Node current = prec.next;
      prec.next = current.next;
      current.next = prem.next;
      prem.next = current;
    }
      p1 = first;
      p2 = prem.next;

    while(p1!=prem){
      prem.next = p2.next;
      p2.next = p1.next;
      p1.next = p2;
      p1 = p2.next;
      p2 = prem.next;
    }


      }
  public static void main(String[] args) {
    int a[] = {105};
    create(a);
    sep(a.length, first);
    display(first);
  }
}
