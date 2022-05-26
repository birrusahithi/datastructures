import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int remaining = target-nums[i];
            if(map.containsKey(remaining)){
                int[] arr = new int[2];
                arr[0]= map.get(remaining);
                arr[1]= i;
                return arr;
            }else{
                map.put(nums[i], i);
            }
        }
        return null;
    }
}