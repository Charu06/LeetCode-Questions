class Solution {
    public int subarraySum(int[] nums, int k) {
        int currsum=0;
        HashMap<Integer,Integer> hs =new HashMap<>();
        hs.put(0,1);
        int c=0;
        for(int i=0;i<nums.length;i++){
            currsum+=nums[i];
            if(hs.containsKey(currsum-k))
                c+=hs.get(currsum-k);
            hs.put(currsum, hs.getOrDefault(currsum, 0) + 1);
        }
        return c;
    }
}

