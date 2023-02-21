boolean hasCycle(Node head){
        if(head == null){return false;}
        Node slow = head;
        Node fast = head.next;
        while(fast != slow){
            if(fast == null || fast.next == null){return false;}
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }