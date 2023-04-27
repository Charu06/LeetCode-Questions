class Solution {
    public int findMiddleIndex(int[] nums) {
        if(nums.length==1)
            return 0;
        int s1=0, s2=0, n=nums.length;
        for(int i=1;i<n;i++)
            s2+=nums[i];
        for(int i=1;i<=n;i++){
            if(s1==s2)
                return i-1;
            if(i<n){
            s1+=nums[i-1];
            s2-=nums[i];
            }
        }
        return -1; 
    }
}