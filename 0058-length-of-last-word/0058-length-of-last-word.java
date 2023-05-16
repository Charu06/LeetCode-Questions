class Solution {
    public int lengthOfLastWord(String s) {
        String s1=s.trim();
        int x=s1.lastIndexOf(" ");
        return s1.substring(x+1).length();
    }
}