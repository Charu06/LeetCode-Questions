class Solution {
    public int divisorSubstrings(int num, int k) {
        String s=Integer.toString(num);
        int n=s.length();
        int c=0;
        for(int i=0;i<=n-k;i++){
            int n1=Integer.parseInt(s.substring(i,i+k));
            if(n1!=0 && num%n1==0)
                c++;
        }
        return c;
    }
}