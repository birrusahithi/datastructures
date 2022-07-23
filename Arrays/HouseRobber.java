public class HouseRobber {
        public int rob(int[] nums) {
            int n = nums.length;
            int prev = 0;
            int next = nums[n-1];
            for(int i=n-2; i>=0; i--){
                int current = Math.max(prev+nums[i], next);
                prev = next;
                next = current;

            }
            return next;
        }
    }
