public class SameTree {
    static class ListNode{
        int val;
        ListNode left;
        ListNode right;
        ListNode(int d){
            this.val=d;
            this.left = null;
            this.right = null;
        }
    }
   ListNode head;
    SameTree(){
        head = new ListNode(1);
    }
        public boolean isSameTree(ListNode p, ListNode q) {

            if(p==null && q==null){
                return true;
            }
            if(p==null || q==null){
                return false;
            }
            if(p.val!=q.val){
                return false;
            }

            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);

        }
    }
    
