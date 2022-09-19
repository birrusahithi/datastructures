import sun.awt.image.ImageWatched;

import java.util.*;
import java.util.LinkedList;

class CorseSchedule{
    public boolean course(int minc, int[][] prerequisites){
        Map<Integer, List<Integer>> map = new HashMap<>();
        Queue<Integer> q = new LinkedList();
        int[] array = new int[minc];
        int count=0;
        for(int[] requisite: prerequisites){
            int from = requisite[0];
            int to = requisite[1];
            if(map.containsKey(to)){
                List<Integer> list = map.get(to);
                list.add(from);
                map.put(to, list);
                array[from]++;
            }else{
                List<Integer> lists = new ArrayList<>();
                lists.add(from);
                map.put(to, lists);
                array[from]++;
            }
        }
        for(int i=0; i<minc; i++){
            if(array[i]==0){
                q.add(i);
            }
        }
        while(!q.isEmpty()){
            int number = q.poll();
            count++;
            if(map.containsKey(number)){
                for(int n: map.get(number)){
                    array[n]--;
                    if(array[n]==0){
                        q.add(n);
                    }
                }
            }
        }
        return count==minc;
    }
    public static void main(String[] args){
        CorseSchedule obj = new CorseSchedule();
        int min =2;
        int[][] array = {{0,1}, {1,2}};
        obj.course(min, array);
    }
}