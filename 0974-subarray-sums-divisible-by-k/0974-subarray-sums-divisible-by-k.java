class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int c=0;
        int a[]=new int[k];
        int currsum=0;
        a[0]=1;
        for(int i=0;i<nums.length;i++){
            currsum=(currsum+nums[i])%k;
            if(currsum<0)
                currsum+=k;
            c+=a[currsum];
            a[currsum]++;
        }
        return c;
    }
}