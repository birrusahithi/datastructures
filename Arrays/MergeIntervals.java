

import java.util.Arrays;

public class MergeIntervals {
        public int[][] merge(int[][] intervals) {
            Arrays.sort(intervals, (a, b)-> Integer.compare(a[0], b[0]));
            LinkedList<int []> res = new LinkedList<>();
            for(int[] val : intervals){
                if(res.isEmpty() ||res.getLast()[1]<val[0]){
                    res.add(val);
                } else{
                    res.getLast()[1]= Math.max(res.getLast()[1], val[1]);
                }
            }

            return res.toArray(new int[res.size()][]);
        }

    }


