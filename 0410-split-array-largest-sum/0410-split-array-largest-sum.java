class Solution {
    public int splitArray(int[] nums, int k) {
        int l=Integer.MIN_VALUE, r=0;
        for(int i=0;i<nums.length;i++){
            l=Math.max(nums[i],l);
            r=r+nums[i];
        }
        while(l<r){
            int m=(l+r)/2;
            if(feasible(m, nums, k))
                r=m;
            else
                l=m+1;
        }
        return l;
    }
    boolean feasible(int m, int nums[], int k){
        int d=1;
        int t=0;
        for(int i=0;i<nums.length;i++){
            t+=nums[i];
            if(t>m){
                t=nums[i];
                d+=1;  
                if(d>k)
                return false;
            }
        }
        return true;
    }
}