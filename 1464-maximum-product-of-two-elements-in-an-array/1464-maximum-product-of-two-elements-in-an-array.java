class Solution {
    public int maxProduct(int[] nums) {
      /*  int max=0;
        int a=0,b=1;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,(nums[a]-1)*(nums[b]-1));
            b++;
            if(b==nums.length){
                a++;
                b=a+1;
            }
        }
        return max;*/
        Arrays.sort(nums);
        return (nums[nums.length-1]-1)*(nums[nums.length-2]-1);
    }
}