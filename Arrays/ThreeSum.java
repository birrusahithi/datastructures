import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threesum(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < arr.length && arr[i] <= 0; i++) {
            if (i == 0 || arr[i - 1] != arr[i]) {
                sum(arr, i, result);
            }
        }
        return result;
    }

    public void sum(int[] arr, int i, List<List<Integer>> result) {
int lo = i+1;
int hi = arr.length-1;
while(lo<hi){
    int sum = arr[i]+ arr[lo]+ arr[hi];
    if(sum<0){
        lo++;
    }else if(sum>0){
        hi--;
    }else{
        List<Integer> res = new ArrayList<>();
        res.add(arr[i]);
        res.add(arr[lo]);
        res.add(arr[hi]);
        result.add(res);
        lo++;
        hi--;
        while(lo<hi && arr[lo]==arr[lo-1]){
            lo++;
        }
    }
}
    }

    public static void main(String[] args) {
        ThreeSum obj = new ThreeSum();
        int[] arr = {-1, -4, 1, -1, 0, 2, 4, 5};

    }
}
