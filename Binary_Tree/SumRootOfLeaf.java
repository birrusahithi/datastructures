package Binary_Tree;
/*
129. Sum Root to Leaf Numbers
        You are given the root of a binary tree containing digits from 0 to 9 only.

        Each root-to-leaf path in the tree represents a number.

        For example, the root-to-leaf path 1 -> 2 -> 3 represents the number 123.
        Return the total sum of all root-to-leaf numbers. Test cases are generated so that the answer will fit in a 32-bit integer.

        A leaf node is a node with no children.

        Input: root = [1,2,3]
        Output: 25
        Explanation:
        The root-to-leaf path 1->2 represents the number 12.
        The root-to-leaf path 1->3 represents the number 13.
        Therefore, sum = 12 + 13 = 25.
*/
public class SumRootOfLeaf {
    int result =0;
    public int sumNumbers(TreeNode root) {
        sum(root, 0);
        return result;
    }
    public void sum(TreeNode temp, int current){
        if(temp!=null){
            current = current*10+temp.val;
            if(temp.left==null && temp.right==null){
                result +=current;
            }
            sum(temp.left, current);
            sum(temp.right, current);
        }
    }
}
