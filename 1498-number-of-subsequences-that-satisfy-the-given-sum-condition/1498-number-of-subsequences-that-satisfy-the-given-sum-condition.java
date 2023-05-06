class Solution {
    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
        int mod=(int)1e9+7;
        //memoization concept of dp
        int power[]=new int[nums.length];
        power[0]=1;
        for(int i=1;i<nums.length;i++)
            power[i]=(power[i-1]*2)%mod; //power={1,2,4,8,16.....}
        int l=0, r=nums.length-1, res=0;
        while(l<=r){
            if(nums[l]+nums[r]<=target){
                res=(res+power[r-l])%mod;
                l++;
            }
            else
                r--;
        }
        return res;
        // int power (int x){
        //     int result =1;
        //     for(int i=0;i<x;i++)
        //         result=(result*2)%mod;
        //     return result;
        // }
        // We have not used this function because it takes more time so it will give TLE instead of that we have used memoization concept of DP
    }
}