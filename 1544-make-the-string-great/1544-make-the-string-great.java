class Solution {
    public String makeGood(String s) {
        Stack<Character> st=new Stack<>();
        st.push(s.charAt(0));
        for(int i=1;i<s.length();i++){
            char ch=s.charAt(i);
            if(!st.isEmpty()&&Math.abs(st.peek()-ch)==32)
                st.pop();
            else
                st.push(ch);
        }
        StringBuffer sb=new StringBuffer("");
        for(char c:st)
            sb.append(c);
        return sb.toString();
    }
}