public class BinarySearchTree {

        public int search(int[] nums, int target) {
            int left =0;
            int right = nums.length-1;
            int med =0;
            while(left<=right){
                med = left + (right-left)/2;
                if(nums[med]==target){
                    return med;
                }
                if(target< nums[med]){
                    right = med-1;
                }
                else {
                    left = med+1;
                }
            }
            return -1;
        }
    }


