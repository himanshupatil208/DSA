class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> map=new HashMap<>();
        Map<String, Character> map1=new HashMap<>();
        String[] words=s.split(" ");
        
        
        if(words.length != pattern.length())
            return false;
        for(int i=0;i<pattern.length();i++){
            char c=pattern.charAt(i);
            System.out.println(c+" c : "+map.get(c));
            if(map.containsKey(c) && !map.get(c).equals(words[i]))
                return false;
            if(map1.containsKey(words[i]) && !map1.get(words[i]).equals(c))
                return false;
            
                map.put(c,words[i]);
                map1.put(words[i],c);
            
            
        }
        return true;

        }
    
}