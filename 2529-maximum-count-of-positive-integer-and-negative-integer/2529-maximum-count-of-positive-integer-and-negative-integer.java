class Solution {
    public int maximumCount(int[] nums) {
        if(nums[0]>0||nums[nums.length-1]<0)
            return nums.length;
        int s=0;
        int e=nums.length;
        while(s<e){
            int mid=(s+e)/2;
            if(nums[mid]<0)
                s=mid+1;
            else
                e=mid;
        }
        int neg=e;
        s=0;
        e=nums.length;
        while(s<e){
            int mid=(s+e)/2;
            if(nums[mid]>0)
                e=mid;
            else
                s=mid+1;
        }
        int pos=nums.length-e;
        return Math.max(neg,pos);
    }
}