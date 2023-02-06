class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character,Character> hs=new HashMap<>();
        char ch='a';
        for(int i=0;i<key.length();i++){
            if((!hs.containsKey(key.charAt(i)))&&(key.charAt(i)!=' ')){
            hs.put(key.charAt(i),ch);
            ch+=1;
            }
        }
        
        String s="";
        for(int i=0;i<message.length();i++){
            char m=message.charAt(i);
            if(m==' ')
                s+=m;
            else
                s+=hs.get(m);
        }
        return s;
    }
}