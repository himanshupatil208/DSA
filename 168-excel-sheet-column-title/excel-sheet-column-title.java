class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuffer result=new StringBuffer();
        while(columnNumber > 0){
            columnNumber--;
            int remainder = columnNumber % 26;
            char ch = (char) ('A' + remainder);
            result.append(ch);
            columnNumber /= 26;
            
        }

        return result.reverse().toString();
    }
}