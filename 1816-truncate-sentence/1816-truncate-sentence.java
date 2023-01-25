class Solution {
    public String truncateSentence(String s, int k) {
        String s1="";
        int c=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i); 
            if(ch==' ')
                c++;
            if(c==k)
                break;
            s1+=ch;
        }
        return s1;
    }
}