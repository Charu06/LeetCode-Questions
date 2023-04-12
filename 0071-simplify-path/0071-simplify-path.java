class Solution {
    public String simplifyPath(String path) {
        Stack<String> st=new Stack<>();
        String[] s=path.split("/");
        for(String i:s){
            if((!st.isEmpty())&&i.equals(".."))
                st.pop();
            else if(!i.equals("..")&&!i.equals(".")&&!i.equals(""))
                st.push(i);
        }
       return "/" + String.join("/",st);
    }
}