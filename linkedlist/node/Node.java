package linkedlist.node;

public class Node {
    public int data;
    public Node next;
    public boolean Node;

    public Node(int d) {
        this.data = d;
        this.next = null;
    }

    public Node(int d, Node next) {
        this.data = d;
        this.next = next;
    }

    @Override
    public String toString() {
        Node temp = this;
        StringBuilder sb = new StringBuilder();
        while (temp != null) {
            sb.append(temp.data);
            sb.append("->");
            temp = temp.next;
        }
        return sb.length() == 0 ? "" : sb.substring(0, sb.length() - 2).toString();
    }
}
