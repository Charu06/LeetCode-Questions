class Solution {
    public int removeDuplicates(int[] nums) {
        int i=2, j=2;
        while(i<nums.length){
            if(nums[j-2]!=nums[i]){
                nums[j]=nums[i];
                j++;
            }
            i++;
        }
        return j;
    }
}