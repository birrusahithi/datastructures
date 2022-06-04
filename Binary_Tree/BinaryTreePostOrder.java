class BinaryTreePostOrder {
    Node root;

    static class Node {
        int key;
        Node left, right;

        Node(int d) {
            this.key = d;
            this.left = null;
            this.right = null;

        }
    }

    BinaryTreePostOrder() {
        this.root = new Node(0);

    }
    public void postOrder(Node node){
        if(node==null){
            return ;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.key+ " ");
    }

    public static void main(String[] args) {
        BinaryTreePostOrder tree = new BinaryTreePostOrder();
        tree.root.left = new Node(2);
        tree.root.left.right = new BinaryTreePostOrder.Node(23);
        tree.root.right = new BinaryTreePostOrder.Node(24);
        tree.root.right.left = new BinaryTreePostOrder.Node(25);
        tree.root.left.left = new BinaryTreePostOrder.Node(26);
        tree.root.right.right = new BinaryTreePostOrder.Node(27);

    }
}

