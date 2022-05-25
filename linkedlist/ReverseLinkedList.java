import java.util.List;

public class ReverseLinkedList {
    Node head;
    static class Node{
        int data;
        Node next;
        public Node(int d){
this.data=d;
this.next = null;
        }
    }
    public Node reverseList(Node head){
        Node prev = null;
        Node fast = head;
        while(fast!=null){
            Node temp = fast.next;
            fast.next = prev;
            prev = prev.next;
            fast= temp;
        }
        return prev;
    }
    public static void main(String[] args){
        ReverseLinkedList obj = new ReverseLinkedList();
        Node new_node = new Node(1);

    }
}
