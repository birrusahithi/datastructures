import java.util.HashMap;
import java.util.Map;

public class DotProduct {
    Map<Integer, Integer> map = new HashMap<>();
    DotProduct(int[] array){
        for(int i=0; i<array.length; i++){
            if(array[i]!=0){
                map.put(i, array[i]);
            }
        }
    }
    public int product(DotProduct d){
        int result =0;
        for(Integer i: map.keySet()){
            if(d.map.containsKey(i)){
                result += d.map.get(i)*map.get(i);
            }
        }
        System.out.println(result);
        return result;
    }
    public static void main(String[] args){
        int[] array1 = {0, 1, 0, 3, 4, 0, 1, 1};
        int[] array2 = {0, 0, 2, 2, 1, 0, 0, 1};
        DotProduct obj = new DotProduct(array1);
        DotProduct obj1 = new DotProduct(array2);
        obj.product(obj1);
    }
}
