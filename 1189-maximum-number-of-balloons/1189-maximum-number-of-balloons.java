class Solution {
    public int maxNumberOfBalloons(String text) {
        int f[]=new int[26];
        for(int i=0;i<text.length();i++){
            char ch=text.charAt(i);
            f[ch-97]++;
        }
        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        String check = "balloon";
        for(int i=0;i<check.length();i++){
            char c=check.charAt(i);
            if(c!='l'&&c!='o')
                min1=Math.min(min1,f[c-97]);
            else
                min1=Math.min(min1,f[c-97]/2);
        }
        return min1;
    }
}