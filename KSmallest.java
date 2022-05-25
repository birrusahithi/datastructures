import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class KSmallest {
    public int kSmallest(int[] array, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i =0; i<array.length; i++){
            if(map.containsKey(array[i])){
                map.put(array[i], map.get(array[i])+1);
            }
            else{
                map.put(array[i],1);
            }
        }
        PriorityQueue<Integer> pri = new PriorityQueue<>((n1,n2)->n2-n1);
        for (int i = 0; i < array.length; i++) {
            if (i < k) {
                pri.add(array[i]);
            } else if (array[i] > pri.peek()) {
                pri.poll();
                pri.add(array[i]);
            }
        }
        return pri.peek();
    }

    public static void main(String[] args) {
        KSmallest obj = new KSmallest();
        int[] array = {3,3,2,2,2,4,5};
        int k = 2;
        System.out.println(obj.kSmallest(array, k));
    }
}
