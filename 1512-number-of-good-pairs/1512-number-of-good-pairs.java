class Solution {
    public int numIdenticalPairs(int[] nums) {
        int c=0;
        int a[]=new int[101];
        for(int i=0;i<nums.length;i++){
            c+=a[nums[i]]++;
        }
        return c;
    }
}