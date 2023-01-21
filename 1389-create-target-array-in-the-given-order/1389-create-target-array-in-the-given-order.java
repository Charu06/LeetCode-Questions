class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int l=nums.length;
        int t[]=new int[l];
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<l;i++){
            list.add(index[i],nums[i]);
        }
        for(int i=0;i<l;i++){
            t[i]=list.get(i);
        }
        return t;
    }
}