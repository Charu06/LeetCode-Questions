class Solution {
    public boolean isPerfectSquare(int num) {
        int l=0, r=num;
        if(num==1)
            return true;
        while(l<=r){
            long m=l+(r-l)/2;
            if(m*m==num)
                return true;
            else if(m*m<num)
                l=(int)m+1;
            else
                r=(int)m-1;
        }
        return false;
    }
}