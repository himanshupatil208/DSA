class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int rows=grid.length;
        int cols=grid[0].length;

        int count=0;

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j]==1){
                
                    count=Math.max(count,traverse(grid,i,j));
                }
            }
        }
        return count;
    }

    public int traverse(int[][] grid, int i, int j){
        int rows=grid.length;
        int cols=grid[0].length;
        
        if(i<0 || i>=rows || j<0 || j>=cols || grid[i][j]==0){
            return 0;
        }
        int n=1;
        grid[i][j]=0;
        n+=traverse(grid, i-1, j);
        n+=traverse(grid, i+1, j);
        n+=traverse(grid, i, j-1);
        n+=traverse(grid, i, j+1);

        return n;
    }
}