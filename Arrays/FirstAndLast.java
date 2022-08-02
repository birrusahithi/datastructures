public class FirstAndLast {
    public int[] firstAndLast(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int[] arr = {-1, -1};
        int med = -1;
        while (left <= right) {
            med = left + (right - left) / 2;
            if (nums[med] == target) {
                if (med == 0 || nums[med - 1] != target) {
                    arr[0] = med;
                    break;
                } else {
                    right = med;
                }
            } else if (nums[med]>target){
                right = med-1;
            }else{
                left= med+1;
            }
        }
        if(arr[0]==-1){
            return arr;
        }
        left = med;
        right = nums.length-1;
        while(left<=right){
           med = left+(right-left)/2;
           if(nums[med]==target){
               if(med==nums.length-1 || nums[med+1]!=target){
                   arr[1]=med;
                   break;
               }else{
                   left = med+1;
               }
           }else if(nums[med]>target){
               right = med-1;
           }else{
               left = med+1;
           }
        }
        return arr;
    }

    public static void main(String[] args) {
        FirstAndLast obj = new FirstAndLast();
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        obj.firstAndLast(nums, target);
    }
}
