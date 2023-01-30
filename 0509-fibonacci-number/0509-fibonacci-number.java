class Solution {
    public int fib(int n) {
        int f0=0;
        int f1=1;
        if(n<2)
            return n;
        while(n>=2){
           int f2=f0+f1;
            f0=f1;
            f1=f2;
            n--;
        }
        return f1;
    }
}