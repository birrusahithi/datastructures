package linkedlist.node;

public class DeleteNode {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            this.data = d;
            this.next = null;
        }
    }

    public void deleteNode(int key) {
        Node temp = head, prev = null;
        if (temp != null && temp.data == key) {
            head = temp.next;
            return;
        }
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }
        if (temp == null) {
            return;
        }
        prev.next = temp.next;
    }

    public void deleteRecursive(int key, Node abc) {
        if(abc.data==key){

        }

    }

    public void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    public Node push1(int new_data) {
        Node new_node1 = new Node(new_data);
        new_node1.next = null;
        Node temp1 = head;
        Node prev = null;
        if (head == null) {
            head = new_node1;
            return new_node1;
        }
        while (temp1 != null) {
            prev = temp1;
            temp1 = temp1.next;

        }
        prev.next = new_node1;
        return new_node1;
    }

    public void recursive() {
        System.out.println("Sahithi");
        recursive();
    }

    public void push2(int new_data, Node prev) {
        Node new_node = new Node(new_data);
        new_node.next = prev.next;
        prev.next = new_node;

    }

    public void printList() {
        Node tnode = head;
        while (tnode != null) {
            System.out.println(tnode.data + " ");
            tnode = tnode.next;
        }
    }


    public static void main(String[] args) {
        DeleteNode obj = new DeleteNode();
        obj.push1(105);
        obj.push1(543);
        Node n3 = obj.push1(211);
        obj.push1(43);
        //obj.push2(5, n3);
        System.out.println("created list");
        obj.printList();
        obj.deleteNode(211);
        System.out.println("deleted node");
        obj.printList();

    }
}
