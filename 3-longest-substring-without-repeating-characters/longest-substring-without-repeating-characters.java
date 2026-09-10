class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0;
        int l=0;
        Map<Character, Integer> map = new HashMap<>();

        for(int j=0;j<s.length();j++){
            char c=s.charAt(j);
            while(map.containsKey(c)){
                map.remove(s.charAt(i));
                i++;
            }
            map.put(c,1);
            
            l=Math.max(l,j-i+1);
        }

        return l;
    }
}