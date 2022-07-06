import java.util.HashMap;
import java.util.Map;

class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i])+1);
                if(map.get(nums[i])>1){
                    return true;
                }
            }else{
                map.put(nums[i], 1);
            }
        }
        return false;
    }
}