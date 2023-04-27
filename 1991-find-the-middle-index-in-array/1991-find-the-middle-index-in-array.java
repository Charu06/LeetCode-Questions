class Solution {
    public int findMiddleIndex(int[] nums) {
        int s1=0, s2=0, n=nums.length;
        for(int i=0;i<n;i++)
            s2+=nums[i];
        for(int i=0;i<n;i++){
            s2-=nums[i];
            if(s1==s2)
                return i;
            s1+=nums[i];
        }
        return -1; 
    }
}