class Solution {
    public boolean exist(char[][] board, String word) {
        int rows=board.length;
        int cols=board[0].length;

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(board[i][j] == word.charAt(0)){
                    if (dfs(i, j, board, 0, word)) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    public boolean dfs(int i, int j, char[][] board, int c, String word){
        int rows=board.length;
        int cols=board[0].length;

        if(i<0 || j<0 || i>=rows || j >=cols ||  board[i][j] != word.charAt(c)){
            return false;
        }
        
        if(c==word.length()-1){
            return true;
        }
        char temp=board[i][j];
        board[i][j]='#';
        boolean found = dfs(i+1, j, board, c+1, word) ||
                        dfs(i-1, j, board, c+1, word) ||
                        dfs(i, j+1, board, c+1, word) ||
                        dfs(i, j-1, board, c+1, word);
        
        board[i][j]=temp;
        return found;
    }
}
