class Solution {
    public int singleNonDuplicate(int[] nums){
        int l=0, r=nums.length-1;
        while(l<r){
            int m=(l+r)/2;
            if((m%2!=0&&nums[m-1]==nums[m])||(m%2==0&&nums[m]==nums[m+1]))
                l=m+1;
            else
                r=m;
        }
        return nums[l];
    }
}