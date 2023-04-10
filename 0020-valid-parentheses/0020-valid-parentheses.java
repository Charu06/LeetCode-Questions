class Solution {
    public boolean isValid(String s) {
        List<Character> list=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('||ch=='['||ch=='{')
                list.add(ch);
            else if(list.isEmpty())
                return false;
            else if(ch==')' && list.remove(list.size()-1)!='(')
                return false;
            else if(ch=='}' && list.remove(list.size()-1)!='{')
                return false;
            else if(ch==']' && list.remove(list.size()-1)!='[')
                return false;
        }
        if(list.isEmpty())
            return true;
        else
            return false;
    }
}