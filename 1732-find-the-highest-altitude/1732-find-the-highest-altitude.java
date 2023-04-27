class Solution {
    public int largestAltitude(int[] gain) {
        int n=gain.length;
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<=n;i++){
            max=Math.max(sum,max);
            if(i<n)
            sum+=gain[i];
        }
        return max;
    }
}