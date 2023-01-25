class Solution {
    public String truncateSentence(String s, int k) {
        String ar[]=new String [s.length()];
        ar=s.split(" ");
        String s1="";
        for(int i=0;i<k;i++)
            s1=s1+ar[i]+" ";
        return s1.trim();
    }
}