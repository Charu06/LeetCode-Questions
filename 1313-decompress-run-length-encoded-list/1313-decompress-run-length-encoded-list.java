class Solution {
    public int[] decompressRLElist(int[] nums) {
        int l=nums.length;
        int c=0;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<l-1;i+=2){
            while(nums[i]>0){
                list.add(nums[i+1]);
                nums[i]--;
            }
        }
        int a[]=new int[list.size()];
        for(int i=0;i<list.size();i++)
            a[i]=list.get(i);
        return a;
    }
}