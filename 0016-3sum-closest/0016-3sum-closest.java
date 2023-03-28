class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int min=Integer.MAX_VALUE;
        int res=0;
        for(int i=0;i<nums.length-2;i++){
            int l=i+1;
            int r=nums.length-1;
            while(l<r){
                int sum=nums[i]+nums[l]+nums[r];
                int diff1=Math.abs(sum-target);
                //int diff2=Math.abs(min-target);
                if(diff1<min){
                    min=diff1;
                    res=sum;
                }
                if(sum<target)
                    l+=1;
                else if(sum>target)
                    r-=1;
                else
                    return sum;
            }
        }
        return res;
    }
}