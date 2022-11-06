package Binary_Tree;
/* 199. Binary Tree Right Side View
        Given the root of a binary tree, imagine yourself standing on the right side of it, return the values of the nodes you can see ordered from top to bottom.
        Input: root = [1,2,3,null,5,null,4]
        Output: [1,3,4]*/
public class BinaryTreeRightSideView {
    public List<Integer> rightSideView(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> listing = new ArrayList<>();
        if(root==null){
            return listing;
        }
        Queue<TreeNode> queu = new LinkedList<>();
        queu.add(root);
        int level =0;
        while(!queu.isEmpty()){
            int size= queu.size();
            list.add(new ArrayList<Integer>());
            for(int i=0; i<size; i++){
                TreeNode temp = queu.remove();
                list.get(level).add(temp.val);
                if(temp.left!=null){
                    queu.add(temp.left);
                }
                if(temp.right!=null){
                    queu.add(temp.right);
                }
            }
            level++;
        }
        List<Integer> result = new ArrayList<>();
        for(int i=0; i<list.size(); i++){
            List<Integer> temp = list.get(i);
            result.add(temp.get(temp.size()-1));

        }
        return result;
    }
}
