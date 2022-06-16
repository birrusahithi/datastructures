import java.util.ArrayList;
import java.util.List;

public class MergeLinkedLists {
    static class ListNode {
        int key;
        ListNode next;

        ListNode(int d) {
            this.key = d;
            this.next = null;
        }
    }

    ListNode head;

    MergeLinkedLists() {
        head = new ListNode(0);
    }

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        }
        if (lists.length == 1) {
            return lists[0];
        }
        ListNode ans = mergelist(lists[0], lists[1]);
        for (int i = 2; i < lists.length; i++) {
            ans = mergelist(ans, lists[i]);
        }
        return ans;
    }

    public ListNode mergelist(ListNode first, ListNode second) {
        ListNode head = new ListNode(0);
        ListNode result = head;
        while (first != null && second != null) {
            if (first.key < second.key) {
                result.next = first;
                result = result.next;
                first = first.next;
            } else {
                result.next = second;
                result = result.next;
                second = second.next;
            }
        }
        if (first == null) {
            result.next = second;
        }
        if (second == null) {
            result.next = first;
        }
        return head.next;
    }

    public void print(ListNode node) {
        while (node != null) {
            System.out.println(node.key);
            node = node.next;
        }
    }

    public static void main(String[] args) {
        MergeLinkedLists obj = new MergeLinkedLists();
        List<List<ListNode>> list = new ArrayList<>();
        ListNode[] array = new ListNode[3];
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(3);
        l1.next.next = new ListNode(6);
        l1.next.next.next = new ListNode(10);
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(4);
        l2.next.next = new ListNode(7);
        ListNode l3 = new ListNode(8);
        l3.next = new ListNode(13);
        array[0] = l1;
        array[1] = l2;
        array[2] = l3;
        ListNode answer = obj.mergeKLists(array);
        obj.print(answer);

    }
}

