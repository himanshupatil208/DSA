class Solution {
    public boolean isValidSudoku(char[][] board) {

        Map<Character,Integer> map=new HashMap<>();

        for (int i = 0; i < 9; i++) {
            map.clear();

            for (int j = 0; j < 9; j++) {

                if (board[i][j] == '.')
                    continue;

                if (map.containsKey(board[i][j]))
                    return false;
                else
                    map.put(board[i][j], 1);
            }
        }

         for (int i = 0; i < 9; i++) {
            map.clear();

            for (int j = 0; j < 9; j++) {

                if (board[j][i] == '.')
                    continue;

                if (map.containsKey(board[j][i]))
                    return false;
                else
                    map.put(board[j][i], 1);
            }
        }


        for (int i = 0; i < 9; i+=3) {
            map.clear();

            for (int j = 0; j < 9; j+=3) {

                for(int k=i;k<i+3;k++){
                    for(int l=j;l<j+3;l++){
                        if (board[k][l] == '.')
                    continue;

                    if (map.containsKey(board[k][l]))
                        return false;
                    else
                        map.put(board[k][l], 1);
                        }
                }
                map.clear();

            }
        }

        return true;
    }
}