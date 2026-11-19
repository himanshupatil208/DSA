class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result=new ArrayList<>();

        char[][] board=new char[n][n];

        for(int i=0;i<n;i++){
            Arrays.fill(board[i],'.');
        }

        traverse(0, board, result, n);
        return result;
    }

    public void traverse(int row, char[][] board, List<List<String>> result, int n){
        if(row==n){
            List<String> temp=new ArrayList<>();

            for(int i=0; i<n; i++){
                temp.add(new String(board[i]));
            }

            result.add(temp);
            return;
        }

        for(int i=0; i<n; i++){
            board[row][i]='Q';

            if(isSafe(row, i, board, n)){
                traverse(row+1, board, result, n);
            }

            board[row][i]='.';
        }
    }

    public boolean isSafe(int row, int col,
                          char[][] board, int n) {

        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        for (int i = row - 1, j = col - 1;
             i >= 0 && j >= 0; i--, j--) {

            if (board[i][j] == 'Q') {
                return false;
            }
        }

        for (int i = row - 1, j = col + 1;
             i >= 0 && j < n; i--, j++) {

            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

}
