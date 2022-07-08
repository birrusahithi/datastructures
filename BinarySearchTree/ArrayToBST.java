public class ArrayToBST {
    int[] nums;
    static class ListNode{
        int val;
        ListNode left;
        ListNode right;
        ListNode(int d){
            this.val=d;
            this.left = null;
            this.right = null;
        }
    }
    ListNode root;
    public ListNode sortedArrayToBST(int[] nums) {
        this.nums = nums;
        return divide(0, nums.length-1);
    }
    public ListNode divide(int left, int right){
        if(left>right){
            return null;
        }
        int med = left + (right-left)/2;
        ListNode root = new ListNode(nums[med]);
        root.left = divide(left, med-1);
        root.right =divide(med+1, right);
        return root;
    }
}

