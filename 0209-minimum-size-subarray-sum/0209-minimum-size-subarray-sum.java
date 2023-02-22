class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0, r=0, sum=0, min=Integer.MAX_VALUE;
        while(r<nums.length){
            sum+=nums[r];
            while(sum>=target){
                min=Math.min(min,r-l+1);
                sum-=nums[l++];
            }
            r++;
        }
        if(min==Integer.MAX_VALUE)
            return 0;
        else
            return min;
    }
}