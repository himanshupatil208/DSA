class Solution {
    public void rotate(int[][] matrix) {
        int temp;
        for(int i=0;i<matrix[0].length;i++){
            for(int j=i;j<matrix[i].length;j++){
                temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        {
            for(int i=0;i<matrix[0].length;i++){
                int k=0;
                int j=matrix[0].length-1;
                while(k<(matrix[0].length)/2){
                    temp=matrix[i][k];
                    matrix[i][k]=matrix[i][j];
                    matrix[i][j]=temp;
                    k++;
                    j--;
                }
            }
        }
    }
}