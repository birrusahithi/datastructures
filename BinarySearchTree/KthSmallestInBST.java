import javax.swing.tree.TreeNode;
import java.util.PriorityQueue;

public class KthSmallestInBST {
        PriorityQueue<Integer> pq;
        public int kthSmallest(TreeNode root, int k) {
            pq = new PriorityQueue<>((n1, n2) ->n2-n1);
            TreeNode current = root;
            return check(current, k, pq);
        }
        public int check(TreeNode root, int k, PriorityQueue<Integer> pq){
            TreeNode current = root;
            if(current==null){
                return 0;
            }
            pq.add(current.val);
            if(pq.size()>k){
                pq.poll();
            }
            check(current.left, k, pq);
            check(current.right, k, pq);
            return pq.peek();
        }
    }
