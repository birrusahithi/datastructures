public class MaxDepthBinaryTree {
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
  MaxDepthBinaryTree(){
        root = new ListNode(1);
    }
        int currentheight;
        public int maxDepth(ListNode root) {
            if(root==null){
                return 0;
            }else{
                int leftheight = maxDepth(root.left);
                int rightheight = maxDepth(root.right);
                currentheight = Math.max(leftheight, rightheight)+1;

            }
            return currentheight;
        }

    }
