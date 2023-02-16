class Solution {
    public int[] searchRange(int[] nums, int target) {
        int l=0, r=nums.length-1,s=-1,e=-1;
        int a[]=new int[2];
        while(l<=r){
            int mid=(l+r)/2;
            if(nums[mid]<target)
                l=mid+1;
            else if(nums[mid]>target)
                r=mid-1;
            else{
                s=mid;
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
                e=mid;
                l=mid+1;
            }
        }
        a[0]=s;
        a[1]=e;
        return a;
    }
}