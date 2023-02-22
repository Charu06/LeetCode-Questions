class Solution {
    public int repeatedNTimes(int[] nums) {
        HashMap<Integer, Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!hm.containsKey(nums[i]))
                hm.put(nums[i],1);
            else
                hm.put(nums[i],hm.get(nums[i])+1);
        }
        for(int i:hm.keySet()){
            if(hm.get(i)==nums.length/2)
                return i;
        }
        return 0;
    }
}