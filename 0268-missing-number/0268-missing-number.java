class Solution {
    public int missingNumber(int[] nums) {
        int asum=0, rsum=((nums.length)*(nums.length+1))/2;
        for(int i=0;i<nums.length;i++){
            asum+=nums[i];
        }
        return rsum-asum;
    }
}