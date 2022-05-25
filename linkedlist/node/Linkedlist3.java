package linkedlist.node;

import linkedlist.LinkedList;

public class Linkedlist3 {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            this.data = d;
            next = null;


        }
    }

    public void printlist() {
        Node n = head;
        while(n!=null){
            System.out.println(n.data+" ");
            n=n.next;
        }
    }

    public static void main(String[] args) {
        Linkedlist3 obj = new Linkedlist3();
        obj.head = new Node(2);
        Node second = new Node(2);
        obj.head.next = second;
        Node third = new Node(2);
        second.next = third;
        Node forth = new Node(4);
        third.next = forth;
        obj.printlist();
    }

}
