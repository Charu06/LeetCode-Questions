class Solution {
    public int differenceOfSum(int[] nums) {
        int esum=0;
        int dsum=0;
        int l=nums.length;
        for(int i=0;i<l;i++){
            esum+=nums[i];
            while(nums[i]>0){
                dsum=dsum+(nums[i]%10);
                nums[i]/=10;
            }
        }
        int absdiff=Math.abs(esum-dsum);
        return absdiff;
    }
}