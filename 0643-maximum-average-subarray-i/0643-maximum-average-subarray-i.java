class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0;
        int n=nums.length;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        double max=sum;
        int l=0,r=k;
        while(r<n){
            sum+=nums[r++]-nums[l++];
            max=Math.max(max,sum);
        }
        return max/k;
    }
}