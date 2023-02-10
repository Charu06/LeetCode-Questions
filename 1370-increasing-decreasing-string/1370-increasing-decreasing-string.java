class Solution {
    public String sortString(String s) {
        int n=s.length();
        int f[]=new int[26];
        char c[]=new char[26];
        char ch='a';
        for(int i=0;i<26;i++){
            c[i]=ch;
            ch++;
        }
        for(int i=0;i<n;i++)
           f[s.charAt(i)-'a']++;
        String res="";
        int i=0;
        while(i<n)
        {
            for(int j=0;j<26;j++){
                if(f[j]>0){
                    res+=c[j];
                    f[j]--;
                }
            }
             for(int j=25;j>=0;j--){
                if(f[j]>0){
                    res+=c[j];
                    f[j]--;
                }  
            }
            i++;
        }
        return res;
    }
}