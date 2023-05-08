class Solution {
    public int maxNumberOfBalloons(String text) {
        int f[]=new int[26];
        for(int i=0;i<text.length();i++){
            char ch=text.charAt(i);
            f[ch-97]++;
        }
        int min = f[1];//for b
        min = Math.min(min, f[0]);//for a
        min = Math.min(min, f[11] / 2);// for l /2 
        min = Math.min(min, f[14] / 2);//similarly for o/2
        min = Math.min(min, f[13]);//for n
        return min; 
    }
}