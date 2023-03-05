class Solution {
    public boolean isPalindrome(String s) {
        String s1=s.toLowerCase();
        int l=0, r=s1.length()-1;
        while(l<r){
            while(l<r&&!Character.isLetterOrDigit(s1.charAt(l)))
                l+=1;
            while(l<r&&!Character.isLetterOrDigit(s1.charAt(r)))
                r-=1;
            if(s1.charAt(l)!=s1.charAt(r))
                return false;
            l+=1;
            r-=1;
        }
        return true;
    }
}