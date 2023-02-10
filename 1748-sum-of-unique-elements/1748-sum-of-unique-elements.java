class Solution {
    public int sumOfUnique(int[] nums) {
        int c[]=new int[101];
        for(int i=0;i<nums.length;i++){
            c[nums[i]]++;
        }
        int sum=0;
        for(int i=0;i<101;i++){
            if(c[i]==1)
                sum+=i;
        }
        return sum;
    }
}