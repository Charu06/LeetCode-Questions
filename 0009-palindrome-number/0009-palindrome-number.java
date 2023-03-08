class Solution {
    public boolean isPalindrome(int x) {
        int rev=0;
        int n=x;
        if(x<0)
            return false;
        while(n>0){
            int rem=n%10;
            rev=rev*10+rem;
            n/=10;
        }
        if(rev==x)
            return true;
        else
            return false;
    }
}