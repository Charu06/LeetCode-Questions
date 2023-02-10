class Solution {
    public String sortString(String s) {
        int n=s.length();
        int f[]=new int[26];
        for(int i=0;i<n;i++)
           f[s.charAt(i)-'a']++;
        String res="";
        while(res.length()<n)
        {
            for(int j=0;j<26;j++){
                if(f[j]>0){
                    res+=(char)(j+'a');
                    f[j]--;
                }
            }
             for(int j=25;j>=0;j--){
                if(f[j]>0){
                    res+=(char)(j+'a');
                    f[j]--;
                }  
            }
        }
        return res;
    }
}