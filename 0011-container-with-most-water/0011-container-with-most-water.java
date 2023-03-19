class Solution {
    public int maxArea(int[] height) {
        int i=0, j=height.length-1;
        int max=Integer.MIN_VALUE;
        while(i<j){
            int diff;
            if(height[i]<height[j]){
                diff=(height[i])*(j-i);
                i++;
            }
            else{
                diff=(height[j])*(j-i);
                j--;
            }
            max=Math.max(diff,max);
        }
        return max;
    }
}