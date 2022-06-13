public class NoOfIslands {
    public int numIslands(char[][] grid) {
        int number=0;
        for(int r=0; r<grid.length; r++){
            for(int c=0; c<grid[0].length; c++){
                if(grid[r][c]=='1'){
                    number++;
                    dfs(grid, r, c);
                }
            }

        }
        return number;
    }
    public void dfs(char[][] grid, int r, int c){
        int nr = grid.length;
        int nc = grid[0].length;
        if(r>=nr || c>=nc || r<0 || c<0 || grid[r][c]=='0'){
            return ;
        }
        grid[r][c]='0';
        dfs(grid, r+1, c);
        dfs(grid, r-1, c);
        dfs(grid, r, c-1);
        dfs(grid, r, c+1);

    }
}
