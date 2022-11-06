package Binary_Tree;
/*1161. Maximum Level Sum of a Binary Tree
        Given the root of a binary tree, the level of its root is 1, the level of its children is 2, and so on.

        Return the smallest level x such that the sum of all the values of nodes at level x is maximal.
        Input: root = [1,7,0,7,-8,null,null]
        Output: 2
        Explanation:
        Level 1 sum = 1.
        Level 2 sum = 7 + 0 = 7.
        Level 3 sum = 7 + -8 = -1.
        So we return the level with the maximum sum which is level 2.*/
public class MaximumLevelSum {
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        if(root==null){
            return 0;
        }
        queue.add(root);
        List<List<Integer>> list = new ArrayList<>();
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
        List<Integer> rs = list.get(0);
        int total = rs.get(0);
        int result = 1;
        for(int k=1; k<list.size(); k++){
            int number=0;
            List<Integer> temp = list.get(k);
            for(int j=0; j<temp.size(); j++){
                number += temp.get(j);
            }
            if(number>total){
                total = number;
                result =k+1;
            }
        }
        return result;
    }
}
