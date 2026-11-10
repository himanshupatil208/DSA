class Solution {
    public List<Integer> getRow(int rowIndex ) {
        List<List<Integer>> result = new ArrayList<>();
        int numRows = rowIndex + 1;
        for(int i=0; i<numRows; i++){
            List<Integer> row = new ArrayList<>();

            for(int j=0; j<=i; j++){
                if(j==0 || j==i)
                    row.add(1);

                else{
                    int sum= result.get(i-1).get(j-1) + + result.get(i - 1).get(j);
                    row.add(sum);
                }

                
            }
            result.add(new ArrayList<>(row));

        }

        return result.get(numRows-1);
    }
}