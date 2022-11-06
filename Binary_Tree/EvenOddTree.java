package Binary_Tree;
/*
1609. Even Odd Tree
A binary tree is named Even-Odd if it meets the following conditions:

        The root of the binary tree is at level index 0, its children are at level index 1, their children are at level index 2, etc.
        For every even-indexed level, all nodes at the level have odd integer values in strictly increasing order (from left to right).
        For every odd-indexed level, all nodes at the level have even integer values in strictly decreasing order (from left to right).
        Given the root of a binary tree, return true if the binary tree is Even-Odd, otherwise return false.
        Input: root = [1,10,4,3,null,7,9,12,8,6,null,null,2]
        Output: true
        Explanation: The node values on each level are:
        Level 0: [1]
        Level 1: [10,4]
        Level 2: [3,7,9]
        Level 3: [12,8,6,2]
        Since levels 0 and 2 are all odd and increasing and levels 1 and 3 are all even and decreasing, the tree is Even-Odd.
*/

public class EvenOddTree {
    public boolean isEvenOddTree(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if(root==null){
            return false;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int level =0;
        while(!queue.isEmpty()){
            int size = queue.size();
            list.add(new ArrayList<Integer>());
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
        for(int i=0; i<list.size(); i++){
            List<Integer> temp = list.get(i);
            if(i%2==0){
                int number = Integer.MIN_VALUE;
                int left =0;
                int right = temp.size();
                while(left<right){
                    if(temp.get(left)%2!=0){
                        if(temp.get(left)<=number){
                            return false;
                        }else{
                            number = temp.get(left);
                        }
                    }else{
                        return false;
                    }
                    left++;
                }
            }else{
                int number = Integer.MAX_VALUE;
                int left =0;
                int right = temp.size();
                while(left<right){
                    if(temp.get(left)%2==0){
                        if(temp.get(left)>=number){
                            return false;
                        }else{
                            number = temp.get(left);
                        }
                    }else{
                        return false;
                    }
                    left++;
                }
            }
        }
        return true;
    }
}
}
