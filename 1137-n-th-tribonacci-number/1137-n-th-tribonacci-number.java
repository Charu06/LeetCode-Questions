class Solution {
    public int tribonacci(int n) {
        int t1=0;
        int t2=1;
        int t3=1;
        int t4=0;
        if(n<2)
            return n;
        for(int i=3;i<=n;i++){
            t4=t1+t2+t3;
            t1=t2;
            t2=t3;
            t3=t4;
        }
        return t3;
    }
}