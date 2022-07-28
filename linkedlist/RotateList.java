public class RotateList {
    public ListNode rotateRight(ListNode head, int k){
        if(head==null){
            return null;
        }
        if(head.next==null){
            return head;
        }
        ListNode current = head;
        int n=1;
        while(current.next!=null){
            current = current.next;
            n++;
        }
        current.next = head;
        ListNode rotate = head;
        for(int i=0; i<n-k%n-1; i++){
            rotate = rotate.next;
        }
        ListNode right = rotate.next;
        rotate.next = null;
        return right;
    }
}


