class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int rows=heights.length;
        int cols=heights[0].length;
        Set<List<Integer>> p = new HashSet<>();
        Set<List<Integer>> a = new HashSet<>();
        
        List<List<Integer>> result = new ArrayList<>();

        for(int i=0;i<cols;i++){
            dfs(0, i, heights[0][i], p, heights);
            dfs(rows-1, i, heights[rows-1][i], a, heights);
        }

        for(int i=0;i<rows;i++){
            dfs(i, 0, heights[i][0], p, heights);
            dfs(i, cols-1, heights[i][cols-1], a, heights);
        }

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                List<Integer> cell = Arrays.asList(i, j);

                if(p.contains(cell) && a.contains(cell))
                    result.add(cell);
            }
        }
        return result;
        
    }

    public void dfs(int i, int j, int prev,
                    Set<List<Integer>> visited, int[][] heights) {

        int rows = heights.length;
        int cols = heights[0].length;

        if (i < 0 || j < 0 || i >= rows || j >= cols ||
            prev > heights[i][j] ||
            visited.contains(Arrays.asList(i, j))) {
            return;
        }

        visited.add(Arrays.asList(i, j));

        dfs(i - 1, j, heights[i][j], visited, heights);
        dfs(i + 1, j, heights[i][j], visited, heights);
        dfs(i, j - 1, heights[i][j], visited, heights);
        dfs(i, j + 1, heights[i][j], visited, heights);
    }

}
