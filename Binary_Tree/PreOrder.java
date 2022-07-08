import java.util.ArrayList;
import java.util.List;

public class PreOrder {
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
    PreOrder(){
        root = new ListNode(1);
    }
    List<Integer> list = new ArrayList<>();
    public List<Integer> preorder(ListNode root){
        if(root==null){
            return list;
        }
        list.add(root.val);
        preorder(root.left);
        preorder(root.right);
        return list;
    }
}
