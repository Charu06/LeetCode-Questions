class Solution {
    public int wiggleMaxLength(int[] nums) {
        int l=nums.length;
        int c=1;
        int p=2;
        for(int i=0;i<l-1;i++){
            if(nums[i]>nums[i+1] && p!=0){
                c++;
                p=0;
            }
            else if(nums[i]<nums[i+1] && p!=1){
                c++;
                p=1;
            }
        }
        return c;
    }
}