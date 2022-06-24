public class PeakElement {
        public int findPeakElement(int[] nums) {
            int left =0;
            int right =nums.length-1;
            while(left<right){
                int med = left+(right-left)/2;
                if(nums[med]>nums[med+1]){
                    right =med;
                }else{
                    left = med+1;
                }
            }
            return left;
        }
    }
