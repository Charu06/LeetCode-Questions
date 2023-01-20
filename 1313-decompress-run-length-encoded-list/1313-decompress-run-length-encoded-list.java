class Solution {
    public int[] decompressRLElist(int[] nums) {
        int l=nums.length;
        int c=0;
        int a[]=new int[100*100];
        for(int i=0;i<l-1;i+=2){
            while(nums[i]>0){
                a[c++]=nums[i+1];
                nums[i]--;
            }
        }
        int b[]=new int[c];
        for(int i=0;i<c;i++)
            b[i]=a[i];
        return b;
    }
}