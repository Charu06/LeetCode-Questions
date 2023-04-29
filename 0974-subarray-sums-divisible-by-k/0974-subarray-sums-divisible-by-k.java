class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int c=0;
        HashMap<Integer, Integer> hs=new HashMap<>();
        int currsum=0;
        hs.put(0,1);
        for(int i=0;i<nums.length;i++){
            currsum+=nums[i]%k;
            if(currsum<0)
                currsum+=k;
            if(hs.containsKey(currsum%k))
                c+=hs.get(currsum%k);
            hs.put(currsum%k,hs.getOrDefault(currsum%k,0)+1);
        }
        return c;
    }
}