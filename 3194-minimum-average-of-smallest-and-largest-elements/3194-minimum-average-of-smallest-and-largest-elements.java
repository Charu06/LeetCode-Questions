class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int i=0, j=nums.length-1, res=Integer.MAX_VALUE;
        while(i<=j){
            int x=nums[i];
            int y=nums[j];
            res=Math.min(x+y, res);
            i++;
            j--;
        }
        return (double)res/2;
    }
}