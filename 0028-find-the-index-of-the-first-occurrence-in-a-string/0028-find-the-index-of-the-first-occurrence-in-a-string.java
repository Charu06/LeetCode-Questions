class Solution {
    public int strStr(String haystack, String needle) {
        int m=haystack.length();
        int l=0;
        int r=needle.length();
        while(l<m-needle.length()+1){
            String s=haystack.substring(l,r);
            if(s.equals(needle))
                return l;
            l++;
            r++;
        }
        return -1;
    }
}