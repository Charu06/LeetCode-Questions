class Solution {
    public int trap(int[] height) {
        int l=0;
        int r=height.length-1;
        int L=0;
        int R=0;
        int res=0;
        while(l<=r){
            L=Math.max(L,height[l]);
            R=Math.max(R,height[r]);
            if(L<=R){
                res+=L-height[l];
                l+=1;
            }
            else{
                res+=R-height[r];
                r-=1;
            }
        }
        return res;
    }
}