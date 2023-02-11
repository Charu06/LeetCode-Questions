class Solution {
    public boolean divideArray(int[] nums) {
        int f[]=new int[501];
        for(int i=0;i<nums.length;i++){
            f[nums[i]]++;
            }
        for(int i=0;i<501;i++){
            if(f[i]%2!=0)
                return false;
        }
        return true;
    }
}