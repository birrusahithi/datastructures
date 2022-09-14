import java.util.ArrayList;
import java.util.List;

public class AllPaths {
    public List<List<Integer>> paths(int[][] graph){
       List<List<Integer>> paths = new ArrayList<>();
       if(graph==null || graph.length==0){
           return null;
       }
       dfs(graph, 0, paths, new ArrayList<>());
       return paths;
    }
    public void dfs(int[][] graph, int n, List<List<Integer>> paths, List<Integer> list){
        list.add(n);
        if(n==graph.length-1){
            paths.add(new ArrayList<>(list));
            return;
        }
        int[] next = graph[n];
        for(int nexnode : next){
            dfs(graph, nexnode, paths, list);
            list.remove(list.size()-1);
        }
    }
    public static void main(String[] args){
        AllPaths obj = new AllPaths();
        int[][] paths = {{1,2}, {3}, {3}, {}};
        obj.paths(paths);
    }
}
