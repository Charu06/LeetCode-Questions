class Solution {
    public String removeDuplicateLetters(String s) {
        HashMap<Character, Integer> hm =new HashMap<>();
        for(int i=0;i<s.length();i++){
            hm.put(s.charAt(i),i);
        }
        ArrayDeque<Character> st=new ArrayDeque<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!st.contains(ch)){
                while(!st.isEmpty() && st.peek()>ch && hm.get(st.peek())>i)
                    st.pop();
                st.push(ch);
            }
        }
        StringBuffer res=new StringBuffer();
        for(char ch:st)
            res.append(ch);
        return res.reverse().toString();
    }
}