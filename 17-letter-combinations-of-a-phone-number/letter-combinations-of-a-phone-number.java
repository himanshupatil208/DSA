class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();

        if (digits.length() == 0) {
            return result;
        }

        String[] map = {
            "", "", "abc", "def",
            "ghi", "jkl", "mno",
            "pqrs", "tuv", "wxyz"
        };

        backtrack(0, digits, new StringBuilder(), map, result);

        return result;
    }

    public void backtrack(int c, String digits, StringBuilder sb, String[] map,     List<String> result){

        if(c == digits.length()){
            result.add(sb.toString());
            return;
        }
        int digit= digits.charAt(c) - '0';
        for(int i=0; i<map[digit].length();i++){
            sb.append(map[digit].charAt(i));
            backtrack(c+1, digits, sb, map, result);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
