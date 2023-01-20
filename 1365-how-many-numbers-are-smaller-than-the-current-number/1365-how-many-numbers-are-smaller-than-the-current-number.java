class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
       Map<Integer,Integer> map=new HashMap<>();
        int c[]=nums.clone();
        Arrays.sort(c);
        for(int i=0;i<nums.length;i++){
            map.putIfAbsent(c[i],i);
        }
        for(int i=0;i<nums.length;i++){
            c[i]=map.get(nums[i]);
        }
        return c;
    }
}