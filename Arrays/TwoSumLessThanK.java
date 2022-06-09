public class TwoSumLessThanK {
    public int twoSumLessThanK(int[] nums, int k) {
        int maxsum=-1;
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                int num = nums[i]+nums[j];
                if(num<k){
                    maxsum = Math.max(maxsum, num);
                }
            }
        }
        return maxsum;
    }
}

