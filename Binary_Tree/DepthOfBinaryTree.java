public class DepthOfBinaryTree {
   static class Node{
        int key;
        Node left;
        Node right;
        Node(int d){
            this.key= d;
            this.left=null;
            this.right=null;
        }
    }
    Node root;
    DepthOfBinaryTree(){
        root = new Node(1);
    }
    int count;
    public int depth(Node root){
        count=0;
        countDepth(root);
        System.out.println(count);
        return count;
    }
    public int countDepth(Node root){
        if(root==null){
            return 0;
        }
        int leftPath = countDepth(root.left);
        int rightPath = countDepth(root.right);
        count = Math.max(count, leftPath+rightPath);
        return Math.max(leftPath, rightPath)+1;
    }
    public static void main (String[] args){
        DepthOfBinaryTree obj = new DepthOfBinaryTree();
        obj.root.left = new Node(2);
        obj.root.right = new Node(3);
        obj.root.left.left = new Node(4);
        obj.root.left.right = new Node(5);
        obj.root.left.left.left = new Node(6);
        obj.root.left.left.right = new Node(7);
        obj.depth(obj.root);
    }
}
