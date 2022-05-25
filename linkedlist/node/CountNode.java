package linkedlist.node;

class CountNode {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            this.data = d;
            this.next = null;
        }
    }

    //adding a node in the front of head
    public void addNode(int new_data) {
        Node new_Node1 = new Node(new_data);
        new_Node1.next = head;
        head = new_Node1;
    }

    public void addNode1(int new_data) {
        Node new_node2 = new Node(new_data);
        new_node2.next = null;
        Node temp1 = head;
        while (temp1.next != null) {
            temp1 = temp1.next;

        }
        temp1.next = new_node2;
        return;
    }

    public int getCount() {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;

        }
        return count;
    }

    public int getCountRec(Node node_count) {
        if (node_count == null) {
            return 0;
        }

            return 1 + getCountRec(node_count.next);

    }


    public static void main(String[] args) {
        CountNode abc = new CountNode();
        abc.addNode(4);
        abc.addNode(3);
        abc.addNode(2);
        abc.addNode(1);
        abc.addNode1(5);
        System.out.println("count of the nodes:" + " " + abc.getCount());
        Node temp = abc.head;
        while (temp != null) {
            System.out.println("data of the node" + " " + temp.data);
            temp = temp.next;
        }
    }
}
