class Solution {
    public int tribonacci(int n) {
        int t0=0;
        int t1=1;
        int t2=1;
        if(n<2)
            return n;
        for(int i=3;i<=n;i++){
           int t3=t0+t1+t2;
            t0=t1;
            t1=t2;
            t2=t3;
        }
        return t2;
    }
}