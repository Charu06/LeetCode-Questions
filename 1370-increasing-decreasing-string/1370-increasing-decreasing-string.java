class Solution {
    public String sortString(String s) {
        int n=s.length();
        int f[]=new int[26];
        for(int i=0;i<n;i++)
           f[s.charAt(i)-'a']++;
        StringBuilder sb=new StringBuilder();
        while(sb.length()<n)
        {
            add(sb,f,true);
            add(sb,f,false);
        }
        return sb.toString();
    }
    public void add(StringBuilder sb, int f[], boolean ch){
        for(int j=0;j<26;j++){
            int i=ch?j:25-j;
            if(f[i]-->0)
                sb.append((char)(i+'a'));
        }
    }
}