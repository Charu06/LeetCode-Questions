class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0;
        int n=nums.length;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        double avg=sum/k;
        double max=Integer.MIN_VALUE;
        max=Math.max(max,avg);
        int l=0,r=k;
        while(r<n){
            sum-=nums[l++];
            sum+=nums[r++];
            avg=sum/k;
            max=Math.max(max,avg);
        }
        return max;
    }
}