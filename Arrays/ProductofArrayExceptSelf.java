public class ProductofArrayExceptSelf {
        public int[] productExceptSelf(int[] nums) {
            int n = nums.length;
            int[] array = new int[n];
            array[0]=1;
            for(int i=1; i<nums.length; i++){
                array[i] = nums[i-1] * array[i-1];
            }
            int right =1;
            for(int j=n-1; j>=0; j--){
                array[j]=array[j]*right;
                right = right* nums[j];
            }
            return array;
        }
}
