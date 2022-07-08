import java.util.ArrayList;
import java.util.List;

public class PostOrder {
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
    PostOrder(){
        root = new ListNode(1);
    }
        List<Integer> list = new ArrayList<>();
        public List<Integer> postorderTraversal(ListNode root) {
            if(root==null){
                return list;
            }
            postorderTraversal(root.left);
            postorderTraversal(root.right);
            list.add(root.val);
            return list;
        }
    }

