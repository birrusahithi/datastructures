public class MaximumSubArray {
    public int subArray(int[] nums){
                int cursub=nums[0];
                int maxsub = nums[0];
                for(int i=1; i<nums.length; i++){
                    int num= nums[i];
                    cursub = Math.max(num, cursub+num);
                    maxsub = Math.max(maxsub, cursub);
                }
                return maxsub;
            }
        }
        