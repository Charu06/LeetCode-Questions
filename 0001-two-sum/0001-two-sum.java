class Solution {
    public int[] twoSum(int[] nums, int target) {
        int a[]=new int[2];
        HashMap<Integer,Integer> hs=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hs.containsKey(target-nums[i])){
                a[0]=i;
                a[1]=hs.get(target-nums[i]);
                break;
            }
            else
                hs.put(nums[i],i);
        }
       return a;
    }
}