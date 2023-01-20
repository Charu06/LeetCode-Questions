class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int l=nums.length;
        int c[]=new int[l];
        for(int i=0;i<l;i++){
            for(int j=0;j<l;j++){
                if((i!=j)&&(nums[i]>nums[j]))
                    c[i]++;
            }
        }
        return c;
    }
}