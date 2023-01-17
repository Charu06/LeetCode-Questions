class Solution {
    public int[] getConcatenation(int[] nums) {
       int l=nums.length;
        int ans[]=new int[2*l];
        int a=0;
     for(int i=0; i<l;i++)
     {
         ans[a]=nums[i];
         a++;
     }
        for(int i=0;i<l;i++)
        {
            ans[a]=nums[i];
            a++;
        }
        return ans;
    }
}