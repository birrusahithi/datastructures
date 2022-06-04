public class BinaryTreePreOrder {
    Node root;

    static class Node {
        int key;
        Node left, right;

        Node(int d) {
            left = right = null;
        }
    }

    BinaryTreePreOrder() {
       this.root = new Node(0);
    }
    public void preOrder(Node node){
        if (node==null){
            return;
        }
        System.out.println(node.key);
        preOrder(node.left);
        preOrder(node.right);
    }

    public static void main(String[] args) {
        BinaryTreePreOrder obj = new BinaryTreePreOrder();
        obj.root.left = new Node(2);
        obj.root.right = new Node(3);
        obj.root.left.left = new Node(4);
        obj.root.left.right = new Node(5);


    }
}