class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        HashSet<List<Integer>> hs=new HashSet<>();
        for(int i=0;i<nums.length-2;i++){
            int l=i+1;
            int r=nums.length-1;
            while(l<r){
                int sum=nums[i]+nums[l]+nums[r];
                if(sum<0)
                    l+=1;
                else if(sum>0)
                    r-=1;
                else{
                    if(!hs.contains(Arrays.asList(nums[i],nums[l],nums[r])))
                        hs.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    l+=1;
                    r-=1;
                }
            }
        }
            return new ArrayList<>(hs);
    }
}