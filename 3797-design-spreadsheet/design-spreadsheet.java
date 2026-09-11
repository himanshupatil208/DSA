class Spreadsheet {
    
    int[][] s;
    public Spreadsheet(int rows) {
        s=new int[rows][26];

    }
    
    public void setCell(String cell, int value) {
        char c=cell.charAt(0);
        int row=Integer.parseInt(cell.substring(1));

        int col=c - 'A';

        s[row-1][col]=value;
    }
    
    public void resetCell(String cell) {
        char c=cell.charAt(0);
        int row=Integer.parseInt(cell.substring(1));

        int col=c - 'A';

        s[row-1][col]=0;
    }
    
    public int getValue(String formula) {
        formula = formula.substring(1);

        String[] parts = formula.split("\\+");

        return getCellValue(parts[0]) + getCellValue(parts[1]);
    }

    private int getCellValue(String cell) {
        if (Character.isLetter(cell.charAt(0))) {
            char c = cell.charAt(0);
            int row = Integer.parseInt(cell.substring(1));
            int col = c - 'A';

            return s[row - 1][col];
        }

        return Integer.parseInt(cell);
    }
}

/**
 * Your Spreadsheet object will be instantiated and called as such:
 * Spreadsheet obj = new Spreadsheet(rows);
 * obj.setCell(cell,value);
 * obj.resetCell(cell);
 * int param_3 = obj.getValue(formula);
 */