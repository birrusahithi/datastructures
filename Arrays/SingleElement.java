import java.util.HashMap;
import java.util.Map;

public class SingleElement {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int singleElement =0;
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }
            else{
                map.put(nums[i], 1);
            }
        }
        for(Map.Entry<Integer, Integer> me : map.entrySet()){
            if(me.getValue()==1){
                singleElement = me.getKey();
            }
        }
        return singleElement;
    }
}
