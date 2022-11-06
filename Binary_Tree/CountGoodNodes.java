package Binary_Tree;
/*1448. Count Good Nodes in Binary Tree
        Given a binary tree root, a node X in the tree is named good if in the path from root to X there are no nodes with a value greater than X.

        Return the number of good nodes in the binary tree.
        Input: root = [3,1,4,3,null,1,5]
        Output: 4
        Explanation: Nodes in blue are good.
        Root Node (3) is always a good node.
        Node 4 -> (3,4) is the maximum value in the path starting from the root.
        Node 5 -> (3,4,5) is the maximum value in the path
        Node 3 -> (3,1,3) is the maximum value in the path.*/
public class CountGoodNodes {
        int count = 0;
        public int goodNodes(TreeNode root) {
            int highest = root.val;
            good(root, highest);
            return count;
        }
        public int good(TreeNode root, int high){
            if(root==null){
                return 0;
            }
            if(root.val>=high){
                high = root.val;
                count++;
            }
            good(root.left, high);
            good(root.right, high);
            return count;
        }
    }

