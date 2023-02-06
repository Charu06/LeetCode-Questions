class Solution {
    public String decodeMessage(String key, String message) {
        char c[]=new char[26];
        char ch='a';
        List<Character> list=new ArrayList<>();
        for(int i=0;i<26;i++){
            c[i]=ch;
            ch+=1;
        }
        for(int i=0;i<key.length();i++){
            if((!list.contains(key.charAt(i)))&&(key.charAt(i)!=' '))
                list.add(key.charAt(i));
        }
        String s="";
        for(int i=0;i<message.length();i++){
            char m=message.charAt(i);
            if(m==' ')
                s+=m;
            else
                s+=c[list.indexOf(m)];
        }
        return s;
    }
}