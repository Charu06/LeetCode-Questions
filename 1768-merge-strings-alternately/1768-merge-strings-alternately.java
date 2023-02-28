class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n1=word1.length();
        int n2=word2.length();
        String s="";
        int min=Math.min(n1,n2);
        for(int i=0;i<min;i++){
            s+=word1.charAt(i);
            s+=word2.charAt(i);
        }
        if(n1>n2)
            return s+word1.substring(min);
        else
            return s+word2.substring(min);
    }
}