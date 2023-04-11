class Solution {
    public String removeStars(String s) {
        Stack<Character> s1=new Stack<>();
        int i=0;
        while(i<s.length()){
            if(s.charAt(i)=='*')
                s1.pop();
            else
                s1.push(s.charAt(i));
            i++;
        }
        StringBuffer res=new StringBuffer("");
        while(!s1.empty())
            res.append(s1.pop());
        res.reverse();
        return res.toString();
    }
}