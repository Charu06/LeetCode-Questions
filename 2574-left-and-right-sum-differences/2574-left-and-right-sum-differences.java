class Solution {
    public int[] leftRigthDifference(int[] nums) {
        int ls[]=new int[nums.length];
        int rs[]=new int[nums.length];
        ls[0]=0;
        rs[nums.length-1]=0;
        int s=0;
        for(int i=1;i<nums.length;i++){
            s+=nums[i-1];
            ls[i]=s;
        }
        s+=nums[nums.length-1];
        for(int j=0;j<nums.length-1;j++){
            s-=nums[j];
            rs[j]=s;
        }
        int res[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            res[i]=Math.abs(ls[i]-rs[i]);
        }
        return res;
    }
}