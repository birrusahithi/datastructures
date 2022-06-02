public class RunningSum {

    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int current = 0;
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            current = current + nums[i];
            res[i] = current;

        }
        return res;
    }
}
