class Solution {
    public int[] shuffle(int[] nums, int n) {
        int a[]=new int[2*n];
        int c=0;
        for(int i=0;i<n;i++) {
            a[c++]=nums[i];
            a[c++]=nums[i+n];
        }
        return a;
    }
}