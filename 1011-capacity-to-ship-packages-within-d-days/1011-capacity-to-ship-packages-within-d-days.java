class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int l=Integer.MIN_VALUE, r=0;
        for(int i=0;i<weights.length;i++){
            l=Math.max(weights[i],l);
            r=r+weights[i];
        }
        while(l<r){
            int m=(l+r)/2;
            if(feasible(m, weights, days))
                r=m;
            else
                l=m+1;
        }
        return l;
    }
    boolean feasible(int m, int weights[], int days){
        int d=1;
        int t=0;
        for(int i=0;i<weights.length;i++){
            t+=weights[i];
            if(t>m){
                t=weights[i];
                d+=1;  
                if(d>days)
                return false;
            }
        }
        return true;
    }
}