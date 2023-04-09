class Solution {
    public int maxSubArray(int[] nums) {
        int csum=nums[0], msum=nums[0];
        for(int i=1;i<nums.length;i++){
            csum=Math.max(csum+nums[i], nums[i]);
            msum=Math.max(csum,msum);
            }
        return msum;
        }
}