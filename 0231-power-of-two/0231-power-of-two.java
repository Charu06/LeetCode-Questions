class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==1)
            return true;
        else if(n%2==1 || n==0)
            return false;
        return isPowerOfTwo(n/2);
    }
}
// 2 - 0010
// 4 - 0100
// 8 - 1000
// 16 -10000    
// 6 - 0110
// 7 - 0111
// 10 -1010
// 12 -1100