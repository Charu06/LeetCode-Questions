class Solution {
    public int strStr(String haystack, String needle) {
        int m=haystack.length();
        int l=0;
        int r=needle.length();
        while(l+r<=m){
            String s=haystack.substring(l,l+r);
            if(s.equals(needle))
                return l;
            l++;
        }
        return -1;
    }
}