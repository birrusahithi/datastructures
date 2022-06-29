import java.util.List;

public class PalindromeLinkedList {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int k) {
            this.val = k;
            this.next = null;
        }
    }

    ListNode head;

    public boolean isPalindrome(ListNode head) {
        if (head == null) {
            return true;
        }
        ListNode firstHalf = endoffirstHalf(head);
        ListNode secondHalf = reverseSecond(firstHalf.next);
        ListNode p1 = head;
        ListNode p2 = secondHalf;
        boolean result = true;
        while (result && p2 != null) {
            if (p1.val != p2.val) {
                return false;
            }
            p1 = p1.next;
            p2 = p2.next;
        }
        firstHalf.next = reverseSecond(secondHalf);
        return result;
    }

    public ListNode reverseSecond(ListNode head) {
        ListNode current = head;
        ListNode prev = null;
        while (current != null) {
            ListNode temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }
        return prev;
    }

    public ListNode endoffirstHalf(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;

        }
        return slow;
    }

    public static void main(String[] args) {
        PalindromeLinkedList obj = new PalindromeLinkedList();
        ListNode current = obj.head = new ListNode(1);
        ListNode temp = current;
        int[] array = {1, 2, 3, 4, 3, 2, 1};
        for (int i = 0; i < array.length; i++) {
            temp = new ListNode(array[i]);
            temp = temp.next;
        }
        obj.isPalindrome(current);

    }
}