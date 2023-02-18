class Solution {
    public int mySqrt(int x) {
        int l=1, r=x;
        if(x==0)
            return 0;
        while(l<=r){
            int m=l+(r-l)/2;
            if(m<=(x/m) && (x/(m+1))<(m+1))
                return m;
            else if(m>(x/m))
                r=m-1;
            else
                l=m+1;
        }
        return 0;
    }
}
/*start=0
        end=x
        while start<=end:
            mid=start+(end-start)//2
            if mid*mid<=x<(mid+1)*(mid+1):
                return mid
            elif mid*mid>x:
                end=mid-1
            else:
                start=mid+1*/