package linkedlist.node;

public class SumOfData {
    Node Head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            this.data = d;
            this.next = null;
        }

    }

    public Node addTwoNumbers(Node l1, Node l2) {
        Node dummy = new Node(0);
        Node p = l1;
        Node q = l2;
        Node current = dummy;
        int carry = 0;
        while (p != null || q != null) {
            int x = 0;
            int y = 0;
            if (p != null) {
                x = p.data;
            } else {
                x = 0;
            }
            if (q!=null){
                y = q.data;
            }
            else{
                y = 0;
            }
            int sum = carry + x + y;
            current.next = new Node(sum%10);
            carry = sum/10;
            current = current.next;
            if(p!=null){
                p = p.next;
            }
            if (q != null) {

                q=q.next;
            }

        }
        if (carry>0){
            current.next = new Node(carry);
        }


        return current;

    }


    public static void main(String[] args) {

    }
}
