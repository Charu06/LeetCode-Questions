class Solution {
    public int strStr(String haystack, String needle) {
        int l=0, m=haystack.length()-needle.length();
        while(l<=m){
            String s=haystack.substring(l,l+needle.length());
            if(s.equals(needle))
                return l;
            l++;
        }
        return -1;
    }
}