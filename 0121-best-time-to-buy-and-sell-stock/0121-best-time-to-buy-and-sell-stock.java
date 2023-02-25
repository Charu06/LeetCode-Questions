class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0], maxp=0;
        for(int i=1;i<prices.length;i++){
                maxp=Math.max(maxp,prices[i]-min);
                min=Math.min(min,prices[i]);
        }
        return maxp;
    }
}