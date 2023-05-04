class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer, Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++)
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        int max=0;
        for(int i:hm.keySet()){ 
            if(hm.containsKey(i+1)) 
                max=Math.max(max,hm.get(i)+hm.get(i+1));
        }
        return max;
    }
}