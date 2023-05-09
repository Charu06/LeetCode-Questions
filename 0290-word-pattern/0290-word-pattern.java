class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> hm=new HashMap<>();
        String[] str=null;
        str=s.split(" ");
        if(str.length!=pattern.length())
            return false;
        for(int i=0;i<pattern.length();i++){
            char ch=pattern.charAt(i);
            if(!hm.containsKey(ch) && !hm.containsValue(str[i]))
                hm.put(pattern.charAt(i), str[i]);
            else if(!hm.containsKey(ch) && hm.containsValue(str[i]))
                return false;
            else if(!hm.get(ch).equals(str[i]))
                return false;
        }
        return true;
    }
}