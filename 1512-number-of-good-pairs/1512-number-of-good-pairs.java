class Solution {
    public int numIdenticalPairs(int[] nums) {
     int c=0;
     int l=nums.length;
        for(int i=0;i<l;i++){
            for(int j=0;j<l;j++){
                if((i!=j)&&(nums[i]==nums[j]))
                    c++;
            }
        }
        return c/2;
    }
}