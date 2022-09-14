import java.util.*;

public class IfPathExist {
    //USIng DFS
    public boolean pathExist(int[][] edges, int n, int source, int destination){
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0; i<n; i++) {
            list.add(new ArrayList<>());
        }
            for(int[] edge: edges){
               list.get(edge[0]).add(edge[1]);
               list.get(edge[1]).add(edge[0]);
            }

        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(source);
        Set<Integer> set = new HashSet<>();
        while(!stack.isEmpty()){
            int number = stack.pop();
            if(number==destination){
                return true;
            }
            if(set.contains(number)){
                continue;
            }
           set.add(number);
            for(int neighbor : list.get(number)) {
                stack.push(neighbor);
            }
        }
        return false;
    }
    public static void main(String[] args){
        IfPathExist obj = new IfPathExist();
        int[][] arr = {{0,1}, {1,2}, {2, 0}};
        int n =3;
        int source =0;
        int destination = 2;
        obj.pathExist(arr, n, source, destination);


    }
}
