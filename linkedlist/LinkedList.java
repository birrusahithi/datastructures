package linkedlist;

import linkedlist.node.Node;

import java.sql.SQLOutput;

public class LinkedList {
    public static void main(String [] args){
        Node obj = new Node(4);
        Node head = obj;
        obj.next = new Node(10);
        obj = obj.next;
        obj.next = new Node(15);
        obj = obj.next;
        obj.next = new Node(18);
//        obj = obj.next;
//        obj.next = head;
        // head = 4 -> 10 ->15 ->18
        // temp = 4 -> 10 -> 15 -> 18
        // 4 -> 10 -> 15 -> 18 -> null
            Node temp = head;
            while (temp != null) {
                if (temp.data == 10){
                    System.out.println("S");
                }
                temp = temp.next;
            }

        /**
         * obj  = {
         *     data = 4;
         *     next = null;
         * }
         *
         * head = {
         *     data = 4;
         *     next = null;
         * }
         *
         * obj = {
         *     data = 4;
         *     next = {
         *         data = 10;
         *         next = null;
         *     }
         * }
         *
         * head = {
         *     data = 4;
         *     obj = next = {
         *         data = 10;
         *         next = {
         *
         *         };
         *     }
         * }
          */
    }
}

