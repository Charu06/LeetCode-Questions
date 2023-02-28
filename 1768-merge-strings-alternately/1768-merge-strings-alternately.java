class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n1=word1.length();
        int n2=word2.length();
        String s="";
        int i=0,j=0;
        while((i<n1)||(j<n2)){
            if(i<n1)
                s+=word1.charAt(i++);
            if(j<n2)
                s+=word2.charAt(j++);
        }
        return s;
    }
}