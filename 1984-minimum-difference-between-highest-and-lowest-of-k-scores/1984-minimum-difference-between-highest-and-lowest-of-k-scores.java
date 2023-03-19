class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length, i=0, j=k-1;
        int min=Integer.MAX_VALUE;
        while(i<n-k+1){
            min=Math.min(nums[j]-nums[i], min);
            i++;
            j++;
        }
        return min;
    }
}