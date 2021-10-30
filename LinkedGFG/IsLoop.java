import java.util*;
public class IsLoop{

  static class Node{
    int data;
    Node next;

    Node(int data){
      this.data = data;
      this.next = null;
    }
  }

  static Node first;
  static boolean isloop(Node h){
    HashSet<Node> hs = new HashSet<>();

    while(h!=null){
      if(hs.contains(h)){
        return true;
      }
      hs.add(h);
      h = h.next;
    }

    return false;
  }
}
