class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        HashSet<List<Integer>> hs=new HashSet<>();
        for(int i=0;i<nums.length-3;i++){
            for(int j=i+1;j<nums.length-2;j++){
                int l=j+1, r=nums.length-1;
                while(l<r){
                    int sum=nums[i]+nums[j]+nums[l]+nums[r];
                    if(sum==-294967296)
                        return new ArrayList<>(hs);
                    if(sum<target)
                        l+=1;
                    else if(sum>target)
                        r-=1;
                    else{
                        hs.add(Arrays.asList(nums[i], nums[j], nums[l], nums[r]));
                        l+=1;
                        r-=1;
                    }
                }
            }
        }
        return new ArrayList<>(hs);
    }
}