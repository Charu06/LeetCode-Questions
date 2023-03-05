class Solution {
    public boolean isPalindrome(String s) {
        String sb=s.toLowerCase();
        StringBuffer sb1=new StringBuffer("");
        for(int p=0;p<sb.length();p++){
            if(Character.isLetterOrDigit(sb.charAt(p)))
                sb1.append(sb.charAt(p));
        }
        StringBuffer sb2=new StringBuffer(sb1);
        if(sb1.reverse().toString().equals(sb2.toString()))
            return true;
        else
            return false;
    }
}