class Solution {
    public void sortColors(int[] nums) {
        quicksort(nums, 0, nums.length-1);
    }
    public int[] quicksort(int[] nums, int l, int r){
        if(l<r){
            int ppos=partition(nums,l,r);
            quicksort(nums,l,ppos-1);
            quicksort(nums,ppos+1,r);
        }
        return nums;
    }
    public int partition(int[] nums, int l, int r){
        int i=l, j=r-1, pivot=nums[r];
        while(i<=j){
            while(i<=j && nums[i]<=pivot)
                i+=1;
            while(i<=j && nums[j]>=pivot)
                j-=1;
            if(i<j){
                int t=nums[i];
                nums[i]=nums[j];
                nums[j]=t;
            }
        }
        int t=nums[i];
        nums[i]=nums[r];
        nums[r]=t;
        return i;
    }
}