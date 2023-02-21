class Solution {
    public int findPeakElement(int[] nums) {
        int l=0, r=nums.length-1;
        while(l<r){
            int m=(l+r)/2;
            if(nums[m+1]>nums[m])
                l=m+1;
            else
                r=m;
        }
        return l;
    }
}