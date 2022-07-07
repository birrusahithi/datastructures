public class isSymmetric {
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
    ListNode root;
    isSymmetric(){
        root = new ListNode(1);
    }
        public boolean isSymmetric(ListNode root) {
            return mirror(root, root);
        }
        public boolean mirror(ListNode p, ListNode q){
            if(p==null && q==null){
                return true;
            }
            if(p==null || q==null){
                return false;
            }
            return (p.val==q.val) && mirror(p.right, q.left) && mirror(p.left, q.right);
        }
    }

