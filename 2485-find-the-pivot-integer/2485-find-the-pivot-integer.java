class Solution {
    public int pivotInteger(int n) {
        int s1=0, s2=(n*(n+1))/2;
        int i=1;
        while(s1<=s2){
            s1=s1+i;
            s2=s2-(i-1);
            if(s1==s2)
                return i;
            i++;
        }
        return -1;
    }
}