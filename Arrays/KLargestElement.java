import java.util.*;

public class KLargestElement {
    public int kLargeEle(int[] array, int k) {
        PriorityQueue<Integer> pri = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < array.length; i++) {
            if (i < k) {
                pri.add(array[i]);
            } else if (pri.peek() < array[i]) {
                pri.poll();
                pri.add(array[i]);
            }
        }
        List<Integer> list = new ArrayList<>();
        Integer[] arr = new Integer[list.size()];
        arr = list.toArray(arr);
        List<Integer> list1 = Arrays.asList(arr);
        return pri.poll();
    }

    public int kLargeElement2(int[] array, int k) {
        PriorityQueue<Integer> pri = new PriorityQueue<>();
        for (int i = 0; i < array.length; i++) {
            pri.add(array[i]);
            if (pri.size() > k) {
                pri.poll();
            }
        }
        return pri.poll();
    }

    public static void main(String[] args) {
        KLargestElement obj = new KLargestElement();
        int[] array = {3, 1, 4, 6, 2};
        int k = 2;
        System.out.println(obj.kLargeEle(array, k));
    }
}
