class Solution {
    public int differenceOfSum(int[] nums) {
        int esum=0;
        int dsum=0;
        int l=nums.length;
        for(int i=0;i<l;i++)
        {
            esum+=nums[i];
            dsum+=sod(nums[i]);
        }
        int absdiff=(int)Math.abs(esum-dsum);
        return absdiff;
    }
    public int sod(int n)
    {
        int sum=0;
        while(n>0)
        {
            sum=sum+(n%10);
            n/=10;
        }
        return sum;
    }
}