class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int a[]=new int[26];
        int m=s1.length(), n=s2.length();
        if(m>n)
            return false;
        boolean f=true;
        for(int i=0;i<m;i++){
            a[s1.charAt(i)-'a']+=1;
            a[s2.charAt(i)-'a']-=1;
        }
        for(int j=0;j<26;j++){
            if(a[j]!=0)
                f=false;
        }
        if(f==true)
            return f;
        for(int i=m;i<n;i++){
            a[s2.charAt(i-m)-'a']+=1;
            a[s2.charAt(i)-'a']-=1;
            for(int j=0;j<26;j++){
               if(a[j]!=0)
                   break;
               else if(j==25)
                   return true;
            }
        }
        return false;
    }
}