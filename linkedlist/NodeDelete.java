package linkedlist;

public class NodeDelete {
    class Node{
        int data;
        Node next;
        Node(int d){
            this.data=d;
           this.next=null;
        }
    }
    Node head;
    public void deleteNode(Node n1){
        Node temp =head;
        Node prev=null;
        while(temp!=null&temp!=n1){
            prev =temp;
            temp = temp.next;

        }

    }
}
