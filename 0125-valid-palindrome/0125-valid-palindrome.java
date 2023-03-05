class Solution {
    public boolean isPalindrome(String s) {
        String sb=s.toLowerCase();
        char ch[]=sb.toCharArray();
        StringBuffer sb1=new StringBuffer("");
        for(int p=0;p<ch.length;p++){
            if(Character.isLetterOrDigit(ch[p]))
                sb1.append(ch[p]);
        }
        if(sb1.toString().equals(sb1.reverse().toString()))
            return true;
        else
            return false;
    }
}