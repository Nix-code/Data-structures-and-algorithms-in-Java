class AddoneList 
{
    public static Node addOne(Node head) 
    { 
       head = reverse(head);


        head = addOneUtil(head);


        return reverse(head);
           
    }
    
 static Node addOneUtil(Node head){

        Node res = head;
        Node temp = null, prev = null;
        
        int carry = 1, sum;
        
        while (head != null) 
        {
       
        sum = carry + head.data;
        
        carry = (sum >= 10) ? 1 : 0;
        
        sum = sum % 10;
        
        head.data = sum;
        
        temp = head;
        head = head.next;
        }
        
    
        if (carry > 0)
        temp.next = new Node(carry);
    
        return res;
}


    
    static Node reverse(Node head){
        Node p = head;
        Node q = null;
        Node r = null;
        
        while(p!=null){
            r = q;
            q = p;
            p = p.next;
            q.next = r;
        }
        head = q;
        return head;
    }
}

