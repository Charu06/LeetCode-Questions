class Solution {
    public int[] finalPrices(int[] prices) {
        Stack<Integer> st=new Stack<>();
        int res[]=new int[prices.length];
        st.push(0);
        for(int i=1;i<prices.length;i++){
            int j=i;
            while(j<prices.length-1 && prices[st.peek()]<prices[j])
                j++;
            if(prices[st.peek()]>=prices[j])
                res[i-1]=prices[st.pop()]-prices[j];
            else
                res[i-1]=prices[st.pop()];
            st.push(i);
        }
        res[prices.length-1]=prices[prices.length-1];
        return res;
    }
}