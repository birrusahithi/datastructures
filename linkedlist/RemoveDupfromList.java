class RemoveDupfromList{
   static class ListNode{
        int val;
        ListNode next;
        ListNode(int d){
            this.val=d;
            this.next = null;
        }
    }
    ListNode head;
    RemoveDupfromList(){
        head = new ListNode(1);
    }
        public ListNode deleteDuplicates(ListNode head) {
            ListNode current = head;
            while(current!=null && current.next!=null){
                if(current.val == current.next.val){
                    current.next = current.next.next;
                }else{
                    current = current.next;
                }
            }
            return head;
        }
        public static void main(String[] args){
        RemoveDupfromList obj = new RemoveDupfromList();
        obj.head.next = new ListNode(1);
        obj.head.next.next = new ListNode(2);
            obj.head.next.next.next = new ListNode(2);
obj.deleteDuplicates(obj.head);
        }

}
