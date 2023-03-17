class Solution {
    public int removeDuplicates(int[] nums) {
        int i=1,j=0;
        while(j<nums.length-1){
            if(nums[j]!=nums[j+1]){
                nums[i]=nums[j+1];
                i++;
            }
            j++;
        }
        return i;
    }
}