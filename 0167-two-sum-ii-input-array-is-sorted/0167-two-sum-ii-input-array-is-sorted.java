class Solution {
    public int[] twoSum(int[] nums, int target) {
        int a[]=new int[2];
        int l=0,r=nums.length-1;
        while(l<r){
            if(nums[l]+nums[r]>target)
                r=r-1;
            else if(nums[l]+nums[r]<target)
                l=l+1;
            else{
                a[0]=l+1;
                a[1]=r+1;
                break;
            }
        }
        return a;
    }
}