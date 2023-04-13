class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> st=new Stack<>();
        int j=0;
        int i=0;
        while(i<pushed.length){
            int n=pushed[i];
            st.push(n);
            while(!st.isEmpty() && st.peek()==popped[j]){
                st.pop();
                j++;
            }
            i++;
        }
        if(st.isEmpty())
            return true;
        else
            return false;
    }
}