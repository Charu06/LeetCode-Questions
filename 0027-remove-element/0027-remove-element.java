class Solution {
    public int removeElement(int[] nums, int val) {
        int l=0, r=nums.length-1;
        while(l<=r){
            if(nums[l]==val){
                int t=nums[l];
                nums[l]=nums[r];
                nums[r]=t;
                r--;
            }
            else
                l++;
        }
        return l;
    }
}