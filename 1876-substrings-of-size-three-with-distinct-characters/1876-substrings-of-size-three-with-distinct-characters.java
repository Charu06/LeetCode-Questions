class Solution {
    public int countGoodSubstrings(String s) {
        int c=0;
        for(int i=0;i<s.length()-2;i++){
            int f[]=new int[26];
            int flag=3;
            f[s.charAt(i)-'a']+=1;
            f[s.charAt(i+1)-'a']++;
            f[s.charAt(i+2)-'a']++;
            for(int j=0;j<26;j++){
                if(f[j]==1)
                    flag--;
                if(flag==0){
                    c++;
                    break;
                }
            }
        }
        return c;
    }
}