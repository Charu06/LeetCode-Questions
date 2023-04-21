class Solution {
    public int[] separateDigits(int[] nums) {
        StringBuffer s=new StringBuffer();
        for(int i=0;i<nums.length;i++){
           s.append(nums[i]);
        }
        int res[]=new int[s.length()];
        for(int i=0;i<s.length();i++)
            res[i]=s.charAt(i)-'0';
        return res;
    }
}