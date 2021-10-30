public class Intersection{

    
    // push in a list 

    void push(int x){

        Node new_node = new Node(x);
        new_node.next = head;
        head = new_node;
    }

    boolean isPresent(Node head, int data){

        Node t = head;

        while(t!=null){

            if(t.data == data){
                return truel
            }
            t = t.next;
        }
        return false;
    }


    static void getIntersect(Node head1, Node head2){

        Node res = null;
        Node t1 = head1;


        while(t1!=null){

            if(isPresent(head2, t1.data)){
                push(t1.data);
            }
            t1 = t1.next;
        }
    }
}
