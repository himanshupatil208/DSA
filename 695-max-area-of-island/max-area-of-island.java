class Solution {
    int n=0;
    public int maxAreaOfIsland(int[][] grid) {
        int rows=grid.length;
        int cols=grid[0].length;

        int count=0;

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j]==1){
                    n=0;
                    traverse(grid,i,j);
                    count=Math.max(count,n);
                }
            }
        }
        return count;
    }

    public void traverse(int[][] grid, int i, int j){
        int rows=grid.length;
        int cols=grid[0].length;
        
        if(i<0 || i>=rows || j<0 || j>=cols || grid[i][j]==0){
            return;
        }
        n++;
        grid[i][j]=0;
        traverse(grid, i-1, j);
        traverse(grid, i+1, j);
        traverse(grid, i, j-1);
        traverse(grid, i, j+1);
    }
}