public class AddTwoList{
  static class Node{

    int data;
    Node next;

    Node(int data){
      this.data = data;
      this.next = null;
    }
  } 


 static Node addTwoLists(Node first, Node second){
        // code here
        // return head of sum list
    first = reverse(first);
    second = reverse(second);
    Node res = null;
    Node prev = null;

    Node temp = null;

    int carry = 0, sum;

    while(first!=null || second !=null){

      sum = carry+(first!=null? first.data: 0) + (second!=null ? second.data:0);

      carry = (sum >=10)?1:0;

      // update it
      sum = sum%10;

      temp = new Node(sum);

      if(res == null){
        res = temp;
      }
      else{
        prev.next = temp;
      }
      prev = temp;

      if(first!=null){
        first = first.next;
      }
      if(second!=null){
        second = second.next;
      }

    }
    if(carry >0){
      temp.next = new Node(carry);
    }
    res = reverse(res);
    return res;

    }
    
    static Node reverse(Node head){
        Node r = null;
        Node q = null;
        Node p = head;
        while(p!=null){
            r = q;
            q = p;
            p = p.next;
            q.next = r;
        }
        head = q;
        return head;
    }}
