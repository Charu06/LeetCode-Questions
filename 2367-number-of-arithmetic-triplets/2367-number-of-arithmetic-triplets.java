class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        Set<Integer> list = new HashSet<>();
        for(int i=0;i<nums.length;i++)
            list.add(nums[i]);
        int c=0;
        for(int i=0;i<nums.length;i++){
            int j=nums[i]+diff;
            int k=nums[i]+(2*diff);
            System.out.println(list.contains(j));
            if(list.contains(j)&&list.contains(k))
                c++;   
        }
        
        return c;
    }
}