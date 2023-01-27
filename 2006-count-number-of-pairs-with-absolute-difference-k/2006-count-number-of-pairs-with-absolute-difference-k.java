class Solution {
    public int countKDifference(int[] nums, int k) {
        int l= nums.length;
        int c=0;
        for(int i=0;i<l;i++){
            for(int j=i;j<l;j++){
                if(Math.abs(nums[i]-nums[j])==k)
                    c++;
            }
        }
        return c;
    }
}