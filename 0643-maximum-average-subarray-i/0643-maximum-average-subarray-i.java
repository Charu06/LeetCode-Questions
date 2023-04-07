class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0;
        int n=nums.length;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        double max=Integer.MIN_VALUE;
        max=Math.max(max,sum);
        int l=0,r=k;
        while(r<n){
            sum-=nums[l++];
            sum+=nums[r++];
            max=Math.max(max,sum);
        }
        return max/k;
    }
}