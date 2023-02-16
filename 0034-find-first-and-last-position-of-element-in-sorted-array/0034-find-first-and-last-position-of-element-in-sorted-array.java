class Solution {
    public int[] searchRange(int[] nums, int target) {
        int l=0, r=nums.length-1;
        int a[]={-1,-1};
        while(l<=r){
            int mid=(l+r)/2;
            if(nums[mid]<target)
                l=mid+1;
            else if(nums[mid]>target)
                r=mid-1;
            else{
                a[0]=mid;
                r=mid-1;
            }
        }
        l=0;
        r=nums.length-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(nums[mid]<target)
                l=mid+1;
            else if(nums[mid]>target)
                r=mid-1;
            else{
                a[1]=mid;
                l=mid+1;
            }
        }
        return a;
    }
}