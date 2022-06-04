public class BinaryTreeInOrder {
    Node root;

    static class Node {
        int key;
        Node left, right;

        Node(int d) {
            key = d;
            left = right = null;
        }
    }

    BinaryTreeInOrder() {
        this.root = new Node(1);
    }

    public void inOrder(Node node) {
        if (node == null) {
            return;
        }

        inOrder(node.left);
        System.out.println(node.key);
        inOrder(node.right);
    }

    public static void main(String[] args) {
        BinaryTreeInOrder obj1 = new BinaryTreeInOrder();
        obj1.root.left = new Node(2);
        obj1.root.right = new Node(3);
        obj1.root.left.left = new Node(4);
        obj1.root.left.right = new Node(5);
        obj1.inOrder(obj1.root);


    }
}
