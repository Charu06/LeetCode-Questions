class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n1=word1.length();
        int n2=word2.length();
        StringBuffer s=new StringBuffer();
        int min=Math.min(n1,n2);
        for(int i=0;i<min;i++){
            s.append(word1.charAt(i));
            s.append(word2.charAt(i));
        }
        if(n1>n2)
            return s.append(word1.substring(min)).toString();
        else
            return s.append(word2.substring(min)).toString();
    }
}