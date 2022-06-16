import java.util.ArrayList;
import java.util.List;

public class BuildingsWithOceanView {
        public int[] findBuildings(int[] heights) {
            List<Integer> list = new ArrayList<>();
            for(int i=0; i<heights.length; i++){
                boolean flag = true;
                for(int j=i+1; j<heights.length; j++){
                    if(heights[i]<=heights[j]){
                        flag = false;
                        break;
                    }
                }
                if(flag) {
                    list.add(i);
                }
            }

            int [] answer = new int[list.size()];
            for(int i=0; i<list.size(); i++){
                answer[i] = list.get(i);
            }

            return answer;
        }
    }

