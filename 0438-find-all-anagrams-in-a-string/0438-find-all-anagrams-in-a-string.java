class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int m=s.length();
        int n=p.length();
        List<Integer> list=new ArrayList<>();
        if(n>m)
            return list;
        int a[]=new int[26];
        for(int i=0;i<n;i++){
            a[p.charAt(i)-'a']+=1;
            a[s.charAt(i)-'a']-=1;
        }
        boolean f=true;
        for(int i=0;i<26;i++){
            if(a[i]!=0){
                f=false;
                break;
            }
        }
        if(f==true)
            list.add(0);
        for(int i=n;i<m;i++){
            a[s.charAt(i)-'a']-=1;
            a[s.charAt(i-n)-'a']+=1;
            for(int j=0;j<26;j++){
                if(a[j]!=0)
                    break;
                else if(j==25&&a[j]==0)
                    list.add(i-n+1);
            }
        }
        return list;
    }
}