class Solution {
    public int numIslands(char[][] grid) {
        int row=grid.length;
        int col=grid[0].length;

        int count=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]=='1'){
                    count++;
                    traverse(grid,i,j);
                }
            }
        }

        return count;
    }

    private void traverse(char[][] grid, int i, int j){
        int rows = grid.length;
        int cols = grid[0].length;
        if(i<0 || j<0 || i>=rows || j>=cols || grid[i][j]=='0')
            return;

        grid[i][j]='0';

        traverse(grid,i-1,j);
        traverse(grid,i+1,j);
        traverse(grid,i,j-1);
        traverse(grid,i,j+1);
    }
}
