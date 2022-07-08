public class RemoveGivenElement {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int d){
            this.val=d;
            next = null;
        }
    }
    ListNode head;
    RemoveGivenElement(){
        head = new ListNode(1);
    }
        public ListNode removeElements(ListNode head, int val) {
            ListNode temp = new ListNode(0);
            temp.next = head;
            ListNode current = head, prev = temp;
            while(current != null){
                if(current.val==val) prev.next = current.next;
                else prev = current;
                current = current.next;

            }
            return temp.next;
        }
    public static void main(String[] args) {
        RemoveGivenElement obj = new RemoveGivenElement();
        int[] arrs = {1, 2, 6, 3, 4, 5, 6};
        ListNode temp = obj.head;
        for (int i = 0; i < arrs.length; i++) {
            temp.next = new ListNode(arrs[i]);
            temp = temp.next;
        }
    }
    }

