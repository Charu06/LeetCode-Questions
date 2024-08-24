class Solution {
    public int myAtoi(String s) {
        String s1=s.trim();
        int n=s1.length();
        int sign=1;
        long res=0;
        long ref=(long)Math.pow(2,31);
        for(int i=0;i<n;i++){
            char ch=s1.charAt(i);
            if(i==0 && ch=='-'){
                sign*=-1;
                continue;
            }
            if(i==0 && ch=='+'){
                continue;
            }
            if(ch<'0' || ch>'9')
                break;
            if(ch>='0' && ch<='9')
                res=res*10+(ch-48);
            System.out.println(res);
            if(sign==-1 && res>ref)
                return (int)ref*-1;
            if(sign==1 && res>=ref)
                return (int)(ref-1);
        }
        System.out.println(res);
        long ress=res*sign;
        System.out.println(ress);
        
        return (int)ress;
    }
}