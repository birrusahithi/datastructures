package linkedlist.node;

public class DeleteGivenPosition {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            this.data = d;
            this.next = null;
        }
    }

    //inserting node at front position
    public void insertNewNode(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    public void deleteNode(int position) {
        //to find the list is empty
        if (head == null) {
            return;
        }
        //if head needs to be removed
        Node temp = head;
        if (position == 0) {
            head = temp.next;
            return;
        }
        //Find previous node of the node to be deleted
        for (int k = 0; temp != null && k < position - 1; k++) {
            temp = temp.next;
        }
        //if position is more than nodes
        if (temp == null || temp.next == null) {
            return;
        }
    }
}
