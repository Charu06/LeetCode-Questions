class Solution {
    public boolean areOccurrencesEqual(String s) {
        int a[]=new int[26];
        for(int i=0;i<s.length();i++){
            a[s.charAt(i)-'a']++;
        }
        int p=a[s.charAt(0)-'a'];
        for(int i=0;i<26;i++){
            if(a[i]!=0&&a[i]!=p)
                return false;
        }
        return true;
    }
}