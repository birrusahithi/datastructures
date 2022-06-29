import java.util.ArrayList;
import java.util.List;

public class FindLeaves {
    static class TreeNode {
        int value;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.value = val;
            left = null;
            right = null;
        }
    }

    TreeNode root;

    FindLeaves() {
        root = null;
    }

    private List<List<Integer>> solution;

    private int getHeight(TreeNode root) {
        if (root == null) {
            return -1;
        }
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);

        int currHeight = Math.max(leftHeight, rightHeight) + 1;

        if (this.solution.size() == currHeight) {
            this.solution.add(new ArrayList<>());
        }

        this.solution.get(currHeight).add(root.value);

        return currHeight;
    }

    public List<List<Integer>> findLeaves(TreeNode root) {
        this.solution = new ArrayList<>();

        getHeight(root);
        System.out.println(solution);
        return this.solution;
    }

    public static void main(String[] args) {
        FindLeaves obj = new FindLeaves();
        obj.root = new TreeNode(1);
        obj.root.left = new TreeNode(2);
        obj.root.right = new TreeNode(3);
        obj.root.left.left = new TreeNode(4);
        obj.root.left.right = new TreeNode(5);
        obj.findLeaves(obj.root);
    }
}

