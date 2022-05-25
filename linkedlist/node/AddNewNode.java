package linkedlist.node;

public class AddNewNode {
    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            this.data = d;
            this.next = null;

        }
    }


            public void insert ( int new_data){

                Node new_node = new Node(2);
                if (head == null) {
                    head = new Node(2);
                    return;

                }
                new_node.next = null;
                Node n1 = head;
                while (n1.next != null) {
                    n1 = n1.next;
                    n1.next = new_node;
                    return;


                }
            }
        public static void main(String[] args) {
AddNewNode abc = new AddNewNode();
abc.insert(2);
        }
    }
