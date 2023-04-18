class Solution {
    public int[] finalPrices(int[] nums2) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<nums2.length;i++){
            while(!st.isEmpty() && nums2[st.peek()]>=nums2[i]){
                nums2[st.pop()]-= nums2[i];
            }
            st.push(i);
        }
        return nums2;
    }
}