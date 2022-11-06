package Binary_Tree;

import java.util.Collections;

/*107. Binary Tree Level Order Traversal II
        Given the root of a binary tree, return the bottom-up level order traversal of its nodes' values. (i.e., from left to right, level by level from leaf to root).
        Input: root = [3,9,20,null,null,15,7]
        Output: [[15,7],[9,20],[3]]*/
public class LevelOrderTraversalII {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if(root==null){
            return list;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int level =0;
        while(!queue.isEmpty()){
            list.add(new ArrayList<Integer>());
            int size = queue.size();
            for(int i=0; i<size; i++){
                TreeNode temp = queue.remove();
                list.get(level).add(temp.val);
                if(temp.left!=null){
                    queue.add(temp.left);
                }
                if(temp.right!=null){
                    queue.add(temp.right);
                }
            }
            level++;
        }
        Collections.reverse(list);
        return list;
    }
}

