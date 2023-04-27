class Solution {
    public int findMiddleIndex(int[] nums) {
        if(nums.length==1)
            return 0;
        int s1=0, s2=0, n=nums.length;
        for(int i=1;i<n;i++)
            s2+=nums[i];
        System.out.println(s1+" "+s2);
        for(int i=1;i<=n;i++){
            if(s1==s2)
                return i-1;
            if(i<n){
            s1+=nums[i-1];
            s2-=nums[i];
            }
            System.out.println(s1+" "+s2);
        }
        // s1=0;
        // s2=0;
        // for(int i=n-2;i>=0;i--)
        //     s1+=nums[i];
        // System.out.println(s1+" "+s2);
        // for(int i=n-2;i>=0;i--){
        //     if(s1==s2)
        //         return i+1;
        //     s1+=nums[i+1];
        //     s2-=nums[i];
        //     System.out.println(s1+" "+s2);
        // }
        return -1; 
    }
}