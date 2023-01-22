class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        Set<Integer> list = new HashSet<>();
        int c=0;
        for(int i=0;i<nums.length;i++){
            int j=nums[i]-diff;
            int k=nums[i]-(2*diff);
            if(list.contains(j)&&list.contains(k))
                c++;   
            list.add(nums[i]);
        }
        
        return c;
    }
}